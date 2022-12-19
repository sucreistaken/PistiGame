import java.util.Scanner;
public class Game {
    String player1[] = Deck.player1;
    // Deck dealcard = new Deck();
    String joker[] = {"Joker"};
    Scanner scanner = new Scanner(System.in);
    String board[] = Deck.board;
    public int decksonthetable =0;
    String Tableboard = board[3];
    public String lastcard;
    int x;
    public  void ChooseCard() {
        //  System.out.println("************************" +board[3]);
        //System.out.println("Ortaya kart atın");
        x = scanner.nextInt();
        System.out.println("seçtiğiniz kart" + player1[x - 1]);
        lastcard = player1[x-1];
        if (x == 1 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable==1) {
            System.out.println("Table on the board" + lastcard);
            System.out.println("piştiii");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            board[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            // ChooseCard();
            decksonthetable =0;
        }else if (x == 1 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable>1) {
            System.out.println("Table on the board" + lastcard);
            System.out.println("piştiii değil ama puan aldın");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            board[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
        }
        else if((x == 1 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
        }
        else if (x == 1 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
            System.out.println("Table on the board   =" + lastcard);
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            board[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            if (player1[0] == null) {
                System.out.println("kartlar dağıtılıyor ");
                //  dealcard.DealCards();
                // dealcard.DealCards();
            }
            decksonthetable++;

        }
        if (x == 2 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable==1) {
            System.out.println("Table on the board" + lastcard);
            System.out.println("piştiii");
            player1[0] = player1[0];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            // ChooseCard();
            decksonthetable =0;
        }else if (x == 2 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable>1) {
            System.out.println("Table on the board" + lastcard);
            System.out.println("piştiii değil ama puan aldın");
            player1[0] = player1[0];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
        }
        else if((x == 2 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            player1[0] = player1[0];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
        }
        else if (x == 2 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
            player1[0] = player1[0];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            System.out.println("Table on the board" + lastcard);
            //ChooseCard();
            decksonthetable++;
        }
        if (x == 3 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable ==1) {
            System.out.println("Table on the board" + lastcard);
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
            //ChooseCard();
        }if (x == 3 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable >1) {
            System.out.println("Table on the board" + lastcard);
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
            //ChooseCard();
        }
        else if((x == 3 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
        }
        else  if (x == 3 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
            System.out.println("Table on the board" + lastcard);
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[3];
            player1[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            // ChooseCard();
            decksonthetable++;
        }
        if (x == 4 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable ==1) {
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[2];
            player1[3] = null;

            for (int u = 0; u < player1.length - 1; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            //
            decksonthetable =0;
        }
        else  if (x == 4 && player1[x - 1].charAt(0) == board[3].charAt(0) && decksonthetable >1) {
            System.out.println("pişti yazdır");
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[2];
            player1[3] = null;

            for (int u = 0; u < player1.length - 1; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            //
            decksonthetable =0;
        }
        else if((x == 4 && player1[x - 1].charAt(0) == joker[0].charAt(0))){
            System.out.println("Joker got the points");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            decksonthetable =0;
        }
        else if (x == 4 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
            System.out.println("Table on the board" + lastcard);
            player1[0] = player1[0];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;

            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            //ChooseCard();
            decksonthetable++;
        }
    }
}

