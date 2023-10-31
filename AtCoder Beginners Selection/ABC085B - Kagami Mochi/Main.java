import java.util.Arrays;
import java.util.Collections;
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

    Arrays.sort(d);
    Collections.reverse(Arrays.asList(d));

    System.out.println(Arrays.toString(d));
    
    int count = 1;

    for (int i = 0; i < N -1; i++) {
      if (d[i] != d[i + 1]) {
        count++;
      }
    }

    System.out.println(count);

  }
}
