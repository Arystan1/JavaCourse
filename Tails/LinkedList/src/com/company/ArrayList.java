package com.company;

public class ArrayList implements Printable{

    private int[] element;
    private int size = 0;

    public ArrayList(int Capacity) {
        this.element = new int[Capacity];
    }

    public void append(int el) {
        this.element[this.size++] = el;
    }

    public void append(int index, int el) {

        ArrayList firstPart = this.cloneFirstPartOfArray(index);
        ArrayList secondPart = this.cloneLastPartOfArray(index);

        firstPart.append(el);

        this.size++;
        this.element = concatArray(firstPart, secondPart);
    }

    public void delete(int index) {
        ArrayList firstPart = this.cloneFirstPartOfArray(index);
        ArrayList secondPart = this.cloneLastPartOfArray(index + 1);

        this.size--;
        this.element = concatArray(firstPart, secondPart);
    }

    public int getElement(int index) {
        return this.element[index];
    }

    private ArrayList cloneFirstPartOfArray(int index) {
        ArrayList result = new ArrayList(this.size);

        for(int i = 0; i < index; i++) {
            result.element[i] = this.element[i];
            result.size++;
        }

        return result;
    }

    private ArrayList cloneLastPartOfArray(int index) {
        ArrayList result = new ArrayList(this.size - index);
        int temp = index;

        for(int i = 0; i < this.size - index; i++) {
            result.element[i] = this.element[temp];
            temp++;
            result.size++;
        }

        return result;
    }

    private int[] concatArray(ArrayList ar1, ArrayList ar2) {
        ArrayList result = new ArrayList(ar1.size + ar2.size + 1);
        System.arraycopy(ar1.element, 0, result.element, 0,  ar1.size);
        System.arraycopy(ar2.element, 0, result.element, ar1.size, ar2.size);

        return result.element;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for(int i = 0; i < this.size; i++) {
            System.out.println(i + " " + this.element[i]);
        }
    }
}
