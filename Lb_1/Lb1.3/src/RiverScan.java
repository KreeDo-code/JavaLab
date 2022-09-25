import java.util.Scanner;
class River{
    String nameRiver; // ����� ����
    String location;// ���������������
    double length; // ������� ����
}

public class RiverScan{
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in, "cp1251");
// �������� ���������� ��� �����
        System.out.println("������ ������� ���� = >");
        int n=sc.nextInt(); // ������� ����
        River[] water = new River [n] ;
        System.out.println("������ ���������� � ���� :" );
        for(int i = 0; i< water.length; i++) {
            sc.nextLine(); // �������� ������
            water [i] = new River ();
            System.out.print ( " ����� " + ( i + 1 ) + " - � ���� = > " ) ;
            water[i].nameRiver = sc.nextLine () ;
            System.out.print ( " ̳�������������� " + ( i + 1 ) + " - � ���� = > " ) ;
            water[i].location = sc.nextLine () ;
            System.out.print ( " ������� " + ( i + 1 ) + " - � ���� = > " ) ;
            water[i].length = sc.nextDouble() ;
        }
        // ��������� �������� ����������
        System.out.println ( "\n �������������� ���� : " ) ;
        for (River river : water) {
            System.out.println(" " + river.nameRiver + "\t" + river.location + "\t" + river.length + " �� ");
        }

        // 1. ��������� ���������� ����;

        int nomMin=0; //����� �������� ��� ����� � ������������ ������ (��������� ��������)

        double mix = water[nomMin].length; //����������� ����� (��������� ��������)

        for (int i = 0; i< water.length; i++) if (water[i].length<mix) {
            mix = water [i].length;
            nomMin=i;
        }
        System.out.println("\n 1. ���������� ���� :");
        System.out.println(""+water[nomMin].nameRiver+"\t"+water[nomMin].length +" �� ");

        //2. ������� ���������� ��� ���� � �������� ������ �� �������;

        double l=0; //������� �������
        for (River river : water) l += river.length;
        double sr=l/water.length; // ������� �������
        System.out.println("\n 2. ������� ������� ���� ="+sr);
        System.out.println("г���, � �������� ����� ��������:");
        for (River river : water) {
            if (river.length > sr)
                System.out.println(river.nameRiver + "\t" + river.length + " �� ");
        }

        // 3. ������������ ������ ���� �� ������� �� �������;

        for (int i = 0; i < water.length-1; i++)
            for (int j = 0; j < water.length-i-1; j++)
        if(water [j].nameRiver.compareTo(water[i+1].nameRiver)>0){
            River rab=water[j]; //rab � ������ ����� ��� ������������
            water [j] = water [j + 1];
            water [j + 1] = rab;
        }
        System.out.println("\n 3. ³����������� ������ ������ ���� �� ������� �� �������:");
        for (River river : water) {
            System.out.println("" + river.nameRiver + "\t" + river.length + " �� ");
        }

        // 4.����������� ����� �� ������ ����, ����������� ������ � ���� �� ��������� ����� ���������� ��� ���� ���� �����������.
        System.out.print("\n-����������� �����-");
        System.out.print("\n������ ����� ���� ��� ����������� ���������� => ");
        sc.nextLine();
        String nameRiver = sc.nextLine();

        for (River river : water) {
            if (river.nameRiver.equals(nameRiver)) {


                System.out.println("�������, �� ����� ���������: ");
                System.out.println("1 - ����� ���� \n2 - ̳�������������� \n3 - ������� ");
                int action = sc.nextInt();
                sc.nextLine();

                switch (action) {
                    case 1 -> {
                        System.out.print("������ ���� ����� ���� => ");
                        river.nameRiver = sc.nextLine();
                    }
                    case 2 -> {
                        System.out.print("������ ���� ��������������� => ");
                        river.location = sc.nextLine();
                    }
                    case 3 -> {
                        System.out.print("������ ���� ������� => ");
                        river.length = sc.nextDouble();
                    }
                    default -> System.out.print("�������,������ �� �� 1 �� 3!");
                }
                System.out.println("���������� ���� �����������: ");
                System.out.println("\t" + river.nameRiver + " \t" + river.location + " \t" + river.length);
            }
        }
}
}
