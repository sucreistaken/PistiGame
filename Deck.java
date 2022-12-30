import java.util.Random;

public class Deck {
    public static String[] deck = new String[52];
    public static String[] player1 = new String[4];
    public static String[] player2 = new String[4];
    public static String[] board = new String[4];
    public static Player1play choosecard = new Player1play();
    public static String lastcard;

    Deck() {
        String[] suits = {"♥", "♠", "♦", "♣"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = ranks[i % 13] + suits[i / 13];
            //System.out.println(deck[i]);
        }
    }

    public void Shuffle() {
        Random random = new Random();
        for (int ilk = 0; ilk < deck.length; ilk++) {
            int ikinci = random.nextInt(52);
            String temp = deck[ilk];
            deck[ilk] = deck[ikinci];
            deck[ikinci] = temp;
        }
        for (int u = 0; u < deck.length; u++) {
            // System.out.println(deck[u]);
        }
    }

    public void CuttheDeck() {
        Random random = new Random();
        int k = random.nextInt(52);// 0dan kesebilir buraya bak
        String tempdeck[] = new String[k];
        String tempdeck2[] = new String[52 - k];
        int temp = k;
        int i = 0;
        int p = 0;
        int c = 0;
        int o = 0;
        for (int j = 0; j < k; j++) {
            tempdeck[p] = deck[j];
            p++;
        }
        for (int y = k; y < deck.length; y++) {
            tempdeck2[o] = deck[y];
            o++;
        }
        for (int u = 0; u < 52 - k; u++) {
            deck[u] = tempdeck2[i];
            i++;
        }
        for (int u = 52 - k; u < deck.length; u++) {
            deck[u] = tempdeck[c];
            c++;
        }
        for (int z = 0; z < deck.length; z++) {
            //System.out.print(deck[z]);
        }
    }

    public static int counter = 0;
    public static int m = 0;
    public static int c = 0;

    public void OyunBaslangic() {
        DealCards();
        int j = 0;
        for (int i = 8; i < 12; i++) {
            board[j] = deck[i];
            deck[i] = null;
            j++;
        }
        System.out.println("masadaki kartlar" + board[j - 1]);
        counter += 4;
        lastcard = board[j - 1];
        choosecard.ChooseCard();
    }

    public void DealCards() {
        if (counter < 52) {
            System.out.println("*****************\n" +
                    "Cards are dealing\n" +
                    "*****************");
        }
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
        int p1 = 1;
        for (int u = 0; u < player1.length; u++) {
            System.out.println("player 1 cards ==" + p1 + ". =    " + player1[u]);
            p1++;
        }
        p1 = 0;
        /*for (int u = 0; u < player1.length; u++) {
            System.out.println("player 2 cards " + player2[u]);
        } */
    }

}


