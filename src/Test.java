public class Test {

    public  static void checkprime(int num){

        boolean flag=false;
        int mid = num/2;
        if(num==0 || num==1){
            System.out.println("Number is not prime");
        }else{
            for(int i=2; i<=mid; i++){
                if(num%i==0){
                    flag=true;
                    System.out.println("Number is not prime");
                    break;
                }
            }
            if(flag==false){
                System.out.println("Number is prime");
            }
        }
    }

    public static void sum(int num){
        int temp=0;
        while (num!=0){

            temp=temp+(num%10);
            num=num/10;
        }
        System.out.println("Sum is : "+temp);
    }

    public static void occur(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=0; i<ch.length; i++){
            if(i+1<ch.length && ch[i]==ch[i+1]){
                count++;
            }else {
                sb.append(ch[i]);
                sb.append(count);
                count=1;
            }

        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        //Test.checkprime(5454423);
        Test.occur("aaaabbbccbbaad");

    }

}
