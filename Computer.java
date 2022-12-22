import java.util.Random;

public class Computer {
    String player2[] = Deck.player2;

    public static Deck deaalcard1 = new Deck();
    public static player1play lastcardp1 = new player1play();
    public static String joker[] = {"Joker"};
    Random rd = new Random();
    public static player1play choosecard = new player1play();
    public static player1play tableon = new player1play();

    public static String lastcardcomp;

    public void CompChoose() {
        if ((player2[0].charAt(0) == Deck.lastcard.charAt(0))) {
            System.out.println("computer choosedddddd" + player2[0]);
            player2[0] = player2[1];
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            if (player2[0] == null){
                deaalcard1.DealCards();
            }
            choosecard.ChooseCard();
        }  else if (player2[1] != null &&(player2[1].charAt(0) == Deck.lastcard.charAt(0))){
            System.out.println("computer choosedddddd" + player2[1]);
            player2[0] = player2[0];
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if (player2[2] != null &&(player2[2].charAt(0) == Deck.lastcard.charAt(0))){
            System.out.println("computer choosedddddd" + player2[2]);
            player2[0] = player2[0];
            player2[1] = player2[1];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if( player2[3] != null &&(player2[3].charAt(0) == Deck.lastcard.charAt(0))){
            System.out.println("computer choosedddddd" + player2[3]);
            player2[0] = player2[0];
            player2[1] = player2[1];
            player2[2] = player2[2];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
           /*else if (player2[u].equals(Deck.lastcard) && tableon.decksonthetable > 1) {
                System.out.println("pistii");

                if (u == 0) {
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    System.out.println("computer choosedddddd" + player2[u]);
                    choosecard.ChooseCard();
                    break;
                } else if (u == 1) {
                    player2[0] = player2[0];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    System.out.println("computer choosed" + player2[u]);
                    choosecard.ChooseCard();

                    break;
                } else if (u == 2) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    System.out.println("computer choosed" + player2[u]);
                    choosecard.ChooseCard();
                    break;
                } else
                    player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                tableon.decksonthetable = 0;
                System.out.println("computer choosed" + player2[u]);
                choosecard.ChooseCard();
                break;

            }
          else if (player2[u].charAt(0) == joker[0].charAt(0)) {
                System.out.println("computer choosed" + player2[u]);
                if (u == 0) {
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    choosecard.ChooseCard();
                    break;

                } else if (u == 1) {
                    player2[0] = player2[0];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    choosecard.ChooseCard();
                    break;


                } else if (u == 2) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                } else
                    player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                choosecard.ChooseCard();
                break;
            }
*/
        else {
            int a = rd.nextInt(player2.length - 1);
            System.out.println("computer choosed" + player2[a]);
            lastcardcomp = player2[a];
            if ((a == 0)) { //masadaki kart değişecek ve başka kart var mı diye bakılacak bir metod daha ekliceksin o şekilde
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                if(player2[0] == null){
                    deaalcard1.DealCards();
                }
                choosecard.ChooseCard();
            } else if ((a == 1)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            } else if ((a == 2)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            }
            if ((a == 3)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            }
        }
    }
}




