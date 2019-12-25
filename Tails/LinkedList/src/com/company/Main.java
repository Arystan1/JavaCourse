package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList newList = new LinkedList();
        newList.element = 5;
        LinkedList newList1 = new LinkedList();
        newList1.element = 9;
        LinkedList newList2 = new LinkedList();
        newList2.element = 15;

        newList.nextElement = newList1;
        newList1.nextElement = newList2;

        System.out.println(newList.element);
        System.out.println(newList1.element);
        System.out.println(newList2.element);;
    }
}
