import java.util.Scanner;
public class matrix {
    private int n;
    private int[][] arr;
    private final Scanner sc = new Scanner(System.in);
    public void matrixSize() {  // �������� ������ �������
        System.out.print("������ ����� �������: ");
        try { // ���� ���� �� ������� �������
            n = sc.nextInt();
            arr = new int[n][n];
        }
        catch (Exception ex) { // ���������� �������
            System.out.println("������ ���� �����!");
            System. exit(0); // ���������� ����� ��������
        }
    }
    public void fillMatrix(){   // �������� �������� �� �������
        System.out.println("���������� �������: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("������� a[" + i + "][" + j + "] = ");
                try {   // ���� ���� �� ������� �������
                    arr[i][j] = sc.nextInt();
                } catch (Exception ex) {     // ���������� �������
                    System.out.println("������ ���� �����!");
                    System. exit(0);    // ���������� ����� ��������
                }
            }
        }
        sc.close();
    }
    public void printMatrix(){ // ��������� �������� �������
        System.out.println("�������: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int colMaxPairNum(){ //����� ������� � ������������ ������ ������
        boolean pair = false;
        int max = Integer.MIN_VALUE;
        System.out.println("\n �������� � ������������ ������ ������: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if( arr[i][j] % 2 == 0){ // ����� ������� �����
                    pair = true;
                    if(arr[i][j] > max){
                        System.out.print(arr[i][j] + "\t"); // ��������� ������� � ������������ ������ ������
                        System.out.println();
                        max = arr[i][j]; // ����������� ����� ����� � �������
                    }
                }
            }
        }
        if(!pair){ //���� ���� ������ ����� � �������
            throw new IllegalArgumentException("���� ����� ������!");
        }
        return max;
    }
}