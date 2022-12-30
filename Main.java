import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Deck deck1 = new Deck();
        PointsSystem playerr = new PointsSystem();
        Player1play game1 = new Player1play();
        Computer comp = new Computer();
        deck1.Shuffle();
        deck1.CuttheDeck();
        PointsSystem.PointsSystem1();
        PointsSystem.Results();

    }
}