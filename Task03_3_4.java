import java.util.*;


public class Task03_3_4 {
    public static void main(String[] args) {
        List<Integer> l = List.of(10, 4, 5, 6, 7, 2, 2, 9);
        ArrayList<Integer> list = new ArrayList<>(l);
//        removeEven(list); // Task3_4
        System.out.println(evenSorting(list)); // Task3_3
    }

    //    На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)
    public static void removeEven(ArrayList<Integer> list) {
        list.removeIf(current -> current % 2 == 0);
        System.out.println(list);
    }

    //    На вход приходит ArrayList<Integer>.
//    Отсортируйте в нем только четные числа.
//    Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
    public static ArrayList<Integer> evenSorting(ArrayList<Integer> list) {
        ArrayList<Integer> even = new ArrayList<>(); //
        int j = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        Collections.sort(even);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, even.get(j));
                j++;
            }
        }
        return list;
    }
}

