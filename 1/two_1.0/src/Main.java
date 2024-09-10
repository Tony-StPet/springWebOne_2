import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
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
        double l = Math.sqrt((x1-x2)*(x1-x2)-(y1-y2)*(y1-y2));
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
        int qr = input.nextInt();
        int wr = input.nextInt();
        double t = Math.sqrt((q1-q2)*(q1-q2)-(w1-w2)*(w1-w2));
        if (t <= qr+wr)
            System.out.println("имеют общую точку или более");

        else
            System.out.println("нет общих точек");

    }
}