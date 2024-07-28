package MIssion.Day4;

import java.util.Arrays;

public class Test {

    public static void Test(String str){
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            String st = words(s);
            sb.append(st).append(" ");
        }
        String strings = sb.toString();
        System.out.println(strings);
    }
    public static String words(String str){
        int n= str.length();
        char[] ch = new char[n];
        int k=0;
        for(int i=n-1; i>=0; i--){
            ch[k]=str.charAt(i);
            k++;
        }

        String word = new String(ch);
        return word;

    }

    public static String countString(String str){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<str.length(); i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                sb.append(str.charAt(i));
                sb.append(count);
                count=1;
            }
        }

        String strings = sb.toString();
        System.out.println(strings);

        return strings;
    }


    public static void main(String[] args) {

//        String str="aaffdddsgggdee";
//        Test.countString(str);
//       // String str ="12My Name is Manoj Kumar";
//        String st = "24";
//        int p= Integer.parseInt(st.toString());
//       // int s =Integer.parseInt(String.valueOf(str.charAt(1)));
//        //HelloWorld.Test(str);
//        System.out.println(p);
        String s1="Army";
        String s2 = "Mary";
        s1= s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch2, ch1);

            if(result){
                System.out.println("String is Anagram");
            }else {
                System.out.println("String is not Anagram");
            }

        }

    }
}
