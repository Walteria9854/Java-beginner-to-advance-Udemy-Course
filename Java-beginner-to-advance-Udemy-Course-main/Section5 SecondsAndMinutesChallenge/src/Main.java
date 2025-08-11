public class Main {

//    public static void main(String[] args){
//
//        System.out.println(getDurationString(20, 10) + "h", getDurationString((20) * 60) + "m", getDurationString(20) + "s");
//    }
//
//    public static int getDurationString(int seconds){
//        if(seconds >= 0) {
//            return seconds;
//        } else {
//         System.out.println("Try it again");
//        }
//    }
//
//    public static int getDurationString(int minutes, int seconds){
//        if(minutes >= 0 && minutes <= 59) {
//            getDurationString((seconds * 60 + minutes) * 60);
//        }
//    }


    public static void main(String[] args){
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds){
        int mintues = seconds / 60;
        int hours = mintues / 60;
        System.out.println("hours = " + hours);

        int remianingMinutes = mintues % 60;
        System.out.println("reamainingMinutes = " + remianingMinutes);
        return "";
    }

    public static String getDurationString(int minutes, int seconds){
        int hours1 = seconds / 3600;
        System.out.println("hours1 = " + hours1);
        return "";


    }
}
