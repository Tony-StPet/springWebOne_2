//Задана последовательность, состоящая только из символов ‘>’, ‘<’ и ‘-‘.
//Требуется найти количество стрел, которые спрятаны в этой последовательности.
//        Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
//Входные данные. В первой строке входного файла INPUT.TXT записана строка, состоящая из символов ‘>’, ‘<’ и ‘-‘ (без пробелов).
//        Строка состоит не более, чем из 250 символов. 	<<<<>>--><--<<--<<>>>--><<<<<

import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*        System.out.println("Input a number: ");
        int num = input.nextInt();

        if (num > 0)
            System.out.println("positive");

        else
            System.out.println("negative or 0");

        System.out.println("Введите два числа: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2)
            System.out.println("они равны");

        else
            System.out.println("числа не равны");

        System.out.println("Введите два числа: ");
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        if (num3 == num4)
            System.out.println("они равны");

        else if (num3 > num4)
            System.out.println("первое");

        else
            System.out.println("второе");

        System.out.println("Введите две координаты: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        double l = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if (l < 10)
            System.out.println("близко");

        else
            System.out.println("далеко");

        System.out.println("Две окружности , они имеют общие точки?: ");
        System.out.println("Введите две координаты: ");
        int q1 = input.nextInt();
        int w1 = input.nextInt();
        int q2 = input.nextInt();
        int w2 = input.nextInt();
        System.out.println("Введите два радиуса: ");
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        double t = Math.sqrt((q2-q1)*(q2-q1)+(w2-w1)*(w2-w1));
        if (t<Math.abs(r1- r2))
            System.out.println("одна окр вписана в другую и не пересекаются");
        if (t <= r2+ r2)
            System.out.println("имеют общую точку или более");

        else
            System.out.println("нет общих точек");
*/


        Scanner sc = new Scanner(System.in); // создаем новый объект класса Scanner
        System.out.println("Введите данные:");     // передаем в конструктор входной поток System.in
        String strelki = sc.nextLine(); // вызываем метод nextLine() у объекта strelki класса Scanner
        System.out.println("Спасибо! Вы ввели "  + strelki);      // => Спасибо! Вы ввели

        String seq1 = ">>-->";
        String seq2 = "<--<<";
        int count1=countSubstring(strelki,seq1);
        int count2=countSubstring(strelki,seq2);

        System.out.println(">>--> найдены:: "  + (count1) + " раз");      // вывод
        System.out.println("<--<< найдены:: "  + (count2) + " раз");
    }
    public static int countSubstring(String text, String substring){
        int count=0;
        int index=0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index=index+1;// если ввести index+=substring.length(); - то будет уникальные значение в строке
        }
        return count;

    }
}