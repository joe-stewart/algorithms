import java.util.*;

public class Selection {
    private Selection() {}
    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 0; i < N; i++) {
            int min = i;
            for(int j = i+1; j < N; j++) {
                if(less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static void show(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(scanner.hasNext()) {
            String item = scanner.next();
            list.add(item);
        }
        String[] sa = new String[list.size()];
        list.toArray(sa);
        Selection.sort(sa);
        show(sa);
    }
}
