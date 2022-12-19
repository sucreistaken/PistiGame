import java.util.Random;

public class Computer {
    String player2[] = Deck.player2;
    Deck deaalcard1 = new Deck();
    String deck1[] = Deck.deck;
    Game lastcardp1 = new Game();
    String joker[] = {"Joker"};
    Random rd = new Random();
    public static String lastcardcmp ;
    Game choosecard = new Game();
    Game tableon = new Game();



    public void CompChoose() {
        int a = rd.nextInt(player2.length-1);
        //lastcardcmp = player2[a];
        for (int u = 0; u < player2.length-1; u++) {
            if (player2[u] != null){


                if (player2[u].equals(lastcardp1.lastcard)) {
                    System.out.println("pistii");
                    if (u == 0) {
                        player2[0] = player2[1];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;
                    } else if (u == 1) {
                        player2[0] = player2[0];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;
                    } else if (u == 2) {
                        player2[0] = player2[0];
                        player2[1] = player2[1];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;
                    } else
                        player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[2];
                    player2[3] = null;
                    tableon.decksonthetable=0;

                } else if (player2[u].charAt(0) == joker[0].charAt(0)) {
                    if (u == 0) {
                        player2[0] = player2[1];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;

                    } else if (u == 1) {
                        player2[0] = player2[0];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;

                    } else if (u == 2) {
                        player2[0] = player2[0];
                        player2[1] = player2[1];
                        player2[2] = player2[3];
                        player2[3] = null;
                        tableon.decksonthetable=0;
                    } else
                        player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[2];
                    player2[3] = null;
                    tableon.decksonthetable=0;


                }
                else
                if ((a == 0)) { //masadaki kart değişecek ve başka kart var mı diye bakılacak bir metod daha ekliceksin o şekilde
                    player2[0] = player2[1];
                    player2[1] = player2[2];
                    player2[2] = player2[3];
                    player2[3] = null;
                    if(player2[0] == null){
                        deaalcard1.DealCards();
                    }
                    tableon.decksonthetable++;
                }
                else if ((a == 1)) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable++;
                }

                else if ((a == 2)) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[3];
                    player2[3] = null;
                    tableon.decksonthetable++;
                }
                if ((a == 3)) {
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[2];
                    player2[3] = null;
                    tableon.decksonthetable++;
                }
            }
        }
    }
}



