import java.util.Scanner;
class River{
    String nameRiver; // назва річки
    String location;// місцезнаходження
    double length; // довжина річки
}

public class RiverScan{
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in, "cp1251");
// Введення інформації про країни
        System.out.println("Введіть кількість річок = >");
        int n=sc.nextInt(); // кількість країн
        River[] water = new River [n] ;
        System.out.println("Введіть інформацію о річці :" );
        for(int i = 0; i< water.length; i++) {
            sc.nextLine(); // очищення буфера
            water [i] = new River ();
            System.out.print ( " Назва " + ( i + 1 ) + " - ї річки = > " ) ;
            water[i].nameRiver = sc.nextLine () ;
            System.out.print ( " Місцезнаходження " + ( i + 1 ) + " - ї річки = > " ) ;
            water[i].location = sc.nextLine () ;
            System.out.print ( " Довжина " + ( i + 1 ) + " - ї річки = > " ) ;
            water[i].length = sc.nextDouble() ;
        }
        // Виведення отриманої інформації
        System.out.println ( "\n Характеристики річок : " ) ;
        for (River river : water) {
            System.out.println(" " + river.nameRiver + "\t" + river.location + "\t" + river.length + " км ");
        }

        // 1. Визначити найкоротшу річку;

        int nomMin=0; //номер елемента для країни з максимальною площею (початкове значення)

        double mix = water[nomMin].length; //максимальна площа (початкове значення)

        for (int i = 0; i< water.length; i++) if (water[i].length<mix) {
            mix = water [i].length;
            nomMin=i;
        }
        System.out.println("\n 1. Найкоротша річка :");
        System.out.println(""+water[nomMin].nameRiver+"\t"+water[nomMin].length +" км ");

        //2. Вивести інформацію про річки з довжиною більшою за середню;

        double l=0; //сумарна довжина
        for (River river : water) l += river.length;
        double sr=l/water.length; // середня довжина
        System.out.println("\n 2. Середня довжина річок ="+sr);
        System.out.println("Річка, з довжиною більше середньої:");
        for (River river : water) {
            if (river.length > sr)
                System.out.println(river.nameRiver + "\t" + river.length + " км ");
        }

        // 3. Упорядкувати список річок за назвами за абеткою;

        for (int i = 0; i < water.length-1; i++)
            for (int j = 0; j < water.length-i-1; j++)
        if(water [j].nameRiver.compareTo(water[i+1].nameRiver)>0){
            River rab=water[j]; //rab – робоча змінна для перестановки
            water [j] = water [j + 1];
            water [j + 1] = rab;
        }
        System.out.println("\n 3. Відсортований список список річок за назвами за абеткою:");
        for (River river : water) {
            System.out.println("" + river.nameRiver + "\t" + river.length + " км ");
        }

        // 4.Організувати пошук за назвою річки, виправлення одного з полів та виведення повної інформації про річку після редагування.
        System.out.print("\n-Редагування даних-");
        System.out.print("\nВведіть назву річки для виправлення інформації => ");
        sc.nextLine();
        String nameRiver = sc.nextLine();

        for (River river : water) {
            if (river.nameRiver.equals(nameRiver)) {


                System.out.println("Виберіть, що треба виправити: ");
                System.out.println("1 - Назва річки \n2 - Місцезнаходження \n3 - Довжину ");
                int action = sc.nextInt();
                sc.nextLine();

                switch (action) {
                    case 1 -> {
                        System.out.print("Введіть нову назву річки => ");
                        river.nameRiver = sc.nextLine();
                    }
                    case 2 -> {
                        System.out.print("Введіть нове місцезнаходження => ");
                        river.location = sc.nextLine();
                    }
                    case 3 -> {
                        System.out.print("Введіть нову довжину => ");
                        river.length = sc.nextDouble();
                    }
                    default -> System.out.print("Помилка,оберіть дію від 1 до 3!");
                }
                System.out.println("Інформація після виправлення: ");
                System.out.println("\t" + river.nameRiver + " \t" + river.location + " \t" + river.length);
            }
        }
}
}
