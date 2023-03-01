package usc;

import code.BeanA;
import code.BeanB;

import java.util.*;


public class TestComparison {

    private static void printList(List list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<BeanA> list = new ArrayList<>();
        list.add(new BeanA(3));
        list.add(new BeanA(5));
        list.add(new BeanA(1));
        printList(list);
        Collections.sort(list);
        printList(list);

        List<BeanB> list1 = new ArrayList<>();
        list1.add(new BeanB("X"));
        list1.add(new BeanB("B"));
        list1.add(new BeanB("C"));
        printList(list1);
        Collections.sort(list1, new Comparator<BeanB>() {
            @Override
            public int compare(BeanB a, BeanB b) {
                return a.getName().compareTo(b.getName());
            }
        });
        printList(list1);

    }
}

