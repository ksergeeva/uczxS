import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Map<Character, Integer> map = new HashMap<>();
        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                if (!map.containsKey(i))
                    map.put(i, 1);
                else
                    map.put(i, map.get(i) + 1);
            }
        }
        System.out.println(map);
        int maxValue = (Collections.max(map.values()));
        for (Map.Entry<Character, Integer> maps : map.entrySet()) {
            if (maps.getValue() == maxValue) {
                System.out.println("Наибольшее количество : " + maps.getKey());
                break;
            }
        }
        int minValue = (Collections.min(map.values()));
        for (Map.Entry<Character, Integer> maps : map.entrySet()) {
            if (maps.getValue() == minValue) {
                System.out.println("Наименьшее количество : " + maps.getKey());
                break;
            }
        }
    }
}