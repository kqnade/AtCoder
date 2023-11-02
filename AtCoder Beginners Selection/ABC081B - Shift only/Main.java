import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] d = new int[N];
    for (int i = 0; i < N; i++) {
      d[i] = Integer.parseInt(sc.nextLine());
    }
    sc.close();

    while (true) {
      boolean isEven = true;
      for (int i = 0; i < N; i++) {
        if (d[i] % 2 != 0) {
          isEven = false;
          break;
        }
      }
      if (isEven) {
        for (int i = 0; i < N; i++) {
          d[i] = d[i] / 2;
        }
      } else {
        break;
      }
      
    }

    System.out.println(Arrays.toString(d));
    
  }
}
