public class Playerhands {
    public static void player1Hands(){
        Deck.player1[0] = Deck.player1[1];
        Deck.player1[1] = Deck.player1[2];
        Deck.player1[2] = Deck.player1[3];
        Deck.player1[3] = null;
    }
    public static void player1Hands2(){
        Deck.player1[1] = Deck.player1[2];
        Deck.player1[2] = Deck.player1[3];
        Deck.player1[3] = null;
    }
    public static void player1Hands3(){
        Deck.player1[2] = Deck.player1[3];
        Deck.player1[3] = null;
    }
    public static void player2Hands(){
        Deck.player2[0] = Deck.player2[1];
        Deck.player2[1] = Deck.player2[2];
        Deck.player2[2] = Deck.player2[3];
        Deck.player2[3] = null;
    }
    public static void player2Hands2(){
        Deck.player2[1] = Deck.player2[2];
        Deck.player2[2] = Deck.player2[3];
        Deck.player2[3] = null;
    }
    public static void player2Hands3(){
        Deck.player2[2] = Deck.player2[3];
        Deck.player2[3] = null;
    }


}
