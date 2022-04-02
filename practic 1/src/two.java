// Вычислить сумму: 1+1/2+1/3+...+1/n 54 Задание

public class two {
    public static void findSum (int a) {
        double result = 0;

        for(int i=1;i<=a;i++){
            result+=(double)1/i;
        }
        System.out.format("%.3f", result);
    }
}
