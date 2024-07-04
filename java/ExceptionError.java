public class ExceptionError {
    public static void main(String[] args) {
        try {
            int[] x = {1,2,3};
            System.out.println(x[0]);
        } catch(Exception e) {
            System.out.println("ada yang salah nih");
        } finally {
            System.out.println("beres");
        }
    }
}
