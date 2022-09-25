import java.util.Scanner;
public class matrix {
    private int n;
    private int[][] arr;
    private final Scanner sc = new Scanner(System.in);
    public void matrixSize() {  // введення розміру матриці
        System.out.print("Введіть размір матриці: ");
        try { // блок коду що викликає помилку
            n = sc.nextInt();
            arr = new int[n][n];
        }
        catch (Exception ex) { // оброблення винятку
            System.out.println("Введіть ціле число!");
            System. exit(0); // завершення роботі програми
        }
    }
    public void fillMatrix(){   // введення елементів до матриці
        System.out.println("Заповнення матриці: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Елемент a[" + i + "][" + j + "] = ");
                try {   // блок коду що викликає помилку
                    arr[i][j] = sc.nextInt();
                } catch (Exception ex) {     // оброблення винятку
                    System.out.println("Введіть ціле число!");
                    System. exit(0);    // завершення роботі програми
                }
            }
        }
        sc.close();
    }
    public void printMatrix(){ // виведення елементів матриці
        System.out.println("Матриця: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int colMaxPairNum(){ //пошук стовпця з максимальним парним числом
        boolean pair = false;
        int max = Integer.MIN_VALUE;
        System.out.println("\n Стовпець з максимальним парним числом: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if( arr[i][j] % 2 == 0){ // пошук парного числа
                    pair = true;
                    if(arr[i][j] > max){
                        System.out.print(arr[i][j] + "\t"); // виведення стовпця з максимальним парним числом
                        System.out.println();
                        max = arr[i][j]; // максимальне парне число в матриці
                    }
                }
            }
        }
        if(!pair){ //якщо немає парних чисел в матриці
            throw new IllegalArgumentException("Парні числа відсутні!");
        }
        return max;
    }
}