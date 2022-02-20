public class Week1_ex2 {
    public static int binarySearch(int[] a, int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;

        while (iLeft < iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (key == a[iMid]) {
                return iMid;
            } else if (key > a[iMid]) {
                iLeft = iMid + 1;
            } else {
                iRight = iMid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        System.out.println(binarySearch(a, 8));
    }
}
