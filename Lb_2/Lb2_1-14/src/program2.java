public class program2 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("����������� �������");

        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
