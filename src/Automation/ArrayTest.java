package Automation;

import java.util.*;

public class ArrayTest {

    //To print the name start with m and count them.
    public static void Mwords(String str){
        List<String> list = new ArrayList<>();
        int Freq=0;
        String[] words = str.split(" ");
        for(String s: words){
            if(s.startsWith("M") || s.startsWith("m")){
                list.add(s);
                Freq++;
            }
        }
        System.out.println(list+" Count is : "+Freq);
    }

    //Occureance of Character in a String
    public static void Occurance(String sentence){
        String str = sentence.toLowerCase();
        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            if (Character.isWhitespace(ch[i])) {
                continue;
            }
           map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    //Occurance of Words
    public static void Occurword(String str){
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String w : words){
            w= w.toLowerCase();
            map.put(w, map.getOrDefault(w,0)+1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

    //ReverseWords
    public static void Reverseword(String str){
        String[] words = str.split(" ");
        for(int i=0; i<words.length; i++){
            String wd = words[i];
            for(int j=wd.length()-1; j>=0; j-- ){
                System.out.print(wd.charAt(j));
            }
            System.out.print(" ");
        }
    }

    //Second highest Occurance character

    public static void Secondoccur(String str){
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : ch){
            if(Character.isLetter(c)){
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int second = list.get(1);
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for(Map.Entry<Character, Integer> entryset: entry){
              if(entryset.getValue()==second){
                  System.out.println(entryset.getKey()+" : "+ entryset.getValue());
              }
        }

    }

    public static void Sumnum(String str){
        String strd = str.replace(" ","");
        char[] ch = strd.toCharArray();
        int count=0;
        for(Character c : ch){
            if(Character.isDigit(c)){
                int a = Integer.parseInt(c.toString());
               // System.out.println(a);
                count=count+a;
            }else if(Character.isLetter(c)){

            }else {
                System.out.println(c);
            }
        }
        System.out.println(count);
    }

    public static void Fibonacci(int n){
        int i=0;
        int j=1;
        System.out.print(i+",");
        System.out.print(j+",");
        for(int k=0; k<n-2; k++){
            int sum= i+j;
            System.out.print(sum+",");
            i=j;
            j=sum;
        }
    }

    public static void ABC(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        while(count <str.length()){
            char c = str.charAt(count);
            StringBuilder digit = new StringBuilder();
            while(count+1<str.length() && Character.isDigit(str.charAt(count+1))){
                digit.append(str.charAt(count+1));
                count++;
            }
            int repeat=0;
            if(digit.length()>0){
                repeat=Integer.parseInt(digit.toString());
            }else{
                repeat=1;
            }
            for(int j=0; j<repeat; j++){
                sb.append(c);
            }
           count++;
        }
        String w = sb.toString();
        System.out.println(w);

    }

    public static void XYZ(String str){
        //List<String> words = Arrays.asList(str.split(" "));
        String[] words = str.split(" ");
        int freq = (int)Arrays.stream(words)
                .filter(word -> word.startsWith("m"))
                .peek(System.out::println)
                .count();
        System.out.println(freq);
    }

    public static void main(String[] args) {
        ArrayTest.Mwords("me and myself. Manoj is coming from Meghalaya and now he will reach on the top of mountain");

        //ArrayTest.Occurance("Ram is a super hero");

        //ArrayTest.Occurword("Ram jane ram ki maya Hanuman jane apni maya");

       // ArrayTest.Reverseword("Ram mere ram kaisi hai teri leela sara jag jhoom utha");

       // ArrayTest.Secondoccur("acsfdfdadsarsa");

      //  ArrayTest.Sumnum("India will be first 34th !fd tudsa");
        //ArrayTest.Fibonacci(10);
        ArrayTest.XYZ("manoj, mango monday, sunday, tuesday ");
    }

}
