package Homeworks.HW9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());
        System.out.println(list.indexOf(2));
        System.out.println(list.contains(3));
        list.add(4, 1);
        //        Не виводить нормально масив
        System.out.println(list);
        System.out.println(list.get(0));

//        Не виводить нормально масив
        list.remove(1);
        System.out.println(list);

//        Я спробував створити звичайний ArrayList, і тут виводить номально
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        System.out.println(testList);
    }
}
