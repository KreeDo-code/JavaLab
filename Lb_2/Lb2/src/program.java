public class program {
    public static void main(String[] args) {
        matrix matr = new matrix();
        matr.matrixSize();
        matr.fillMatrix();
        System.out.println();
        matr.printMatrix();

        try { // ���� ���� �� ������� �������
            System.out.println("\n �����������,����� ����� � �������: " + matr.colMaxPairNum());
        }
        catch (Exception ex){
            System.out.println("�������: " + ex); // ���������� �������
        }
        finally {
            System. exit(0); // ���������� ����� ��������
        }
    }
}
