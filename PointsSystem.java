import java.util.Arrays;

public class PointsSystem {
    public static int pointsp1 = 0;
    public static int pointscmp = 0;
    public static int cardcounterp1 = 0;
    public static int cardscountercmp = 0;
    public Points[] points1 = new Points[10];
    public int pointsnumber = 0;

    public static void PrintP1hand() {
        for (int u = 0; u < player1play.player1.length; u++) {
            if (player1play.player1[u] != null) {
                System.out.println("player 1 cards " + (u + 1) + ".= " + player1play.player1[u]);
            }
        }
    }

    public static void Calculatepointsp1(String a) {
        if (a == "♦10") {
            PointsSystem.pointsp1 += 3;
        } else if (a == "♣2") {
            PointsSystem.pointsp1 += 3;
        }
    }

    public static void Calculatepointscmp() {
        if (Deck.counter == 52 && player1play.decksonthetable > 2 && Deck.player2[0] == null) {
            pointscmp+=player1play.decksonthetable;
        }
    }
    public static void Calculatepointscmpwithoutpoint(String a) {
        if (a == "♦10") {
            PointsSystem.pointsp1 += 3;
        } else if (a == "♣2") {
            PointsSystem.pointsp1 += 3;
        }
    }

    public static void Collectcardsscmp() {
        player1play.decksonthetable++;
        PointsSystem.cardscountercmp += player1play.decksonthetable;
    }

    public static void Collectcardssp1() {
        player1play.decksonthetable++;
        PointsSystem.cardcounterp1 += player1play.decksonthetable;
    }

    public static void Results() {
        if (cardscountercmp > cardcounterp1) {
            pointscmp += +3;
        } else {
            pointsp1 += 3;
        }
        System.out.println("Player 1 Points:" + pointsp1);
        System.out.println("Computer points" + pointscmp);
    }

    public void AddPoints(String Username, int points) {
        if (pointsnumber == points) {
            System.out.println("Arrayi full");
            return;
        }
        points1[pointsnumber] = new Points(Username, points);
        pointsnumber++;
    }

    public void sortPlayers() {
        // Diziyi sıralamak için bir döngü oluşturun
        for (int i = 1; i < pointsnumber; i++) {
            Points current = points1[i];
            int j = i - 1;
            // Önceki elemanları geçerken, daha yüksek bir puan bulunursa, geçer
            while (j >= 0 && points1[j].points < current.points) {
                points1[j + 1] = points1[j];
                j--;
            }
            // Bulunan pozisyona oyuncuyu ekleyin
            points1[j + 1] = current;
        }
    }

    public void Printpoints() {
        // Puanları yazdırma
        System.out.println("Top 10:");
        for (int i = 0; i < points1.length; i++) {
            if (points1[i] != null) {
                System.out.println((i + 1) + ". " + points1[i].Username + ": " + points1[i].points + " puan");
            }

        }
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