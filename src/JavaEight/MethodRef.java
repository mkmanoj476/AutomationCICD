package JavaEight;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {

    public static int Test(int s){
        return s*s;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(46);
        list.add(90);
        list.add(67);
        list.forEach(s->System.out.println(s*s));
    }
}
