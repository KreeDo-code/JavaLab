import java.util.Scanner;

public class RecSort {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ������� ����������� =>");
        int kol = sc.nextInt();
        sc.nextLine();

        Sotrudnik[] sotr = new Sotrudnik[kol];
        System.out.println("������ ���������� ��� ������� �����������: ");
        for (int i = 0; i <  sotr.length; i++){
            sotr[i] = new Sotrudnik();

            System.out.println("������ ������� " + (i+1) + " ����������� =>");
            sotr[i].fam = sc.nextLine();

            System.out.println("������ ��'� " + (i+1) + " ����������� =>");
            sotr[i].im = sc.nextLine();

            System.out.println("������ �� ������� " + (i+1) + " ����������� => ");
            sotr[i].otch = sc.nextLine();

            System.out.println("������ ������ " + (i+1) + " ����������� => ");
            sotr[i].doljnost = sc.nextLine();

            System.out.println("������ ������� ���� ����������� => ");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();

            if(sotr[i].kolDet != 0){
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("ĳ�� => ");
                for (int j = 0; j < sotr[i].reb.length; j++){
                    sotr[i].reb[j] = new Rebenok();

                    System.out.println("������ ��'�  " + (j+1) + " ������ => ");
                    sotr[i].reb[j].imaR = sc.nextLine();

                    System.out.println("������ �� " + (j+1) + " ������ => ");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\n����������� �����:\n�������\t��'�\t�� �������\t������\t�����");
        for (int i = 0; i <  sotr.length; i++){
            System.out.println(sotr[i].fam + "\t" +  sotr[i].im + "\t" +  sotr[i].otch + "\t"
                    +  sotr[i].doljnost);
            System.out.println("ĳ��: ");
            for (int j = 0; j < sotr[i].reb.length; j++){
                System.out.println("\t\t" + sotr[i].reb[j].imaR + "\t\t" + sotr[i].reb[j].vozrastR);
                System.out.println();
            }
        }

    }
}
