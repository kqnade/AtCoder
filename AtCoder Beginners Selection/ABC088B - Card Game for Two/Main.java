import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0; i<n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Arrays.sort(a);
    Collections.reverse(Arrays.asList(a));

    int alice = 0;
    int bob = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        alice += a[n - 1 - i];
      } else {
        bob += a[n - 1 - i];
      }
    }
    
    System.out.println(alice - bob);
  }
};
