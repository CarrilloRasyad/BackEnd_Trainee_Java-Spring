public class Testing {
    int a=3; 
    // final int a = 10; // tipe constanta tidak dapat diubah
    public static void main(String[] args) {
        Testing myObj = new Testing();
        myObj.a = 25; // myObj adalah objek dari kelas Testing dan a itu variable dari kelas Testing
        System.out.println(myObj.a + "berhasil");
    }
}
