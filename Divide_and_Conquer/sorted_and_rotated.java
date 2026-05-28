package Divide_and_Conquer;

public class sorted_and_rotated {

    public static int search(int a[], int t, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        // L1

        if (a[mid] == t) {
            return mid;
        }

        if (a[si] <= a[mid]) {

            // case a:Left
            if (a[si] <= t && t <= a[mid]) {
                return search(a, t, si, mid - 1);

            //case b:right  
            } else {
                return search(a, t, mid + 1, ei);
            }
        }

        else {
            //L2
            if(a[mid+1]<=t && t<=a[ei]){
                return search(a, t, mid+1, ei);
            }
            else{
                return search(a, t, si, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tIdx = search(a, target, 0, a.length - 1);
        System.out.println("Element is found at "+tIdx);

    }

}
