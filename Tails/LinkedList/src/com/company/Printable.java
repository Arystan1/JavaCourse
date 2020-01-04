package com.company;

public interface Printable {
    void print();
    void append(int el);
    void append(int index, int el);
    void delete(int index);
    int getElement(int index);
    int getSize();

    static int returnSize(Printable obj) {
        return obj.getSize();
    }
}
