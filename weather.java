public class weather {
    
    public static void main() {
        boolean isRaining = false;
        boolean isSunny = false;
        boolean isCloudy = true;


        if (isRaining == true) {
            if (isSunny != true){
                if (isCloudy != true) {
                System.out.println("needs umbrella");
                }
            }
        }
        
        if (isSunny == true) {
            if (isRaining != true) {
                System.out.println("needs umbrella");
            }
        }

        if (isSunny == true) {
            if (isRaining == true) {
                System.out.println("summer shower");
            }
        }
        
        if (isCloudy == true) {
            if (isRaining == true) {
                System.out.println("rain all day");
            }
            else {
                System.out.println("prepare for rain");
            }
        }

        if (isSunny && isRaining) {
            System.out.println("summer shower");
        }
        else if (isSunny || isRaining) {
            System.out.println("needs umbrella");
        }
        else if (isCloudy && isRaining) {
            System.out.println("Rain all day");
        }
        else if (isCloudy) {
            System.out.println("prepare for rain")
        }
    }
}
