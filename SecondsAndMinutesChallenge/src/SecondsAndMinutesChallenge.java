public class SecondsAndMinutesChallenge {

    public static boolean getDurationString(int minutes, int seconds){
        /*if ((minutes >=0) || (seconds >=0) || ( seconds<=59 ));
        System.out.println("Invalid Value");
        return true;
        {else if ((minutes < 0) || );
        }*/
        return false;
    }

    public static boolean getDurationString(int seconds) {

        /*if (seconds < 0 || seconds > 59) {
            System.out.println("hello world");
        } if else () {

        } if else () {

        } if else () {

        } if else () {

        } if else () {

        } if else () {

        } if else () {

        } else {
            return false;
        }*/
        return false;

    }

    public void printLetter(String letter) {
        if (letter.length() == 1) {
            if (letter.toLowerCase().contains("d")) {
                System.out.println("that's the initial letter of my name!");
            } else if (letter.toLowerCase().contains("j")) {
                System.out.println("that's the initial letter of my friend's name!");
            } else {
                System.out.println(letter);
            }
        } else if (letter.length() == 0) {
            System.out.println("you entered an empty string");
        } else {
            System.out.println("you entered more than one letter");
        }
    }
}
