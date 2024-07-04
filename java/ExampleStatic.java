public class ExampleStatic {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    } 

    static void myStaticMethod2() {
        int x = 10;
        System.out.println(x);
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        myStaticMethod2();
        // myPublicMethod(); This would output an error

        ExampleStatic myObj = new ExampleStatic(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method
    }
}
