package MIssion.Day5;

public class StringQuestion {
    public static void strstr(String s, String x){
        int index = s.indexOf(x);
        System.out.println(index);
        if(index !=-1){
            System.out.println(index);
            int next = index+x.length()-1;
            String newstring = s.substring(next);
            int newindex= newstring.indexOf(x);
            if(newindex!=-1){
                System.out.println(newindex);
            }

        }else{
            System.out.println("not found");
        }
    }


    public static void main(String[] args) {
       String s="GeeForksForGeeksFotr";
   //     String str = "i love programming";
       String x="For";
       StringQuestion.strstr(s,x);
        String str = "i love programming";
        String[] words = str.split("\\s");
        for(int i=0; i< words.length; i++){
            words[i]= Character.toUpperCase(words[i].charAt(0))+words[i].substring(1)+" ";
        }
        for(String s1: words){
            System.out.print(s1);
        }
    }
}
