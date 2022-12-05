import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 4");
        int[] arr1 = {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}




