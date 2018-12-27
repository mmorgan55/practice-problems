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

}
