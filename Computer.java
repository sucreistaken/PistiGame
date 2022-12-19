import java.util.Random;

public class Computer {
    String player2[] = Deck.player2;
    Deck deaalcard1 = new Deck();
    String deck1[] = Deck.deck;
    Game lastcardp1 = new Game();
    String joker[] = {"Joker"};
    Random rd = new Random();
   public static String lastcardcmp ;


    public void CompChoose() {
        int a = rd.nextInt(player2.length);
        System.out.println("The computer has been choosed" + player2[a]);
        lastcardcmp = player2[a];


            for (int u = 0; u < player2.length; u++) {
                if (player2[u] = lastcardp1.lastcard) {
                    System.out.println("pistii");
                    if (u == 0) {
                        player2[0] = player2[1];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                    } else if (u == 1) {
                        player2[0] = player2[0];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;

                    } else if (u == 2) {
                        player2[0] = player2[0];
                        player2[1] = player2[1];
                        player2[2] = player2[3];
                        player2[3] = null;
                    } else
                    player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[2];
                    player2[3] = null;

                } else if (player2[u].charAt(0) == joker[0].charAt(0)) {
                    if (u == 0) {
                        player2[0] = player2[1];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;
                    } else if (u == 1) {
                        player2[0] = player2[0];
                        player2[1] = player2[2];
                        player2[2] = player2[3];
                        player2[3] = null;

                    } else if (u == 2) {
                        player2[0] = player2[0];
                        player2[1] = player2[1];
                        player2[2] = player2[3];
                        player2[3] = null;
                    } else
                        player2[0] = player2[0];
                    player2[1] = player2[1];
                    player2[2] = player2[2];
                    player2[3] = null;


                }
            }

            if ((a == 0) && player2[a] == lastcardp1.lastcard) { //masadaki kart değişecek ve başka kart var mı diye bakılacak bir metod daha ekliceksin o şekilde
                System.out.println("pişti");
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;

            } else if ((a == 0) && player2[a].charAt(0) = joker[0].charAt(0)) {
                System.out.println("Player 2 got the point with J");
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
            } else if (a == 0) {
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
            }


            if ((a == 1) && player2[a] == lastcardp1.lastcard) {
                System.out.println("pişti");
                player2[0] = player2[0];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
            } else if ((a == 1) && player2[a].charAt(0) = joker[0].charAt(0)) {
                System.out.println("Player 2 got the point with J");
                player2[0] = player2[0];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
            } else if (a == 1) {
                player2[0] = player2[0];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
            }


            if ((a == 2) && player2[a] == lastcardp1.lastcard) {
                System.out.println("pişti");
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
            } else if ((a == 2) && player2[a].charAt(0) = joker[0].charAt(0)) {
                System.out.println("Player 2 got the point with J");
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
            } else if (a == 2) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[3];
                player2[3] = null;
            }
            if ((a == 3) && player2[a] == lastcardp1.lastcard) {
                System.out.println("pişti");
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
            } else if ((a == 3) && player2[a].charAt(0) = joker[0].charAt(0)) {
                System.out.println("Player 2 got the point with J");
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
            } else if (a == 3) {
                player2[0] = player2[0];
                player2[1] = player2[1];
                player2[2] = player2[2];
                player2[3] = null;
            }
        }
    }
}


