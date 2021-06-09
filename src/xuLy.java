import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 10;

        Scanner nhap = new Scanner(System.in);
        System.out.println("Mảng 1:");
        int [] arr1 = new int[a];
        for (int i = 0; i<a; i++){
            System.out.print("Nhập phần tử thứ "+(i+1) + ": ");
            arr1[i]= nhap.nextInt();
        }
        System.out.print("Mảng sau khi nhập là:");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        int [] arr2 = new int[b];
        System.out.println("\n Mảng 2:");
        for (int i = 0; i<b; i++){
            System.out.print("Nhập phần tử thứ "+(i+1) + ": ");
            arr2[i]= nhap.nextInt();
        }
        System.out.print("Mảng sau khi nhập là: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        int [] arr3 = new int [c];
        int index = 0;
        for (int element: arr1){
            arr3[index] =element;
            index++;
        }
        for (int element: arr2){
            arr3[index] =element;
            index++;
        }

        System.out.println("\n Mảng sau khi gộp: ");
        for (int i =0; i < arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
