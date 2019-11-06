package checkpoint2;

public class Test04 {
    public static void main(String[] args) {
        String[] ab = {"a","b","c","d"};
         String[] ab1 = swap( ab , 3, 2);
         for (String i : ab1)
        System.out.print(i);
         Integer[] sb = {1 ,2 ,3 ,4 };
         Integer[] sb1 = swap( sb, 2 ,1);
        System.out.println();
        for (int a: sb1 ) {
            System.out.print(a);
        }
    }
    public static <T> T[] swap(T[] t, int a ,int b){
        T i;
        i = t[a];
        t[a] = t[b];
        t[b] = i ;
        return t;
    }
}
