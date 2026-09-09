public class Grade {
    double average;
    String letter;
    
    public Grade(double average){
        this.average = average;
    }

    /*public void Grade(String letter){
        this.letter = letter;
    }

    public void Grade(double average, String letter){
        this.average = average;
        this.letter = letter;
    }*/

    public double getAverage(){
        return average;
    }

    public void setAverage(double average){
        this.average = average;
    }

    public void setLetter(){
        if (this.average >= 60){ //if (this.average >= 60)
            this.letter = "P";
        }
        else {
            this.letter = "F";
        }

    }

    public static void main(){
        Grade georgeGrade = new Grade(95);
    }
}
