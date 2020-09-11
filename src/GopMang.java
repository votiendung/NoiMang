import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr1 = new int[3];
//        int[] arr2 = new int[3];
//        for (int i = 0; i< arr1.length; i++) {
//            System.out.println("nhap cac phan tu");
//            arr1[i] = sc.nextInt();
//        }
        int[] arr1 = {4,5,6};
        int[] arr2 = {7,8,9};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i< arr1.length; i++){
            arr3[i] = arr1[i];


            }

        for (int i = 0; i< arr2.length; i++ ) {
            arr3[i+arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
