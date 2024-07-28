package MIssion.Day3;

public class Day3 {
    public void Test(StringBuilder s,String st ){
        s.append("test");
        st = st+"waw";

        s=null;
        st=null;
    }

    public static void main(String[] args) {
        Day3 d= new Day3();
        StringBuilder sb = new StringBuilder("Adrik");
        String word = "warrior";
        d.Test(sb, word);
        System.out.println(sb+":"+word);




    }
}
