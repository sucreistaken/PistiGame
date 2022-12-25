import java.util.Scanner;
public class player1play {
    public static   String[]player1 = Deck.player1;
    // Deck dealcard = new Deck();
    public static String [] joker = {"Joker"};
    Scanner scanner = new Scanner(System.in);
    public static int decksonthetable =1;
    public static  Computer complay = new Computer();
    int x;
    public  void ChooseCard() {
        System.out.println("Ortaya kart atın");
        x = scanner.nextInt();
        if (x == 1 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable==1) {
            Deck.lastcard = player1[0];
            System.out.println("Table on the board" +  "*****" + Deck.lastcard + "*****" );
            System.out.println("piştiii");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if (x == 1 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable>1) {
            Deck.lastcard = player1[0];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            System.out.println("piştiii değil ama puan aldın");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable=0;
            complay.CompChoose();
        }
        else if((x == 1 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            Deck.lastcard = player1[0];
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if (x == 1 && player1[x - 1].charAt(0) != Deck.lastcard.charAt(0) && decksonthetable >= 0) {
            Deck.lastcard = player1[0];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable++;
            complay.CompChoose();
        }
        if (x == 2 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable==1) {
            Deck.lastcard = player1[1];
            System.out.println("piştii 33");
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;

            complay.CompChoose();
        }else if (x == 2 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable>1) {
            Deck.lastcard = player1[1];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            System.out.println("piştiii değil ama puan aldın");
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u+1 + ".= " +player1[u]);
                }
            }
            decksonthetable=0;
            complay.CompChoose();
        }
        else if((x == 2 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            Deck.lastcard = player1[1];
            System.out.println("Joker got the points");
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if (x == 2 && player1[x - 1].charAt(0) != Deck.lastcard.charAt(0) && decksonthetable >= 0) {
            Deck.lastcard = player1[1];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            System.out.println("Table on the board" + Deck.lastcard);
            decksonthetable++;
            complay.CompChoose();
        }
        if (x == 3&& Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable ==1) {
            Deck.lastcard = player1[2];
            System.out.println("piştii 33");
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }else if (x == 3 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable>1) {
            System.out.println("you got the point aa");
            Deck.lastcard = player1[2];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if((x == 3 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            Deck.lastcard = player1[2];
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else  if (x == 3 && player1[x - 1].charAt(0) != Deck.lastcard.charAt(0)) {
            Deck.lastcard = player1[2];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable++;
            complay.CompChoose();
        }
        if (x == 4 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable ==1) {
            Deck.lastcard = player1[3];
            player1[3] = null;
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            for (int u = 0; u < player1.length - 1; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else  if (x == 4 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable >1) {
            System.out.println("pişti yazdır");
            Deck.lastcard = player1[3];
            System.out.println("Table on the board" + "*****" +Deck.lastcard + "*****");
            player1[3] = null;
            for (int u = 0; u < player1.length - 1; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if((x == 4 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            Deck.lastcard = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable =0;
            complay.CompChoose();
        }
        else if (x == 4 && player1[x - 1].charAt(0) != Deck.lastcard.charAt(0)) {
            Deck.lastcard = player1[3];
            System.out.println("Table on the board" + Deck.lastcard);
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println("player 1 cards " + u + ".= " +player1[u]);
                }
            }
            decksonthetable++;
            complay.CompChoose();
        }
    }
}

