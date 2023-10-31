import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int turn = sc.nextInt();
    int[] t = new int[turn + 1];
    int[] x = new int[turn + 1];
    int[] y = new int[turn + 1];
    for (int i = 1; i <= turn; i++) {
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 1; i <= turn; i++) {
      int time = t[i] - t[i - 1];
      int distance = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
      if (time < distance || (time - distance) % 2 != 0) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");


  }  
}
