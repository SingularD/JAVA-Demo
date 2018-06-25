package chapter11;

import java.util.ArrayList;

public class testUnion {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(45);
        list1.add(4);
        list1.add(3);
        list2.add(33);
        list2.add(51);
        list2.add(5);
        list2.add(4);
        list2.add(13);
        for (Integer as : list1)
            System.out.print(as + " ");
        System.out.println();
        for (Integer as : list2)
            System.out.print(as + " ");
        list3 = union(list1, list2);
        for (Integer as : list3)
            System.out.print(as + " ");
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            list3.set(i, list1.get(i));
        }

        for (int i = 0, j = list1.size(); i < list2.size(); i++, j++) {
            list3.set(j, list2.get(i));
        }

        return list3;
    }
}
