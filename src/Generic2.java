public class Generic2 {

  int addTwoDigits(int n) {
    String[] str = String.valueOf(n).split("");

    return Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
  }

}
