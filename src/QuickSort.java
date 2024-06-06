import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {

    public static void sort(int[] a){
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }
    private static void sort(int[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo,hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    private static int partition(int[] a, int lo, int hi){
        int i = lo, j = hi+1;
        while(true){
            while(less(a[++i],a[lo])){
                if(i == hi) break;
            }
            while(less(a[lo],a[--j])){
                if(j == lo) break;
            }
            if(i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
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
