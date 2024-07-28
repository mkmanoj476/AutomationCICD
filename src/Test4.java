 class Test4 {

    public void printMessage(int message){
        System.out.println("Premitive datatype: "+message);
    }

    public void printMessage(Integer message){
        System.out.println("Premitive datatype: "+message);
    }
}

class Main{
    public static void main(String[] args) {
        Test4 ob = new Test4();
        ob.printMessage(5);
    }
}
