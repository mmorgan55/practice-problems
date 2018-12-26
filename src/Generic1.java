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

}
