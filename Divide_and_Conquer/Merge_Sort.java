package Divide_and_Conquer;

public class Merge_Sort {

    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void MergeSort(int a[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        MergeSort(a, si, mid); // Left
        MergeSort(a, mid + 1, ei);// Right
        merge(a, si, mid, ei);
    }

    public static void merge(int a[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si; // index for left part
        int j = mid + 1; // index for right part
        int k = 0; // index for temp array

        while (i <= mid && j <= ei) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        // left

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        // right
        while (j <= ei) {
            temp[k++] = a[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            a[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        System.out.println("Array elements before sorting :");
        display(a);
        MergeSort(a, 0, a.length - 1);
        System.out.println("\nArray elements after sorting :");
        display(a);

    }
}
