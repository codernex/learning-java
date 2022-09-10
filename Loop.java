import java.util.*;

class Loop {

  public static void main(String[] args) {

    int count = 6;

    // For In Loop
    for (int i = 0; i < count; i++) {
      System.out.println(i);
    }

    // While Loop
    while (count++ < 6) {
      System.out.println(count);
    }

    // do while
    do {
      System.out.println(count);
    } while (count++ < 6);

  }
}