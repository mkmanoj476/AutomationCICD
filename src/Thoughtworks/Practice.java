package Thoughtworks;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void rotateInt(int[] temp, int k){
        int n = temp.length;
         k= k%n;
         rotate(temp, 0, n-1);
         rotate(temp, 0,k-1);
         rotate(temp,k, n-1 );

         for(int i: temp){
             System.out.print(i+",");
         }
    }
    public static void rotate(int[] arr, int l, int r){
        while (l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] =temp;
            l++;
            r--;
        }
    }

    public static void reverseEach(String str) {
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String s: words) {
            String str1 = reverseChar(s);
            sb.append(str1).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static String reverseChar(String str) {
        char[] ch=str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--) {
            sb.append(ch[i]);
        }

        return sb.toString();
    }


    public static void occurChar(String str){
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=0; i<str.length(); i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i));
                sb.append(count);
                count=1;
            }
        }

        String strings = sb.toString();
        System.out.println(strings);

        HashMap<Character, Integer> map = new HashMap<>();
        char[] chs = strings.toCharArray();
        for(int i=0; i<chs.length; i++){
            if(Character.isLetter(chs[i])){
                map.put(chs[i], map.getOrDefault(chs[i], 0)+1);
            }

        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+":");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;

            while(j>=0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }

        for(int r: nums1){
            System.out.print(r+" ");
        }

    }


    public static void main(String[] args) {
       // int[] temp={5,2,5,7,7,3,9,8,2};
      // Practice.rotateInt(temp,3);
      //  String str ="My lord is hanuman";
       // String str ="aabbccaabbssm";
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        Practice.merge(nums1, 3, nums2, 3);
    }
}
