import java.util.Scanner;
public class Game {

    String player1[] = Deck.player1;
    Deck dealcard = new Deck();
    Scanner scanner = new Scanner(System.in);
    String board[] = Deck.board;



    String Tableboard = board[3];
    String myFirstcard = player1[0];
    String mySecondcard = player1[1];
    String myThirdcard = player1[2];
    String myFourthcard = player1[3];
    String lastcard;


    int x;

    public  void ChooseCard() {


        //  System.out.println("************************" +board[3]);
        //System.out.println("Ortaya kart atın");
        x = scanner.nextInt();
        System.out.println("seçtiğiniz kart" + player1[x - 1]);
        lastcard = player1[x-1];


        if (x == 1 && player1[x - 1].charAt(0) == board[3].charAt(0)) {
            System.out.println("Table on the board" + lastcard);
            System.out.println("piştiiiii");
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            ChooseCard();
        } else if (x == 1 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
            System.out.println("Table on the board   =" + lastcard);
            player1[0] = player1[1];
            player1[1] = player1[2];
            player1[2] = player1[3];
            player1[3] = null;
            for (int u = 0; u < player1.length; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            if (player1[0] == null) {
                System.out.println("kartlar dağıtılıyor ");
                dealcard.DealCards();
                // dealcard.DealCards();
            }
            ChooseCard();
        }
        if (x == 2 && player1[x - 1].charAt(0) == board[3].charAt(0)) {
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
            ChooseCard();
        }  else if (x == 2 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
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
            ChooseCard();
        }
        if (x == 3 && player1[x - 1].charAt(0) == board[3].charAt(0)) {
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
            ChooseCard();
        }
        if (x == 3 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
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
            ChooseCard();
        }
        if (x == 4 && player1[x - 1].charAt(0) == board[3].charAt(0)) {
            player1[0] = player1[0];
            player1[1] = player1[1];
            player1[2] = player1[2];
            player1[3] = null;

            for (int u = 0; u < player1.length - 1; u++) {
                if (player1[u] != null) {
                    System.out.println(player1[u]);
                }
            }
            ChooseCard();
        }  if (x == 4 && player1[x - 1].charAt(0) != board[3].charAt(0)) {
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
            ChooseCard();
        }
    }
}

