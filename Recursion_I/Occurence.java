package Recursion_I;

public class Occurence {
    // public static void fOccurence(int a[], int n, int i) {
    //     if (i == a.length) {
    //         System.out.println(n + " is not present in the given array");
    //         return;
    //     }
    //     if (a[i] == n) {
    //         System.out.println(" First occurence of " + n + " is at index " + i);
    //         return;
    //     }
    //     fOccurence(a, n, i + 1);

    // }

    public static int fOccurence(int a[], int n, int i) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == n) {
            return i;
        }
        return fOccurence(a, n, i + 1);

    }

    public static int lOccurence(int a[], int n, int i) {
        if (i == a.length) {
            return -1;
        }
        int isFound=lOccurence(a, n, i + 1);
        if (isFound==-1 && a[i]==n){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 4, 5 };
        int n = 5, i = 0;
        // fOccurence(a, n, i);
        System.out.println(fOccurence(a, n, i));
        System.out.println(lOccurence(a, n, i));


    }
}
