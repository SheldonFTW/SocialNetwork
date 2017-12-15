package training.Io;

import java.time.LocalDate;
import java.util.*;


public class Collection {

    public static void main(String[] args) {

        //List();
        //ListArray();
        //TenIntAndTenString();
        //SetList();
        //MapList();
        TodayPlus();

    }

    private static void TodayPlus() {

        LocalDate today = LocalDate.now();
        List data = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("For how many days do you do to the future?");
        int futufe = scanner.nextInt();

        for (int i = 0; i < futufe; i++) {
            data.add(today.plusDays(i));
        }
        System.out.println(data.size());
        System.out.println(data);
    }


    private static void MapList() {

        Map map = new HashMap<>();
        List<Integer> count = new LinkedList<>();
        List<String> text = new LinkedList<>();

        map.put(1, "hi");
        map.put(2, "hi");
        map.put(3, "hi");
        map.put(4, "hi");
        map.put(5, "hi");
        map.put(6, "hi");
        map.put(7, "hi");
        map.put(8, "hi");
        map.put(9, "hi");
        map.put(10, "hi");
        map.put("Hello", 11);
        map.put("Hello", 12);
        map.put("Hello", 13);
        map.put("Hello", 14);
        map.put("Hello", 15);
        map.put("Hello", 16);
        map.put("Hello", 17);
        map.put("Hello", 18);
        map.put("Hello", 19);
        map.put("Hello", 20);

        for (Object elem : map.values()) {
            if (elem instanceof String) {
                text.add((String) elem);
            }
        }
        for (Object elem2 : map.values()) {
            if (elem2 instanceof Integer) {
                count.add((Integer) elem2);
            }
        }

        System.out.println(map.size());
        System.out.println(map);


    }

    private static void SetList() {

        List<String> text = new LinkedList<>();
        List<Integer> count = new LinkedList<>();
        Set<Integer> setInt = new HashSet<>();
        Set<String> setString = new HashSet<>();

        for (int i = 0; i < 11; i++) {
            text.add("Hi");
        }
        for (int i = 0; i < 11; i++) {
            count.add(i);
        }

        for (String elem : text) {
            setString.add(elem);
        }
        for (Integer elem2 : count) {
            System.out.println(elem2);
        }
        System.out.println(setString);
        System.out.println(setInt);

        for (String elem3 : setString) {
            text.add(elem3);
        }
        for (Integer elem4 : setInt) {
            count.add(elem4);
        }
        System.out.println(text);
        System.out.println(count);
    }

    private static void TenIntAndTenString() {
        List list = new LinkedList();
        List<String> text = new LinkedList<>();
        List<Integer> number = new LinkedList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("g");

        System.out.println("Before");
        System.out.println(number);
        System.out.println(text);

        for (Object element : list) {
            if (element instanceof Integer) {
                number.add((Integer) element);
            } else if (element instanceof String) {
                text.add((String) element);
            }
        }
        System.out.println("Alter");
        System.out.println(number);
        System.out.println(text);
    }

    private static void ListArray() {
        List<Integer> listCount = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listCount.add(i);
            if (i % 2 == 0) {
                listCount.set(i, 10);
            } else {
                listCount.set(i,20);
            }
        }
        System.out.println(listCount);
    }

    private static void List(String hi) {

        List <Integer> listNumber = new LinkedList<>();

        listNumber.add(11);
        listNumber.add(12);
        listNumber.add(13);
        listNumber.add(14);
        listNumber.add(15);
        listNumber.add(16);
        listNumber.add(17);
        listNumber.add(18);
        listNumber.add(19);
        listNumber.add(20);

        Iterator <Integer> iterator = listNumber.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();

            if (element % 2 == 0) {
                System.out.println(element);
            } else {
                iterator.remove();
            }
        }

    }
}
