import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array1 = {10,11,12,13,14,15,16,17,18};
        System.out.println("Danh sach phan tu: " + Arrays.toString(array1));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        int number = sc.nextInt();

        int index = -1;
        for(int i=0; i<array1.length; i++) {
            if(array1[i] == number) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            for (int i = index; i < array1.length - 1; i++) {
                array1[i] = array1[i + 1];
            }
            array1 = Arrays.copyOf(array1, array1.length - 1);
            System.out.println("Mang sau khi xoa phan tu: " + Arrays.toString(array1));
        } else {
            System.out.println("Khong tim thay phan tu can xoa");
        }

    }
}