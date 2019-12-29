package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList newList = new LinkedList();

        newList.add(0);
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.addViaIndex(1, 9);
        newList.print();
        System.out.println("-----------");
        newList.deleteViaIndex(3);
        newList.print();
        //System.out.println(newList.getNode(0));
    }
}
