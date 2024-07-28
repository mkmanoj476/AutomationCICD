package MIssion.Day6_Static;

public class StaticPractice {

    static int a=10;

    public void Test(int a){
        this.a=a;
    }

    static {
       a=15;
    }

    public static void main(String[] args) {
        System.out.println(StaticPractice.a);
        StaticPractice s = new StaticPractice();
        s.Test(78);
        System.out.println(StaticPractice.a);
    }
}
