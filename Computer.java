import java.util.Random;

public class Computer {
    String player2[] = Deck.player2;

    public static Deck deaalcard1 = new Deck();
    public static player1play lastcardp1 = new player1play();
    public static  String joker[] = {"Joker"};
    Random rd = new Random();
    public static  player1play choosecard = new player1play();
    public static player1play tableon = new player1play();

    public  static String lastcardcomp;

    public void CompChoose() {
        int a = rd.nextInt(player2.length-1);
        for (int u = 0; u < player2.length-1; u++) {
            if (player2[u].equals(Deck.lastcard) && tableon.decksonthetable == 1) {
                System.out.println("pistii");
                if (u == 0) {
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    System.out.println("computer choosedddddd" + player2[u]);
                    Deck.lastcard = player2[u];
                    choosecard.ChooseCard();
                    break;
                } else if (u == 1) {
                    player2[0] = player2[0];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    choosecard.ChooseCard();
                    System.out.println("computer choosedddddd" + player2[u]);

                    break;
                } else if (u == 2) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    System.out.println("computer choosedddddd" + player2[u]);
                    choosecard.ChooseCard();

                    break;
                }

                else
                    player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                tableon.decksonthetable = 0;
                System.out.println("computer choosedddddd" + player2[u]);
                Deck.lastcard = player2[u];
                choosecard.ChooseCard();
                break;
            }
            else if (player2[u].equals(Deck.lastcard) && tableon.decksonthetable >= 1) {
                System.out.println("pistii");

                if (u == 0) {
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    System.out.println("computer choosedddddd" + player2[u]);
                    choosecard.ChooseCard();
                    break;
                } else if (u == 1) {
                    player2[0] = player2[0];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    System.out.println("computer choosed" + player2[u]);
                    choosecard.ChooseCard();

                    break;
                } else if (u == 2) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    System.out.println("computer choosed" + player2[u]);
                    choosecard.ChooseCard();
                    break;
                } else
                    player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                tableon.decksonthetable = 0;
                Deck.lastcard = player2[u];
                System.out.println("computer choosed" + player2[u]);
                choosecard.ChooseCard();
                break;

            } else if (player2[u].charAt(0) == joker[0].charAt(0)) {
                System.out.println("computer choosed" + player2[u]);
                if (u == 0) {
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    choosecard.ChooseCard();
                    break;

                } else if (u == 1) {
                    player2[0] = player2[0];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    choosecard.ChooseCard();
                    break;


                } else if (u == 2) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable = 0;
                    Deck.lastcard = player2[u];
                    choosecard.ChooseCard();
                } else
                    player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                choosecard.ChooseCard();
                break;

            }

            else
                System.out.println("computer choosed" + player2[a]);
            if ((a == 0)) { //masadaki kart değişecek ve başka kart var mı diye bakılacak bir metod daha ekliceksin o şekilde
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
                Deck.lastcard = player2[a];
                tableon.decksonthetable++;
            }
            else if ((a == 1)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                Deck.lastcard = player2[a];
                choosecard.ChooseCard();
            }

            else if ((a == 2)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                Deck.lastcard = player2[a];
                choosecard.ChooseCard();
            }
            if ((a == 3)) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
                tableon.decksonthetable++;
                Deck.lastcard = player2[a];
                choosecard.ChooseCard();
            }





        }
    }
}




