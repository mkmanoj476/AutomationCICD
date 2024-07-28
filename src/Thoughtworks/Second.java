package Thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Second {

    public static void Test(int[] arr){
        int third = findNum(arr);
        String type = checkType(third);
        List<Integer> finallist= filterArray(arr, type);
        System.out.println(finallist);
    }
    public static String checkType(int num){
        if(!isPrime(num)){
            return "prime";
        }else if(num%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
    public static boolean isPrime(int num){
      if(num<=1) return false;
      for(int i=2; i<Math.sqrt(num); i++){
          if(num%i==0){
              return false;
          }
      }

      return true;
    }
    public static int findNum(int[] arr){
        int n =arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-3];
    }
    public static List<Integer> filterArray(int[] num, String type){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : num){
            if("prime".equals(type) && !isPrime(n)){
                list.add(n);
            }else if("even".equals(type) && n%2 !=0){
                list.add(n);
            }else if("odd".equals(type) && n%2==0){
                list.add(n);
            }
        }

        return list;
    }

    public static void getWords(String str){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<str.length()-1; i++){
            if(count+1<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                sb.append(str.charAt(i));
                count=1;
            }
        }
        String strings = sb.toString();
        System.out.println(strings);
    }


    public static void main(String[] args) {
        String str = "aabcdaf gsfsff fdfsd sdwwwaasf fdffddss";
        int[] arr = {1,3,4,5,2,5,6,3,0,6,7,3,6,2,7,9,12,4,15};
        Second.Test(arr);
        Second.getWords(str);


    }
}
