import java.util.Random;

public class Deck {
    public static String [] deck = new String[52];
    public static  String[] player1 = new String[4];
    public static String[] player2 = new String[4];
    public static String[] board = new String[4];
    public  static String lastcard;



    Deck() {


        String[] suits = {"♥", "♠", "♦", "♣"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};

        for (int i =0; i<deck.length ; i++) {
            deck[i] = ranks[i % 13] + suits[i/13];
            //System.out.println(deck[i]);
        }
    }
    public   void Shuffle(){
        Random random = new Random();
        for(int ilk = 0; ilk<deck.length; ilk++){
            int ikinci = random.nextInt(52);
            String temp = deck[ilk];
            deck[ilk] = deck[ikinci];
            deck[ikinci] = temp;


        }
        for(int u =0; u<deck.length ; u++){
            System.out.println(deck[u]);
        }
    }
    public   void CuttheDeck(){

        Random random = new Random();
        int k = random.nextInt(52); // 0dan kesebilir buraya bak
        int temp = k;
        System.out.println(k);
        System.out.println("*********************************");
        System.out.println(k +"nıncı sıra");
        System.out.println("**********************************");
        String gecici;
        String gecici2;
        for( int a=k ; k<deck.length ;k++ ){
            gecici2=deck[k];
            deck[k] =gecici2;
        }
        for(int j = 0; j<temp; j++) {
            gecici = deck[j];
            deck[j] =gecici;
        }

        for (int u = 0; u<deck.length ; u++){
            System.out.println(deck[u]);
        }


    }
    public static int counter =0;

    public static int m = 0;
    public static int c = 0;

    public void OyunBaslangic(){

        DealCards();
        int j =0;
        for(int i =8 ; i<12 ; i++){
            board[j] = deck[i];
            deck[i] = null;
            j++;

        }
        System.out.println("masadaki kartlar" + board[j-1]);
        counter +=4;
        lastcard=board[j-1];
    }

    public void DealCards() {
        for (int i = counter; i < counter + 8; i++) {
            if (deck[i] != null) {
                if (i % 2 != 0) {
                    player1[m] = deck[i];
                    deck[i] = null;
                    m++;

                } else {
                    player2[c] = deck[i];
                    deck[i] = null;
                    c++;
                }
            }
        }
        counter += 8;
        m = 0;
        c = 0;

        for (int u = 0; u < player1.length; u++) {
            System.out.println("player 1 cards" + player1[u]);

        }
        for (int u = 0; u < player1.length; u++) {
            System.out.println("player 2 cards " + player2[u]);
        }
    }
}


