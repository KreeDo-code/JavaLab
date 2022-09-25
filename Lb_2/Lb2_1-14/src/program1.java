public class program1 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("Неперевірена помилка");//створено екземпляр RuntimeException з повідомленням «кинуто»
        } catch (RuntimeException e) { // виняток перехоплено
            System.out.println("1 " + e); // виняток опрацьовано
        }
        System.out.println("2");
    }
}
