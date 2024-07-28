package Automation;

import java.util.Arrays;
import java.util.HashMap;

public class FindSubsetArray {

    public static void reverseWords(String str){
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            String reverse =  reverseEachWord(s);
            sb.append(reverse).append(" ");
        }

        String reverseString = sb.toString();
        System.out.println(reverseString);
    }

    public static String reverseEachWord(String s){
        char[] ch = s.toCharArray();
        char[] temp = new char[ch.length];
        int k=0;
        for(int i=ch.length-1; i>=0; i--){
            temp[k] = ch[i];
            k++;
        }

        return new String(temp);
    }
    public static void reverseWord(String s) {
        s=s.trim();
        String[] str = s.split("\\s+");
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            sb.append(str[i]);
            if(i>0){
                sb.append(" ");
            }
        }

        String strings = sb.toString();
        System.out.println(strings);
    }

    public static void Arrange(int[] num){
        int[] arr = new int[num.length];
        int j=0;
        int k= num.length-1;
        for(int i=0; i<num.length; i++){
            if(num[i]<0){
                arr[j]=num[i];
                j++;
            }else{
                arr[k]=num[i];
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void longestString(String str){
        int n= str.length();
        int res = 0;
        int i=0;
        HashMap<Character, Integer> lastindex = new HashMap<>();
        for(int j=0; j<n; j++){
            if(lastindex.containsKey(str.charAt(j))){
                i=Math.max(i, lastindex.get(str.charAt(j))+1);
            }

            res = Math.max(res, j-i+1);
            lastindex.put(str.charAt(j), j);
        }
        System.out.println(res);
    }



    public static void main(String[] args) {
       int[] num1 ={2,3,-2,2,-7,4,-8,4,6,-1,8,8,-9,5};
//        int[] num2 ={2,3,5,6,8};
//        int[] num3 ={2,3,5,8,23};
//        String case1= "the sky is blue";
//       String case2="  hello world  ";
        String case3="a good   example";
//
//        FindSubsetArray.reverseWord(case1);
   //     FindSubsetArray.reverseWord(case3);
        FindSubsetArray.longestString("abcabcbbfada");
    }
}
