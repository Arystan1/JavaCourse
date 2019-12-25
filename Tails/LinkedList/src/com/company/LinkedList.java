package com.company;

public class LinkedList {

    public int element;
    public LinkedList nextElement;

    public LinkedList(int el)
    {
        LinkedList curr = this;

        if(curr.nextElement == null)
        {
            this.element = el;
        }
        else
        {
            while(curr.nextElement != null)
            {
                curr = curr.nextElement;
            }

            curr.nextElement.element = el;
        }
    }

    public void add(int el)
    {
        LinkedList curr = this;

        while(curr.nextElement != null)
        {
            curr = curr.nextElement;
        }

        curr.nextElement = new LinkedList(el);
    }

    public int size()
    {
        LinkedList curr = this;
        int size = 1;

        while(curr.nextElement != null)
        {
            size++;
            curr = curr.nextElement;
        }

        return size;
    }

    public void print()
    {
        LinkedList curr = this;

        for(int i = 0; i < this.size(); i++)
        {
            System.out.println(curr + " " + curr.element);
            curr = curr.nextElement;
        }

    }
}
