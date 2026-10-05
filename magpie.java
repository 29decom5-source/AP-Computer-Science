//theme || instruments

import java.util.Scanner;

public class magpie {


    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, we will be discussing musical instruments. \nPlease tell me what instrument you would like to discuss and I will tell you my opinion of it.");
        String instrument = sc.nextLine();
        String keywords = magpie.getresponse(instrument);
        if (keywords != "none") {
            System.out.println(keywords);
        }
        else {
            String random = magpie.randomresponse();
            System.out.println(random);
        } 
    }

    public static String getresponse(String instrument) {
        String lowerstring = instrument.toLowerCase();
        int clarinet = lowerstring.indexOf("clarinet");
        int flute = lowerstring.indexOf("flute");
        int french_horn = lowerstring.indexOf("french horn");
        int violin = lowerstring.indexOf("violin");
        if (clarinet >= 0) {
            return "Oh My! Clarient is my favorite instrument \n(And is objectively the best instrument)";
        }
        else if (flute >= 0 ) {
            return "The Flute is an amazing instrument, maybe a little overated but still a good choice";
        }
        else if (french_horn >= 0) {
            return "Personally, a great instrument, I personally think it is the BEST brass instrument";
        }
        else if (violin >= 0) {
            return "Honestly, its the only string instrument most people know \n(And for good reason, its amazing)";
        }
        else {
            return "none";
        }
    }

    public static String randomresponse(){
        int getrandomresponse = (int) (Math.random()*4) + 1;
        //System.out.println(getrandomresponse);

        if (getrandomresponse == 1) {
            //positive
            return "Yes, that is one of my favorite instruments \nIt makes a really nice sound";
        }
        else if (getrandomresponse == 2) {
            //negative
            return "Honestly, I'm not a fan. I can see how some people may like it and it CAN be useful, \nBut i feel it tends to sound off and just makes the overall band worse";
        }
        else if (getrandomresponse == 3) {
            return "I've never actually heard that instrument before. I will go look into that instrument";
        }
        else if (getrandomresponse == 4) {
            return "Honestly, it depends heavily as a player rather than the instrument. \nIf it is a good player, it will sound good. \nIf it is a bad player, It will sound bad.";
        }
        else {
            return "ERROR, WRONG RANDOM NUMBER";
        }
    }
}