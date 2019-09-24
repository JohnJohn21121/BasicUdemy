public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-4);
        printYearsAndDays( 561600);
    }
    public static void printYearsAndDays( long minutes){

        if (minutes <0){
            System.out.println("Invalid Value");
        }else{
            long hours;
            hours = minutes / 60;
            long days;
            days = (hours / 24);
            long years;
            years = (days / 365);

            System.out.println( minutes + " min = " + years + " y and " + days%365 +" d");

        }
    }
}
