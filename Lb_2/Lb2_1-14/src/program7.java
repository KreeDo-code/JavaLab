public class program7 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();//для перехоплення даного виключення необхідно створити новий обробник
        } catch (ArithmeticException e) {
            System.out.println("2" );

        }
        System.out.println("3");
    }
}
