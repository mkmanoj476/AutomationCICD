package Automation;

public class MyClass {

    // Method to be used as method reference
    public static void myMethodClass() {
        System.out.println("Method by reference");
    }

    public static void main(String[] args) {
        // Creating a method reference
        MyFunctionalInterface myObj = MyClass::myMethodClass;
        // Invoking the method reference
        myObj.myMethodReference();
    }
}
