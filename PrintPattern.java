public class PrintPattern {

  // Matrix

  public static void printMatrix(int n) {

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();

    }
  }

  // Half Pyramid

  public static void halfPramid(int n) {

    for (int i = 1; i <= n; i++) {
      int space = n;

      for (int j = space; j > i; j--) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    halfPramid(4);
  }
}
