public class program {
    public static void main(String[] args) {
        matrix matr = new matrix();
        matr.matrixSize();
        matr.fillMatrix();
        System.out.println();
        matr.printMatrix();

        try { // блок коду що викликає помилку
            System.out.println("\n Максимальне,парне число в матриці: " + matr.colMaxPairNum());
        }
        catch (Exception ex){
            System.out.println("Помилка: " + ex); // оброблення винятку
        }
        finally {
            System. exit(0); // завершення роботі програми
        }
    }
}
