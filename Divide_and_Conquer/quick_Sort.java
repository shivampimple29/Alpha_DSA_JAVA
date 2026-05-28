package Divide_and_Conquer;

public class quick_Sort {

    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void quickSort(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(a, si, ei);
        quickSort(a, si, pIdx - 1);
        quickSort(a, pIdx + 1, ei);

    }

    public static int partition(int a[], int si, int ei) {
        int pivot = a[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (pivot >= a[j]) {
                i++;
                // swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        i++;
        int temp = pivot;
        a[ei] = a[i];
        a[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        System.out.println("Array elements before sorting :");
        display(a);
        quickSort(a, 0, a.length - 1);
        System.out.println("\nArray elements after sorting :");
        display(a);
    }

}
