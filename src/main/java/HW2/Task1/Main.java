package HW2.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(25);
        mll.insertFirst(35);

        System.out.println(mll.getFirst());
        System.out.println(mll.size());

        System.out.println(mll);

        mll.insert(3, 111);
        System.out.println(mll);

        System.out.println(mll.remove(25));
        System.out.println(mll);
        System.out.println(mll.indexOf(15));
    }
}
