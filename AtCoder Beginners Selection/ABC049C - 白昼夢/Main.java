import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    String[] words = {"dream", "dreamer", "erase", "eraser"};
    String result = "YES";
    
    while (s.length() > 0) {
      boolean isMatch = false;
      for (String word : words) {
        if (s.endsWith(word)) {
          s = s.substring(0, s.length() - word.length());
          isMatch = true;
          break;
        }
      }
      if (!isMatch) {
        result = "NO";
        break;
      }
    }

    System.out.println(result);
  }
}
