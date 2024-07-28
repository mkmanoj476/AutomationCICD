package Automation;

import java.util.*;


public class Dog {

    public static void duplicate(int[] a){
        int count=1;
        for(int i=1; i<a.length; i++){
                if(a[i]!=a[i-1]){
                    a[count]=a[i];
                    count++;
                }
        }
        System.out.println(count);
    }
    public static void test(int[] a) {
        int n= a.length;
        int second = n-2;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(a[j]>a[j+1]) {
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("Second mx num is: "+a[second]);
    }
    public static void occur(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(Character c : ch) {
            if(Character.isLetter(c)) {
                mp.put(c, mp.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry :mp.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void target(int[] a, int t) {
        List<String> list = new ArrayList<String>();
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(t==a[i]+a[j]) {
                    System.out.println(a[i]+":"+a[j]);
                    String b = a[i]+":"+a[j];
                    StringBuilder build = new StringBuilder(b);
                    build.reverse();
                    String c = build.toString();
                    if(!list.contains(b) && !list.contains(c)) {
                        list.add(b);
                    }
                }
            }
        }
        System.out.println(list);
    }
    public static void removeDuplicates(int[] nums) {
        int count=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums) {
            if(!set.contains(n)) {
                count++;
                set.add(n);
            }
        }
        System.out.println(count);
        System.out.println(set);
    }

    public static void test2(String str1, String str2){
        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] charArray1 = str3.toCharArray();
            char[] charArray2 = str4.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result==true){
                System.out.println("This is analogue");
            }else{
                System.out.println("This is not analogue");
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {2,5,6,2,56};
        String b = "manoj";
        String c= "kumar";
       //Dog.duplicate(a);
        Dog.removeDuplicates(a);
       // Dog.test2(b,c);
    }
}
