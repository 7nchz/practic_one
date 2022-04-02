//В области K районов. Известны количество жителей (в тыс. чел.) и плотность населения
// (тыс. чел./км2)
// каждого района. Определить самый густонаселённый район области. 104 задание //


import java.util.Scanner;
 class four {
     public static void main(String[] args) {
         double first;
         double second;
         Scanner reader = new Scanner(System.in);
         System.out.print("Введите численность первого райнона");
         System.out.print("Введите численность второго райнона");
         first = reader.nextDouble();
         second = reader.nextDouble();
         if (first > second) {
             System.out.print("Первый район больше");
         } else if (second > first) {
             System.out.print("Второй район больше");
         }
     }
 }


