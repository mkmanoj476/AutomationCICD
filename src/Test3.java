public class Test3 {

    //input- aabbbaaaaddc
    //output - a2b3a4d2c1
    public static void Occurance(String s){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<s.length(); i++) {
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                sb.append(s.charAt(i));
                sb.append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }

    //input - a2b10c1
    //output - aabbbbbbbbbbc

    public static void abc(String s){
        StringBuilder sb = new StringBuilder();
        int count=0;
        while(count<s.length()){
            char ch = s.charAt(count);
            StringBuilder digit = new StringBuilder();
            while(count<s.length()-1 && Character.isDigit(s.charAt(count+1))){
                digit.append(s.charAt(count+1));
                count++;
            }

            //System.out.println(digit.toString());
            System.out.println(digit.length());
            int repeatition=0;
            if(digit.length() >0){
                 repeatition = Integer.parseInt(digit.toString());
            }else{
                repeatition=1;
            }

            for(int j=0; j<repeatition; j++){
                sb.append(ch);
            }

            count++;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Test3.Occurance("aabbbaaaaddc");
    }
}
