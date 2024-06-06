public class MergeSortImp {
    private static final int CUTOFF = 7;
    public static void sort(int[] a){
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length-1);
    }
    private static void sort(int[] a, int[] aux, int lo, int hi){
        if (hi <= lo + CUTOFF - 1) {
            Insertion.sort(a, lo, hi);
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        if (!less(a[mid+1], a[mid])) return;
        merge(a, aux, lo, mid, hi);
    }
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);

        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++){
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    private static boolean isSorted(int[] a, int lo, int hi){
        for(int i = lo; i <= hi; i++){
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }
    private static boolean less(Integer v, Integer w){
        return v.compareTo(w) < 0;
    }
    private static void exch(int[]a, int i, int j){
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
