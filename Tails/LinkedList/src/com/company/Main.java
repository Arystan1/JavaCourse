package com.company;

public class Main {

    public static void main(String[] args) {

        //LinkedList
        LinkedList newList = new LinkedList();

        newList.append(0);
        newList.append(1);
        newList.append(2);
        newList.append(3);
        newList.append(1, 9);
        System.out.println("------LinkedList------");
        newList.print();
        System.out.println("----------------------");
        newList.delete(3);
        newList.print();
        System.out.println("----------------------");

        //ArrayList
        ArrayList array = new ArrayList(10);
        array.append(15);
        array.append(20);
        array.append(25);
        array.append(30);
        array.append(35);
        array.append(40);
        array.append(45);
        array.append(50);
        array.append(55);
        array.append(60);

        array.append(2, 66);
        array.append(2, 77);
        array.append(2, 88);
        array.append(2, 99);

        array.delete(2);
        System.out.println("------ArrayList------");
        array.print();
        System.out.println("----------------------");

        //Interface
        System.out.println("size of linked list : " + Printable.returnSize(newList));
        System.out.println("size of array list : " + Printable.returnSize(array));
    }
}
