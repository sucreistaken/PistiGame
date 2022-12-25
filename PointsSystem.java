import java.util.Arrays;

public class PointsSystem {
public Points[] points1 = new Points[10];
 public int pointsnumber =0;
 public void AddPoints(String Username , int points){
     if (pointsnumber ==  points){
         System.out.println("Arrayi full");
         return;
     }
     points1[pointsnumber] = new Points(Username,points);
     pointsnumber++;
 }
    public void sortPlayers() {
        // Diziyi sıralamak için bir döngü oluşturun
        for (int i = 1; i < pointsnumber; i++) {
            Points current   = points1[i];
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
            if(points1[i] != null){
            System.out.println((i + 1) + ". " + points1[i].Username + ": " + points1[i].points + " puan");
            }

        }
    }
}
class Points{
    public String Username;
    public int points;
    public  Points(String Username,int points) {
        this.Username = Username;
        this.points=points;
    }
}