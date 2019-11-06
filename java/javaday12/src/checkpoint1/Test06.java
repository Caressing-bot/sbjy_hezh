package checkpoint1;

public class Test06 {
    public static void main(String[] args) {
        String s = "Caressing";
        int i = 2;
        function(s);
        function(i);
    }

    private static<T> void function(T t) {
        System.out.println(t);
    }

}
