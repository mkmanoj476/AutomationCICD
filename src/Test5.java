import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static void Common(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!list.contains(a[i])) {
                list.add(a[i]);
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        System.out.println(a[i]);
                        break;
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        int[] z = {4, 5, 2, 6, 6, 8};
        int[] y = {5, 2, 5, 6, 2, 9};
        Test5.Common(z, y);
    }
}
