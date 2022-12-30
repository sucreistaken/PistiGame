import javax.xml.transform.sax.SAXSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player1play {
    public static String[] player1 = Deck.player1;
    // Deck dealcard = new Deck();
    public static String[] joker = {"Joker"};
    Scanner scanner = new Scanner(System.in);
    public static int decksonthetable = 1;
    public static Computer complay = new Computer();
    int x;
    public void ChooseCard() {
        while (true) {
            System.out.println("Ortaya kart atın");
            try {
                x = scanner.nextInt();
                if (x > 4 || x < 0) {
                    System.out.println("Please Enter a valid number");
                    x = scanner.nextInt();
                    break;
                }
                break;
            } catch (Exception e) {
                scanner.nextLine();
            }
        }

        try {
            if (x == 1 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable == 1) {
                Deck.lastcard = player1[0];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                PointsSystem.pointsp1 += 10;
                System.out.println("PİŞTİİİİİ");
                Playerhands.player1Hands();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 1 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable > 1) {
                Deck.lastcard = player1[0];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("YOU GOT THE CARDS");
                Playerhands.player1Hands();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if ((x == 1 && player1[x - 1].charAt(0) == joker[0].charAt(0))) {
                Deck.lastcard = player1[0];
                System.out.println("YOU GOT THE CARDS WİTH JOKER");
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                Playerhands.player1Hands();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 1) {
                Deck.lastcard = player1[0];
                System.out.println("Table on the board" + "*****" + Deck.lastcard + "*****");
                Playerhands.player1Hands();
                PointsSystem.PrintP1hand();
                decksonthetable++;
                complay.CompChoose();
            }
            if (x == 2 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable == 1) {
                Deck.lastcard = player1[1];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("PİŞTİİİİİ");
                PointsSystem.pointsp1 += 10;
                Playerhands.player1Hands2();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 2 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable > 1) {
                Deck.lastcard = player1[1];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("YOU GOT THE CARDS WİTH JOKER");
                Playerhands.player1Hands2();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if ((x == 2 && player1[x - 1].charAt(0) == joker[0].charAt(0))) {
                Deck.lastcard = player1[1];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("You got the Cards with joker");
                Playerhands.player1Hands2();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 2) {
                Deck.lastcard = player1[1];
                System.out.println("Table on the board" + "*****" + Deck.lastcard + "*****");
                Playerhands.player1Hands2();
                PointsSystem.PrintP1hand();
                decksonthetable++;
                complay.CompChoose();
            }
            if (x == 3 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable == 1) {
                Deck.lastcard = player1[2];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("PİŞTİİİİİ");
                PointsSystem.pointsp1 += 10;
                Playerhands.player1Hands3();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 3 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable > 1) {
                Deck.lastcard = player1[2];
                System.out.println("YOU GOT THE CARDS");
                Playerhands.player1Hands3();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if ((x == 3 && player1[x - 1].charAt(0) == joker[0].charAt(0))) {
                System.out.println("Joker got the points");
                Deck.lastcard = player1[2];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                Playerhands.player1Hands3();
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 3) {
                Deck.lastcard = player1[2];
                System.out.println("Table on the board" + "*****" + Deck.lastcard + "*****");
                Playerhands.player1Hands3();
                PointsSystem.PrintP1hand();
                decksonthetable++;
                complay.CompChoose();
            }
            if (x == 4 && Deck.lastcard != null && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable == 1) {
                Deck.lastcard = player1[3];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("PİŞTİİİİi");
                PointsSystem.pointsp1 += 10;
                player1[3] = null;
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 4 && player1[x - 1].charAt(0) == Deck.lastcard.charAt(0) && decksonthetable > 1) {
                Deck.lastcard = player1[3];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                System.out.println("YOU GOT THE CARDS");
                player1[3] = null;
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if ((x == 4 && player1[x - 1].charAt(0) == joker[0].charAt(0))) {
                System.out.println("Joker got the points");
                Deck.lastcard = player1[3];
                PointsSystem.Calculatepointsp1(Deck.lastcard);
                player1[3] = null;
                PointsSystem.PrintP1hand();
                PointsSystem.Collectcardssp1();
                PointsSystem.pointsp1 += decksonthetable;
                decksonthetable = 0;
                complay.CompChoose();
            } else if (x == 4) {
                Deck.lastcard = player1[3];
                System.out.println("Table on the board" + Deck.lastcard);
                player1[3] = null;
                PointsSystem.PrintP1hand();
                decksonthetable++;
                complay.CompChoose();
            }
        } catch (NullPointerException e) {
            if (x == 4 && player1[3] == null) {
                System.out.println("Wrong Card");
                ChooseCard();
            } else if (x == 3 && player1[2] == null) {
                System.out.println("Wrong Card");
                ChooseCard();
            } else if (x == 2 && player1[1] == null) {
                System.out.println("Wrong Card");
                ChooseCard();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("*********GAME OVER *********");
        } catch (InputMismatchException e) {
            ChooseCard();
        } catch (Exception e) {
            if (Deck.counter < 52) {
                x = scanner.nextInt();
            }
        }
    }
}

