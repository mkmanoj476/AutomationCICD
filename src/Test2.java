import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void getmaxoccur(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }
        char maxchar ='\0';
        int occurance =0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()>occurance){
                maxchar = entry.getKey();
                occurance=entry.getValue();

            }
            System.out.print(maxchar+""+occurance);
        }

    }
    public static void abc(String s){
        Map<Character, Integer> map = new HashMap<>();
        int temp=0;
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey()+""+ entry.getValue());
        }
    }

    public static void duplicate(int[] a){
        ArrayList<Integer> ab = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            if(!ab.contains(a[i])){
                ab.add(a[i]);
            }else{
                System.out.println("duplicate integer is: "+a[i]);
            }
        }
    }

    public static void main(String[] args) {

       // Test2.getmaxoccur("adasfdhggasfasf");
        //Test2.abc("abaadcabdcd");
        int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2 };
        Test2.duplicate(arr);


    }
}

