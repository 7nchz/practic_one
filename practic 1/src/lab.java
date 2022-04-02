
//Даны вещественное число а и натуральное число n. Вычислить Р = а(а + 1) ... (а + n – 1). 29 задание

import java.util.Scanner;

class MyClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        Integer n = scan.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            System.out.printf("a%d = ", i);
            Integer a = scan.nextInt();
            if ((a == 0 || a == 1) && !(a == 0 && i == n-1)) {
                res +=  String.valueOf(a);
            } else {
                System.out.println("Error");
                System.exit(1);
            }
        }
        System.out.println("sequence = " + res);
        Integer res_int = Integer.parseInt(res, 2);
        System.out.println("integer = " + res_int);
        System.out.println("p-1 = " + Integer.toBinaryString(res_int-1));
    }
}