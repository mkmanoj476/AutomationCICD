package MIssion.Day1;

public class Regex {

    public void validCode(String str){
      if(!str.matches("^[A-Z]{2}[0-9]-[A-Z]{3}-[0-9]{3}$")){
          System.out.println("Invalid Code");
      }

      String part1= str.substring(0,3);
      String part2 = str.substring(4,7);
      String part3 = str.substring(8);

      int firstnum = Character.getNumericValue(part1.charAt(2));
      int secondnum= Character.getNumericValue(part3.charAt(0));
      int thirdnum = Character.getNumericValue(part3.charAt(1));
      int checkNum = Character.getNumericValue(part3.charAt(2));

      int finalNum = (firstnum+secondnum+thirdnum)%10;

      if(finalNum==checkNum){
          System.out.println("Code is valid");
      }else {
          System.out.println("Code is not valid");
      }


      

    }
    public static void main(String[] args) {
        Regex r = new Regex();
        String[] testCodes = {
                "AF3-FJK-418",
                "JJ5-OPQ-320",
                "AB1-CDE-123",
                "XY4-XYZ-678",
                "ZZ9-AAA-900"
        };

        for(String s: testCodes){
            r.validCode(s);
        }




    }
}
