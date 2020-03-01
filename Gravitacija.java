import java.lang.Math;
import java.util.Scanner;


public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vis = sc.nextInt();
        System.out.println("Pospešek na " + vis + "m: " + izracunajPospesek(vis));
    }
    
    public static double izracunajPospesek(int nadVisina) {
        double a = ((double) 6.674 * 5.972 * Math.pow(10, -11) * Math.pow(10, 24)) / Math.pow(6.371 * Math.pow(10, 6) + nadVisina, 2);
        return a;
    }
}