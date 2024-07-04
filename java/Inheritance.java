class Car {
    protected String brand = "ford";
    public void honk() {
        System.out.println("Tin Tin Tin");
    }
}



class Inheritance extends Car {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Inheritance myObj = new Inheritance();
        myObj.honk();
        System.out.println(myObj.brand + " " + myObj.modelName);

    }
}

