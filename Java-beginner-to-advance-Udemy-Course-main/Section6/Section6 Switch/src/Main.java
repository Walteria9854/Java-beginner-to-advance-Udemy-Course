public class Main {

    public static void main(String[] args){

//      int value = 2;
//      if(value == 1){
//          System.out.println("Value was 1");
//      }else if( value == 2){
//          System.out.println("value was 2");
//      }else{
//          System.out.println("Was not 1 or 2");
//      }

        int switchvalue = 3;
        switch (switchvalue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
              System.out.println("Value was 2");
              break;
            case 3: case 4: case 5:
              System.out.println("Was a 3, 4, or 5");
              System.out.println("Actually it as a " + switchvalue);
            default:
              System.out.println("Was not 1 or 2");
              break;

        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
//        switch(month){
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd";
//            case "October":
//            case "November":
//            case "December":
//                return "4th";
//        }
//        return "bad";
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        } ;
    }
}
