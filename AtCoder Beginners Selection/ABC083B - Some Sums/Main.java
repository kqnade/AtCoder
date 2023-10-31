import java.util.Scanner;

class Solver {
  public static int digitSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
  public static void solve(int N, int A, int B) {
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      int digitSum = digitSum(i);
      if (digitSum >= A && digitSum <= B) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    Solver.solve(N, A, B);

  }
}