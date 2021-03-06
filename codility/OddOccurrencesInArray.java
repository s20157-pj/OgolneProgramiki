package codility;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] tab = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(tab));
        float  f= 100.12345f;
        System.out.format("%(.2f", f);
    }

    public static int solution(int [] A) {
        Integer[] Aa = Arrays.stream(A).boxed().toArray(Integer[]::new);
        HashMap<Integer, Integer> occurencies = new HashMap<>();
        for (Integer num : Aa) {
            if (occurencies.containsKey(num)) {
                occurencies.put(num, occurencies.get(num) + 1);
            } else {
                occurencies.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: occurencies.entrySet()) {
            if(entry.getValue() % 2 != 0){
                return entry.getKey();
            }
        }
        throw new ArithmeticException("Every element got pair!");
    }
}
