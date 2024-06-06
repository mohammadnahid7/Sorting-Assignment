import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("numbers.txt");
        int[] insertionNumArr = readFile.getNumbersArr();
        int[] selectionNumArr = readFile.getNumbersArr();
        int[] quickNumArr = readFile.getNumbersArr();
        int[] quickImpNumArr = readFile.getNumbersArr();
        int[] mergeNumArr = readFile.getNumbersArr();
        int[] mergeImpNumArr = readFile.getNumbersArr();


//        Selection Sort
        long SstartTime = System.nanoTime();
        Selection.sort(selectionNumArr);
        long SendTime = System.nanoTime();
        System.out.println("Selection: " + String.valueOf( (SendTime-SstartTime)));



//        Insertion Sort
        long IstartTime = System.nanoTime();
        Insertion.sort(insertionNumArr);
        long IendTime = System.nanoTime();
        System.out.println("Insertion: " + String.valueOf( (IendTime-IstartTime)));

//
//      Quick Sort
        long QSstartTime = System.nanoTime();
        QuickSort.sort(quickNumArr);
        long QSendTime = System.nanoTime();
        System.out.println("QuickSort: " + String.valueOf( (QSendTime-QSstartTime)));
//
//
//      Quick Sort Improved
        long QSIstartTime = System.nanoTime();
        QuickSortImproved.sort(quickImpNumArr);
        long QSIendTime = System.nanoTime();
        System.out.println("QuickImpr: " + String.valueOf( (QSIendTime-QSIstartTime)));


//      Merge Sort
        long MstartTime = System.nanoTime();
        MergeSort.sort(mergeNumArr);
        long MendTime = System.nanoTime();
        System.out.println("MergeSort: " + String.valueOf( (MendTime-MstartTime)));


//      Merge Sort Improved
        long MImpstartTime = System.nanoTime();
        MergeSortImp.sort(mergeImpNumArr);
        long MImpendTime = System.nanoTime();
        System.out.println("MergeImpr: " + String.valueOf( (MImpendTime-MImpstartTime)));

    }
}