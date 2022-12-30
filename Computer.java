
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Computer {
    String[] player2 = Deck.player2;
    public static Deck deaalcard1 = new Deck();
    public static String[] joker = {"Joker"};
    Random rd = new Random();
    public static Player1play choosecard = new Player1play();
    public static Player1play tableon = new Player1play();
    public static String lastcardcomp;


    // elindeiki tane joker varsa o durumu kontrol et bir daha joker atabiliyor
    public void CompChoose() {
        if ((player2[0].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1) {
            Deck.lastcard = player2[0];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            PointsSystem.pointscmp += 10;
            System.out.println("COMPUTER CHOOSED" + player2[0]);
            System.out.println("COMPUTER GOT THE POİNT");
            Playerhands.player2Hands();
            PointsSystem.Collectcardsscmp();
            tableon.decksonthetable = 0;
            if (player2[0] == null) {
                deaalcard1.DealCards();
            }
            choosecard.ChooseCard();
        } else if (player2[1] != null && (player2[1].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("COMPUTER CHOOSED" + player2[1]);
            System.out.println("COMPUTER GOT THE POİNT");
            PointsSystem.pointscmp += 10;
            Playerhands.player2Hands2();
            PointsSystem.Collectcardsscmp();
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[2] != null && (player2[2].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1) {
            Deck.lastcard = player2[2];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("COMPUTER CHOOSED" + player2[2]);
            System.out.println("COMPUTER GOT THE POİNT");
            Playerhands.player2Hands3();
            PointsSystem.pointscmp += 10;
            PointsSystem.Collectcardsscmp();
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[3] != null && (player2[3].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1) {
            Deck.lastcard = player2[3];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("COMPUTER CHOOSED" + player2[3]);
            System.out.println("COMPUTER GOT THE POİNT");
            PointsSystem.pointscmp += 10;
            player2[3] = null;
            PointsSystem.Collectcardsscmp();
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } //burdan sonrası farklı
        else if ((player2[0].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1) {
            Deck.lastcard = player2[0];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("computer choosedddddd" + player2[0]);
            System.out.println("COMPUTER GOT THE CARDS");
            Playerhands.player2Hands();
            PointsSystem.pointscmp += tableon.decksonthetable;
            PointsSystem.Collectcardsscmp();
            tableon.decksonthetable = 0;
            if (player2[0] == null) {
                deaalcard1.DealCards();
            }
            choosecard.ChooseCard();
        } else if (player2[1] != null && (player2[1].charAt(0) == Deck.lastcard.charAt(0) && tableon.decksonthetable > 1)) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("computer choosedddddd" + player2[1]);
            System.out.println("COMPUTER GOT THE CARDS");
            Playerhands.player2Hands2();
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[2] != null && (player2[2].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1) {
            Deck.lastcard = player2[2];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("computer choosedddddd" + player2[2]);
            System.out.println("COMPUTER GOT THE CARDS");
            Playerhands.player2Hands3();
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[3] != null && (player2[3].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1) {
            Deck.lastcard = player2[3];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("computer choosedddddd" + player2[3]);
            System.out.println("COMPUTER GOT THE CARDS");
            player2[3] = null;
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[0].charAt(0) == joker[0].charAt(0)) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("Computer COLLECTED WİTH JOKER");
            Playerhands.player2Hands();
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            if (player2[0] == null) {
                deaalcard1.DealCards();
            }
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[1] != null && player2[1].charAt(0) == joker[0].charAt(0)) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("Computer COLLECTED WİTH JOKER");
            Playerhands.player2Hands2();
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[2] != null && player2[2].charAt(0) == joker[0].charAt(0)) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("Computer COLLECTED WİTH JOKER");
            Playerhands.player2Hands3();
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else if (player2[3] != null && player2[3].charAt(0) == joker[0].charAt(0)) {
            Deck.lastcard = player2[1];
            PointsSystem.Calculatepointscmpwithoutpoint(Deck.lastcard);
            System.out.println("Computer COLLECTED WİTH JOKER");
            player2[3] = null;
            PointsSystem.Collectcardsscmp();
            PointsSystem.pointscmp += tableon.decksonthetable;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } else {
            int a = rd.nextInt(player2.length - 1);
            while (player2[a] == null) {
                a = rd.nextInt(player2.length - 1);
            }
            System.out.println("computer choosed" + player2[a]);
            lastcardcomp = player2[a];
            if ((a == 0)) { 
                Deck.lastcard = player2[0];
                Playerhands.player2Hands();
                PointsSystem.Calculatepointscmp();
                tableon.decksonthetable++;
                if (player2[0] == null) {
                    deaalcard1.DealCards();
                }
                if (player2[0] != null || a != 0) {
                    choosecard.ChooseCard();
                }
            } else if ((a == 1)) {
                Deck.lastcard = player2[1];
                Playerhands.player2Hands2();
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            } else if ((a == 2)) {
                Deck.lastcard = player2[2];
                Playerhands.player2Hands3();
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            } else if ((a == 3)) {
                Deck.lastcard = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            }
        }
    }
}






