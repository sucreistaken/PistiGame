import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        Game game1 = new Game();
        deck1.Shuffle();
        deck1.CuttheDeck();
        deck1.OyunBaslangic();
        game1.ChooseCard();

        // deck1.PrinDeste();
        //deck1.OyunBaslangic();
        // game1.ChooseCard();








    }
}