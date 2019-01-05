public class Generic2 {

  int addTwoDigits(int n) {
    String[] str = String.valueOf(n).split("");

    return Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
  }

  public int maxSpan(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int maxSpan = 1;

    for (int i = 0; i < nums.length; i++) {
      int span = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          if ((j - i) >= maxSpan) {
            maxSpan = (j - i) + 1;
          }
        }
      }
    }

    return maxSpan;
  }


}
