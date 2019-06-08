public class Main {
    public static void main(String args[]){
/*
        boolean gameover=true;
        int Score=800;
        int LevelCompleted=5;
        int bonus=100;

        if(gameover){

            int finalScore=Score+ (LevelCompleted*bonus);
            System.out.println("final score is"+finalScore);
        }

        Score = 10000;
        LevelCompleted = 8;
        bonus = 20;


        if(gameover) {

            int finalScore=Score+ (LevelCompleted*bonus);
            System.out.println("Your final score is"+finalScore);
        }*/

    String playerName="sunil";
    int position=calculateHighScorePosition(900);
    displayHighScorePosition(playerName,position);



    }
    public static void displayHighScorePosition(String playerName,int position){
        System.out.println("player:\t"+playerName+"managed to get into the position\t"+position+"on the HS table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }else if(playerScore>500 && playerScore<1000){
            return 2;
        }
        else if(playerScore>100 && playerScore<500){
            return 3;
        }
        else{
            return 4;
        }

    }
}
