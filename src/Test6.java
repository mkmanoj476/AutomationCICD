import java.util.*;
import java.util.stream.Collectors;

public class Test6 {

    public static void Occur(String str){
        Map<Character, Integer> hm = new HashMap<>();
        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                hm.put(c, hm.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }

    }
    public static void test1(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        while (count<str.length()){
            StringBuilder digit  = new StringBuilder();
            char ch = str.charAt(count);
            while(count+1<str.length() && Character.isDigit(str.charAt(count+1))){
                digit.append(str.charAt(count+1));
                count++;
            }
            int repeat=0;
            if(digit.length()>0){
                repeat=Integer.parseInt(digit.toString());
            }else {
                repeat=1;
            }
            for(int i=0; i<repeat; i++){
                sb.append(ch);
            }
            count++;
        }
        System.out.println(sb.toString());
    }
    public static void test2(String str){
        String[] words = str.split(" ");
        List<String> list = Arrays.stream(words)
                .filter(s-> s.startsWith("r"))
                .collect(Collectors.toList());
        System.out.println(list);
//        List<String> list = new ArrayList<>();
//        for(String s: words){
//            if(s.toLowerCase().startsWith("r")){
//                list.add(s);
//            }
//        }
//        System.out.println(list);

    }

    public static void test3(int[] n){
        int sum=5;
        List<String> list = new ArrayList<>();
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(sum==n[i]+n[j]){
                    String pair=  n[i]+":"+n[j];
                    String reverse =  n[j]+":"+n[i];
                    if(!list.contains(pair) && !list.contains(reverse)){
                        list.add(pair);
                    }
                }
            }
        }

        for(String c : list){
            System.out.println(c);
        }

    }

    public static void getList(){
        List<String> abc = new ArrayList<>();
        abc.add("manoj");
        abc.add("Rahul");
        abc.add("ritu");
        abc.add("harshit");
        Iterator<String>  itr = abc.iterator();
        while (itr.hasNext()){
            String a = itr.next();
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        //String abc ="aacsfasada";
       // Test6.Occur(abc);
       // System.out.println("---------------------");
        //Test6.test1("a5c1s2d1f1");
       //Test6.test2("radhey I love my India ram ");

        //int[] n = new int[]{1,2,3,4,2,1};
       // Test6.test3(n);
        Test6.getList();
    }
}
