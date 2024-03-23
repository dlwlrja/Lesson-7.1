import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int toadEyesCount = 0;          //Жабьи глаза
                int ghoulTearsCount = 0;        //Слезы вурдалака
                int ravenBonesCount = 0;        //Кости ворона
                int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        boolean isCanDo = false;
        System.out.println("Введите кол-во ингредиентов");
        System.out.println("Жабьи глаза");
        int eyes = new Scanner(System.in).nextInt();
        System.out.println("Слезы вурдалака");
        int tears = new Scanner(System.in).nextInt();
        System.out.println("Кости ворона");
        int bones = new Scanner(System.in).nextInt();
        System.out.println("Пельмени");
        int dump = new Scanner(System.in).nextInt();

        isCanDo = true;
        if (eyes>=3 && bones>=1){
            System.out.println("Вы можете сделать эликсир зоркости");
        }
        isCanDo=true;
        if (bones>=2 && dump>=4){
            System.out.println("Вы можете сделать эликсир стойкости");
        }
        isCanDo=true;
        if (tears>=7 && dump>= 1 && eyes>=2){
            System.out.println("Вы можете сделать эликсир скрытности");
        }
        isCanDo = true;
        if (tears>=5 && dump>=10 && eyes>=4 && bones>=3){
            System.out.println("Вы можете сделать запретный эликсир");
        }
        if (isCanDo==false){
            System.out.println("У Вас недостаточно ингредиентов");
        }

        }

        //todo реализовать ввод пользователем кол-ва ингредиентов.

                //Рецепты Эликсиров:
                // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
                // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
                // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
                // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

                //todo дописать логику программы сюда
            }

  