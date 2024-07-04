class MyGen<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}

class TestGenerics3 {
    public static void main(String args[]) {
        // List<Integer> m = new ArrayList<Integer>();
        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);
        m.add(3);
//m.add("vivek");//Compile time error
        System.out.println(m.get());
    }
}


// import java.util.ArrayList;
// import java.util.List;

// class MyGen<T> {
//     private List<T> list = new ArrayList<>();

//     void add(T obj) {
//         list.add(obj);
//     }

//     List<T> get() {
//         return list;
//     }
// }

// class TestGenerics3 {
//     public static void main(String args[]) {
//         MyGen<Integer> m = new MyGen<>();
//         m.add(2);
//         m.add(3);
//         // m.add("vivek"); // Compile time error
//         System.out.println(m.get());
//     }
// }
