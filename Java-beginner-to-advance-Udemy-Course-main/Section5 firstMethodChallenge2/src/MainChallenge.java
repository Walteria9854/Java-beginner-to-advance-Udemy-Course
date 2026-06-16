public class MainChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePostion("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePostion("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePostion("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePostion("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePostion("James", highScorePosition);

    }

    public static void displayHighScorePostion(String playerName, int highScorePosition ){
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }

        if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }

        if(playerScore >= 100 && playerScore < 500){
            return 3;
        }

        else{
            return 4;
        }

        //Other way

//        if(playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if(playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

    }

}
