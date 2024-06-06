public class Insertion {
    public static void sort(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++){
            for (int j = i; j > 0; j--){
                if (less(a[j], a[j-1])){
                    exch(a, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }
    public static void sort(int[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++){
            for (int j = i; j > lo; j--){
                if (less(a[j], a[j-1])){
                    exch(a, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }
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
