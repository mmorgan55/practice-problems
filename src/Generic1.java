import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generic1 {

  char firstNotRepeatingCharacter(String s) {

    Set<Character> set = new HashSet<>();
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);

      if (set.contains(character)) {
        continue;
      } else {
        if (list.contains(character)) {
          set.add(character);
          list.remove((Character) character);
        } else {
          list.add(character);
        }
      }

    }

    return list.size() > 0 ? list.get(0) : '_';
  }


  int phoneCall(int min1, int min2_10, int min11, int s) {
    int totalTime = 0;
    int totalCost = 0;

    if (min1 > s) {
      return totalTime;
    }

    totalCost += min1;
    totalTime++;

    while (true) {
      if (totalTime < 10) {
        totalCost += min2_10;
      } else {
        totalCost += min11;
      }

      if (totalCost > s) {
        break;
      }

      totalTime++;
    }

    return totalTime;
  }

  //Not a great answer since it's O(N*M)
  //Learned that there is a bitCount method in Integer. Should've used it
  int rangeBitCount(int a, int b) {
    int numOnes = 0;
    int[] arr = new int[b - a + 1];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a;
      a++;
    }

    for (int num : arr) {
      String str = Integer.toBinaryString(num);
      for (int i = 0; i < str.length(); i++) {

        if (str.charAt(i) == '1') {
          numOnes++;
        }
      }
    }

    return numOnes;

  }

  int appleBoxes(int k) {
    int result = 0;

    for (int i = 1; i <= k; i++) {
      result += (i % 2 == 0) ?  (i * i) : -(i * i);
    }

    return result;
  }

  boolean increaseNumberRoundness(int n) {
    boolean seenZero = false;

    String str = String.valueOf(n);

    for(int i = 0; i < str.length(); i++) {
      if (!(str.charAt(i) == '0')) {
        if (seenZero) {
          return true;
        }

      } else {
        seenZero = true;
      }
    }

    return false;
  }

  boolean containsDuplicates(int[] a) {

    Set<Integer> set = new HashSet<>();

    for (int i : a) {
      if (set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }

    return false;
  }





}
