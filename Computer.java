
import java.util.Random;

public class Computer {
    String [] player2 = Deck.player2;
    public static Deck deaalcard1 = new Deck();
    public static String[] joker = {"Joker"};
    Random rd = new Random();
    public static player1play choosecard = new player1play();
    public static player1play tableon = new player1play();
    public static String lastcardcomp;


    // elindeiki tane joker varsa o durumu kontrol et bir daha joker atabiliyor
    public void CompChoose() {
        if ((player2[0].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1) {
            Deck.lastcard = player2[1];
            System.out.print("computer choosedddddd" + player2[0]);
            System.out.println("************************");
            System.out.println("Computer got the point");
            System.out.println("***********************");
            player2[0] = player2[1];
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            if (player2[0] == null){
                choosecard.ChooseCard();
            }
        }  else if (player2[1] != null &&(player2[1].charAt(0) == Deck.lastcard.charAt(0))&& tableon.decksonthetable == 1){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[1]);
            System.out.println("computer got the point");
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if (player2[2] != null &&(player2[2].charAt(0) == Deck.lastcard.charAt(0))&& tableon.decksonthetable == 1){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[2]);
            System.out.println("computer got the point");
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if( player2[3] != null &&(player2[3].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable == 1){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[3]);
            System.out.println("computer got the point");
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        } //burdan sonrası farklı
        else if ((player2[0].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1) {
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[0]);
            System.out.println("got the point but less");
            player2[0] = player2[1];
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            if (player2[0] == null){
                System.out.println("*****************");
                System.out.println("Cards are dealing");
                System.out.println("*****************");
                deaalcard1.DealCards();
            }
            choosecard.ChooseCard();
        }  else if (player2[1] != null &&(player2[1].charAt(0) == Deck.lastcard.charAt(0) && tableon.decksonthetable > 1)){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[1]);
            System.out.println("got the point but less");
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if (player2[2] != null &&(player2[2].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[2]);
            System.out.println("got the point but less");
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if( player2[3] != null &&(player2[3].charAt(0) == Deck.lastcard.charAt(0)) && tableon.decksonthetable > 1){
            Deck.lastcard = player2[1];
            System.out.println("computer choosedddddd" + player2[3]);
            System.out.println("got the point but less");
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if (player2[0].charAt(0) == joker[0].charAt(0) && tableon.decksonthetable >= 1){
            Deck.lastcard = player2[1];
            System.out.println("jokerle alındı");
            player2[0] = player2[1];
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            if (player2[0] == null){
                deaalcard1.DealCards();
            }
            choosecard.ChooseCard();
        }
        else if (player2[1] != null && player2[1].charAt(0) == joker[0].charAt(0) && tableon.decksonthetable >= 1){
            Deck.lastcard = player2[1];
            System.out.println("jokerle alındı");
            player2[1] = player2[2];
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if (player2[2] != null && player2[2].charAt(0) == joker[0].charAt(0) && tableon.decksonthetable >= 1){
            Deck.lastcard = player2[1];
            System.out.println("jokerle alındı");
            player2[2] = player2[3];
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else if(player2[3] != null && player2[3].charAt(0) == joker[0].charAt(0) && tableon.decksonthetable >= 1){
            Deck.lastcard = player2[1];
            System.out.println("jokerle alındı");
            player2[3] = null;
            tableon.decksonthetable = 0;
            choosecard.ChooseCard();
        }
        else  {
            int a  = rd.nextInt(player2.length - 1);
            while (player2[a] == null) {
                a  = rd.nextInt(player2.length - 1);
            }
            System.out.println("computer choosed" + player2[a]);
            lastcardcomp = player2[a];
            if ((a == 0)) { //masadaki kart değişecek ve başka kart var mı diye bakılacak bir metod daha ekliceksin o şekilde
                Deck.lastcard = player2[0];
                player2[0] = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                if(player2[0] == null){
                    System.out.println("*****************");
                    System.out.println("Cards are dealing");
                    System.out.println("*****************");
                    deaalcard1.DealCards();
                }
                choosecard.ChooseCard();
            } else if ((a == 1)) {
                Deck.lastcard = player2[1];
                player2[1] = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            } else if ((a == 2)) {
                Deck.lastcard = player2[2];
                player2[2] = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            }
            else if ((a == 3)) {
                Deck.lastcard = player2[3];
                player2[3] = null;
                tableon.decksonthetable++;
                choosecard.ChooseCard();
            }
        }
    }
}





