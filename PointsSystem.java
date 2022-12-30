import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PointsSystem {
    static Scanner scanner = new Scanner(System.in);
    public static Player1play choosecardd= new Player1play();
    public static Deck startgame = new Deck();
    public static int pointsp1 = 0;
    public static int pointscmp = 0;
    public static int cardcounterp1 = 0;
    public static int cardscountercmp = 0;
    //public Points[] points1 = new Points[10];
    public int pointsnumber = 0;
    String userName;

    public static void PointsSystem1() throws IOException {

        String userName;
        System.out.println("Welcome!");
        while (true) {
            System.out.print("Enter your name (Don't use ','): ");
            userName = scanner.nextLine();
            if (userName.contains(",")) {
                System.out.println("The name contains ','!\n");
            } else {
                break;
            }
        }
         startgame.OyunBaslangic();
        Points newScore = new Points(userName, pointsp1);
        File file = new File("C:\\Users\\kadir\\IdeaProjects\\Pisti\\src\\highscore.txt");
        Scanner fileReader = new Scanner(file);
        Points[] highScores = new Points[10];
        int count = 0;
        while (fileReader.hasNextLine()){
            String score = fileReader.nextLine();
            highScores[count] = new Points(score.strip().split(",")[0], Integer.parseInt(score.strip().split(",")[1]));
            count++;
        }
        int scoresCount =0;
        for(Points sc : highScores){
            if(sc!= null)
                scoresCount++;
        }
        if (scoresCount == 0) {
            highScores[0] = newScore;
        } else {
            System.out.println(scoresCount);
            for (int s = 0; s < highScores.length; s++) {
                if (highScores[s] != null && newScore.points > highScores[s].points){
                    for (int n = highScores.length - 1; n > s; n--){
                        highScores[n] = highScores[n - 1];
                    }
                    highScores[s] = newScore;
                    break;
                } else if (highScores[s] == null){
                    highScores[s] = newScore;
                    break;
                }
            }
        }
        String scoreString = "";
        for (Points scr : highScores){
            if (scr != null){
                scoreString += scr.Username + "," + scr.points + "\n";
            }
        }
        FileWriter fileWriter = new FileWriter("C:\\Users\\kadir\\IdeaProjects\\Pisti\\src\\highscore.txt");
        fileWriter.write(scoreString);
        fileWriter.close();
    }

    public static void PrintP1hand() {
        for (int u = 0; u < Player1play.player1.length; u++) {
            if (Player1play.player1[u] != null) {
                System.out.println("player 1 cards " + (u + 1) + ".= " + Player1play.player1[u]);
            }
        }
    }

    public static void Calculatepointsp1(String a) {
        if (a == "♦10") {
            PointsSystem.pointsp1 += 3;
        } else if (a == "♣2") {
            PointsSystem.pointsp1 += 2;
        }
    }

    public static void Calculatepointscmp() {
        if (Deck.counter == 52 && Player1play.decksonthetable > 2 && Deck.player2[0] == null) {
            pointscmp+=Player1play.decksonthetable;
        }
    }
    public static void Calculatepointscmpwithoutpoint(String a) {
        if (a == "♦10") {
            PointsSystem.pointsp1 += 3;
        } else if (a == "♣2") {
            PointsSystem.pointsp1 += 2;
        }
    }

    public static void Collectcardsscmp() {
        Player1play.decksonthetable++;
        PointsSystem.cardscountercmp += Player1play.decksonthetable;
    }

    public static void Collectcardssp1() {
        Player1play.decksonthetable++;
        PointsSystem.cardcounterp1 += Player1play.decksonthetable;
    }

    public static void Results() {
        if (cardscountercmp > cardcounterp1) {
            pointscmp += +3;
        } else {
            pointsp1 += 3;
        }
        System.out.println("Player 1 points ="  + pointsp1);
        System.out.println("Computer points =" + pointscmp);
    }


    public void AddPoints(String Username, int points) {

    }

    public void sortPlayers() {
        // Diziyi sıralamak için bir döngü oluşturun

    }



}

class Points {
    public String Username;
    public int points;

    public Points(String Username, int points) {
        this.Username = Username;
        this.points = points;
    }
}