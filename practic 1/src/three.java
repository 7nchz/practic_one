//Даны числа а1, a2, …, а10. Определить их сумму. 81 задание

import java.util.Scanner;

    public class three {
        public static void main(String[] args) {
            int n, i;
            double a, s = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите n:");
            n = scanner.nextInt();
            for (i = 1; i <= n; ++i) {
                System.out.print("Введите a" + i + ": ");
                a = scanner.nextDouble();
                s += a * a;
            }
            System.out.println("\nСумма квадратов: " + s);
        }
    }

