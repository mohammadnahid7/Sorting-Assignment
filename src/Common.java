public class Common {
    private static boolean less(Integer v, Integer w){
        return v.compareTo(w) < 0;
    }
    private static void exch(int[]a, int i, int j){
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static boolean isSorted(int[] a){
        for(int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }
}
