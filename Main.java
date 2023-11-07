package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Напишите метод,
 который добавляет 500000 элементов в ArrayList и LinkedList
  и измерьте время, которое потрачено на это. Сравните результаты.*/
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> List = new ArrayList<>();
        long endTime = 0;
        for (int i = 0; i < 500000; i++) {
            List.add(i);
            System.out.println("ArrayList " + List.add(i));
            endTime = System.currentTimeMillis();
            System.out.println("Скорость выполнения программы: " + (endTime - startTime) + " ms");
        }
        long startTime2 = System.currentTimeMillis();
        LinkedList<Integer> List2 = new LinkedList<>();
        long endTime2 = 0;
        for (int i = 0; i < 500000; i++) {
            List2.add(i);
            System.out.println("LinkedList " + List2.add(i));
            endTime2 = System.currentTimeMillis();
            System.out.println("Скорость выполнения программы: " + (endTime2 - startTime2) + " ms");
        }
        System.out.println(List);   // распечатывает ArrayList<>
        System.out.println(List2);  // распечатывает LinkedList<>

        long time = (endTime - startTime) - (endTime2 - startTime2); // считает разницу по времени
        System.out.println("Разность результата между ArrayList и LinkedList = " + time + " ms" );
        if ( time > 0){
            System.out.println("ArrayList затратил больше времени на добавление элементов, чем LinkedList");
        }else if (time == 0){
            System.out.println("Время выполнения операции на добавление элементов одинаково");
        }else{
            System.out.println("LinkedList затратил больше времени на добавление элементов, чем ArrayList");
            }




    }


}