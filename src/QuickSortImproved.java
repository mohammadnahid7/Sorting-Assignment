import edu.princeton.cs.algs4.StdRandom;

public class QuickSortImproved {
    private static final int CUTOFF = 10;
    public static void sort(int[] a){
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }
    private static void sort(int[] a, int lo, int hi){
        if(hi <= lo + CUTOFF - 1) {
            Insertion.sort(a, lo, hi);
            return;
        };
        int m = medianOf3(a, lo, lo + (hi - lo) / 2, hi);
        exch(a, lo, m);

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
    private static int medianOf3(int[] a, int lo, int mi, int hi) {
        if (a[lo] > a[mi]) exch(a, lo, mi);
        if (a[lo] > a[hi]) exch(a, lo, hi);
        if (a[mi] > a[hi]) exch(a, mi, hi);
        return mi;
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
