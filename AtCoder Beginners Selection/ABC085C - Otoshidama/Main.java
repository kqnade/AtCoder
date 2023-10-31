import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int total = sc.nextInt();
    sc.close();
    int [] result = new int[3];

    for (int i = 0; i <= amount; i++) {
      for (int j = 0; j <= amount - i; j++) {
        int k = amount - i - j;
        if (i * 10000 + j * 5000 + k * 1000 == total) {
          result[0] = i;
          result[1] = j;
          result[2] = k;
          break;
        }
      }
    }

    if (result[0] == 0 && result[1] == 0 && result[2] == 0) {
      System.out.println("-1 -1 -1");
    } else {
      System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
    


  }
}
