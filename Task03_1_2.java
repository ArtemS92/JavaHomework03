import java.util.ArrayList;
import java.util.List;

public class Task03_1_2 {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(1, 6, 7, 8, 3);
        ArrayList<Integer> list1 = new ArrayList<>(l1);
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list1.add(i);
//        }
        List<Integer> l2 = List.of(1, 6, 7, 8, 3);
        ArrayList<Integer> list2 = new ArrayList<>(l2);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int j = 0; j < 5; j++) {
//            list2.add(j);
//        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(equalsArray(list1, list2));  //Task_3_1
        System.out.println(findNum(list1, list2, 8)); //Task_3_2
    }

    //На вход приходят два ArrayList<Integer> напишите метод,
//который проверяет два массива на равенство.
//Нужно реализовать алгоритм, не использовать метод equals
    public static boolean equalsArray(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int count = 0;
        for (Integer i : list1) {
            count++;
        }
        for (Integer i : list2) {
            count--;
        }
        if (count == 0) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != list2.get(i)) {
                    return false;
                }
            }
        } else return false;
        return true;
    }


    //    На вход методу приходят два ArrayList<Integer> и целое число num.
//    Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.
    public static boolean findNum(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (num == list1.get(i)) {
                count++;
            }
        }
        for (int j = 0; j < list2.size(); j++) {
            if (num == list2.get(j)) {
                count--;
            }
        }
        return count == 0;
    }
}