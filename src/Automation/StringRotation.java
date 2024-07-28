package Automation;

import java.util.ArrayList;
import java.util.List;

public class StringRotation {

    public static String rotateString(String str, int n){
        int length= str.length();
        n=n%length;

        String part1= str.substring(0,length-n);
        String part2=str.substring(length-n);
        return part2+part1;
    }

    public static void rotateInt(int[] nums, int k){
        int x = nums.length;
         k = k%x;
         rotate(nums, 0, x-1);
         rotate(nums, 0, k-1);
         rotate(nums, k, x-1);
         for(int i:nums){
             System.out.print(i+",");
         }
    }

    public static void rotate(int[] nums,int start, int last){
        while (start < last){
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
    }

    public static void checkPalInt(int num){
        int sum=0;
        int duplicateNum = num;
        while(duplicateNum>0){
            int n= duplicateNum%10;
            sum=sum*10+n;
            duplicateNum=duplicateNum/10;
        }
        if(num==sum){
            System.out.println("Number is pallendrome");
        }else{
            System.out.println("Number is not pallendrome");
        }
    }

    public static void checkArm(int num){
        int sum=0;
        while(num>0){
            int n = num%10;
            sum = sum + (n*n*n);
            num=num/10;
        }
        if(num==sum){
            System.out.println("This is ArmStrong Number");
        }else{
            System.out.println("This is not armstrong number");
        }
    }

    public static void printOccurDigit(String str){
        StringBuilder sb  = new StringBuilder();
        int count=0;
        while(count<str.length()){
            StringBuilder digit = new StringBuilder();
            char c = str.charAt(count);
            while(count+1<str.length() && Character.isDigit(str.charAt(count+1))){
                digit.append(str.charAt(count+1));
                count++;
            }
            int repeat =0;
            if(digit.length()>0){
                repeat = Integer.parseInt(digit.toString());
            }else{
                repeat=1;
            }
            for(int i=0; i<repeat; i++){
                sb.append(c);
            }
            count++;
        }
        System.out.println(sb.toString());
    }
    public static void removeDuplicate(int[] nums, int k){
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=k){
                list.add(nums[i]);
            }
        }

        Object[] newarray = list.toArray();
        for(Object m : newarray){
            System.out.print(m+",");
        }
    }

    public static int removeDuplate(int[] nums, int k){
        
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=k){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
                i++;
            }

        }
        for(int s: nums){
            System.out.print(s+",");
        }
        return i;
    }

    public static void checkPallen(String str){
        int n = str.length();
        int mid = n%2;
        int left=n-1;
        int right=0;
        for(int i=0;i<mid; i++){
            if(str.charAt(right)==str.charAt(left)){
                left--;
                right++;
            }else {
                System.out.println("No pallendrome");
            }
        }
    }


    public static void main(String[] args) {
//        String word ="India is great";
//        int n=3;
//       String newword= StringRotation.rotateString(word,3);
//        System.out.println(newword);

      //  StringRotation.printOccurDigit("a5b2n2c1");
        int[] nums = {4,2,4,6,2,1,6,3,7,2,1};
        StringRotation.removeDuplate(nums, 2);
        //int[] nums = {4,2,4,6,2,1,6,3,7,2,1};
        //StringRotation.rotateInt(nums, 4);
    }
}
