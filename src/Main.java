public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[]arr1=new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        double[]arr2={1.57,7.654,9.986};
        char[]arr3={'a','b','c','d','e'};
        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
                System.out.println();
        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3.length-1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
            }

        }


