import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("satu", 1);
        myHashMap.put("dua", 2);
        myHashMap.put("tiga", 3);
        
        System.out.println("satu="+myHashMap.get("satu"));
        
        for (Integer number : myHashMap.values()) {
            System.out.println("number="+number);
        }
    }
}
