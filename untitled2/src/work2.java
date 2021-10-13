

public class work2 {
    public static void main(String[] args){
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
    }
    public static void method1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = arr.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < maxMass; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
    }
    public static void method2() {
        int[] array = new int[100];
        int j = 1;
        int maxMass = array.length;
        System.out.println("");
        for(int i = 0; i < maxMass; i++, j = j+1)
        {array[i] = j;
        }
        for(int i = 0; i < maxMass; i++)
        {
            System.out.print ( array[i]+" ");
        }
        System.out.println("");
    }
    public static void method3(){
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        System.out.println("");
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print ( mas[i]+" ");
        }
        System.out.println("");
    }
    public static void method4() {
        int n = 4;
        int[][] array = new int[n][n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][n - i - 1] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static void method5() {
        int len = 4;
        int initialValue = 2;
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(initialValue + " ");
        }
        System.out.println("");
    }
    public static void method6(){
            int [] arr = {66, 7, 5, 18, 49, 500};
            int max = arr[0];
            int min = arr[0];
            System.out.println(" ");
            for(int i = 0; i != arr.length; i ++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("Минимум " + min + "   Максимум " + max);
            System.out.println("");
        }
    public static boolean method7(){
        int leftSum = 0;

        int[] array = {2, 1, 1, 2, 1};
        int maxMass = array.length;
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;

    }

    }


