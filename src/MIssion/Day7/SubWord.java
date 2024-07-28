package MIssion.Day7;

public class SubWord {

    public static void main(String[] args) {
        String str = "xsffvxzccaafsdmitkhazf";
        String[] words ={"cat", "dog", "admit", "apple"};

        int flag=1;
        for(String s: words){
            char[] c = s.toCharArray();
            for(int i=0; i<c.length; i++){
                if(!str.contains(Character.toString(c[i]))){
                     flag=0;
                     break;
                }else {
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println(s+" valid word");
            } else if (flag==0) {
                System.out.println(s+" Not valid");
            }

        }
    }
}
