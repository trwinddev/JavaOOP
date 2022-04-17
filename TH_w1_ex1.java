import java.util.Scanner;

public class TH_w1_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Sắp xếp dãy số tăng dần
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
                }
            }
        }
        System.out.println("Sap xep tang dan: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sắp xếp dãy số giảm dần
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
                }
            }
        }
        System.out.println("Sap xep giam dan: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Tính trung bình cộng
        System.out.println();
        double sum = 0;
        double tbc = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        tbc = sum / n;
        System.out.println("Trung binh cong: ");
        System.out.format("%.2f", tbc);
    }
}
