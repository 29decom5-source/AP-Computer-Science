public class Grade {
    double average;
    String letter;
    
    public Grade(double average){
        this.average = average;
    }

    public Grade(String letter){
        this.letter = letter;
    }

    public Grade(double average, String letter){
        this.average = average;
        this.letter = letter;
    }

    public double getAverage(){
        return average;
    }

    public void setAverage(double average){
        this.average = average;
    }

    public void setPassFail(){
        if (this.average >= 60){ //if (this.average >= 60)
            this.letter = "P";
        }
        else {
            this.letter = "F";
        }
    }
    public void setLetter(){


        if (this.average >= 90) {
            this.letter = "A";
        }
        if (this.average >= 80) {
            if (this.average < 90) {
                this.letter = "B";
            }
        }
        if (this.average >= 70) {
            if (this.average < 80) {
                this.letter = "C";
            }
        }
        if (this.average >= 60) {
            if (this.average < 70) {
                this.letter = "D";
            }
        }
        else {
            this.letter = "F";
        }
        /*if (this.average >=  90){
            this.letter = "A";
        }
        else if (this.average >= 80) {
            this.letter = "B";
        }
        else if (this.average >= 70) {
            this.letter = "C";
        }
        else if (this.average >= 60) {
            this.letter = "D";
        }
        else {
            this.letter = "F";
        }
    }

    

    public static void main(){
        Grade georgeGrade = new Grade(95);
    }*/
}
