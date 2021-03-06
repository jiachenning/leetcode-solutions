package rocks.ninjachen.leet_code_contest._160;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        // Produce the mirror list, which like fold.
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; i++) {
            int size = list.size();
            for (int j = size - 1; j >= 0; j--) {
                list.add(list.get(j) | (1 << i));
            }
        }
        return list;
    }
}
