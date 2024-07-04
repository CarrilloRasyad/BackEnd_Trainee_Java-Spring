import java.util.Date;
public class OutputFormating {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%tT%n", date);
    }
}
