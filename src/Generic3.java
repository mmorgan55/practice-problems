import java.util.HashSet;
import java.util.Set;

public class Generic3 {

  int sockMerchant(int n, int[] ar) {
    Set<Integer> set = new HashSet<>();
    int numPairs = 0;

    for(int i : ar) {
      if(set.contains(i)) {
        set.remove(i);
        numPairs++;
      } else {
        set.add(i);
      }
    }

    return numPairs;
  }

  int countingValleys(int n, String s) {
    int numValleys = 0;
    int value = 0;

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'D') {
        value--;
      } else {
        if ((value + 1) == 0) {
          numValleys++;
        }
        value++;
      }
    }

    return numValleys;

  }

}
