package exam04;

import java.util.*;
import java.util.stream.StreamSupport;

public class Ex01 {
    public static void main(String[] args) {
        // HashMap<String, String> members = new HashMap<>();
        // 키 자료형의 Comparable 인터페이스
        // 대안 정렬 기준 java.util.Comparator 인터페이스

        // Comparator<String> com = (a, b) -> a.compareTo(b);
        Comparator<String> com = String::compareTo;

        TreeMap<String, String> members = new TreeMap<>(Comparator.reverseOrder());
        members.put("user01", "마루");
        members.put("user02", "최우리");
        members.put("user03", "임준호");

        // members.put("user02", "(수정)최우리");

        // members.remove("user02");

        // String name = members.get("user02");
        // System.out.println(name);

        Set<Map.Entry<String, String>> entries = members.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.printf("key = %s, value = %s%n", entry.getKey(), entry.getValue());
        }

        Set<String> keys = members.keySet();
        Collection<String> values = members.values();

        System.out.println(keys);
        System.out.println(values);

    }
}
