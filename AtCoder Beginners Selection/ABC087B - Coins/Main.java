import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a500 = sc.nextInt();
    int b100 = sc.nextInt();
    int c50 = sc.nextInt();
    int x = sc.nextInt();
    int count = 0;
    sc.close();

    for (int i = 0; i <= a500; i++) {
      for (int j = 0; j <= b100; j++) {
        for (int k = 0; k <= c50; k++) {
          if (500 * i + 100 * j + 50 * k == x) {
            count++;
          }
        }
      }
    }

    System.out.println(count);

  }
}
