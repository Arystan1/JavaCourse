package com.company;

public class LinkedList implements Printable{

    private Node Head;
    private int size = 0;

    private class Node {

        private int element;
        private Node nextElement;
        private int index;

        private Node(int el)
        {
            Node curr = this;
            LinkedList list = LinkedList.this;

            if(curr.nextElement == null)
            {
                this.element = el;
                this.index = list.size;
            }
            else
            {
                while(curr.nextElement != null)
                {
                    curr = curr.nextElement;
                }

                curr.nextElement.element = el;
                this.index = list.size;
            }
        }
    }

    public LinkedList(int el)
    {
        this.Head = new Node(el);
        this.size++;
    }

    public LinkedList(){}

    public void append(int el)
    {
        Node curr = this.Head;

        if(curr == null)
        {
            this.Head = new Node(el);
            this.size++;

            return;
        }

        while(curr.nextElement != null)
        {
            curr = curr.nextElement;
        }

        curr.nextElement = new Node(el);
        curr.nextElement.index = this.size;
        this.size++;
    }

    public void append(int index, int el)
    {
        Node curr = this.Head;
        Node firstPart, secondPart;

        //exception index < 0 and index > size
        if(index > this.size || index < 0)
        {
            System.out.println("Incorrect index!");
            return;
        }
        //exception index = 0
        if(index == 0)
        {
            Node base = new Node(el);
            base.nextElement = curr;
            base.index = 0;

            //increment next elements
            Node temp = curr;
            while(temp != null)
            {
                temp.index++;
                temp = temp.nextElement;
            }

            this.Head = base;
            this.size++;

            return;
        }

        //others
        //get first and second part
        while(curr.index < index - 1)
        {
            curr = curr.nextElement;
        }

        secondPart = curr.nextElement;

        //increment next elements
        Node temp = secondPart;
        while(temp != null)
        {
            temp.index++;
            temp = temp.nextElement;
        }

        //collect 2 parts
        firstPart = curr.nextElement = new Node(el);;
        firstPart.index = index;
        firstPart.nextElement = secondPart;

        this.size++;
    }

    public void delete(int index)
    {
        Node curr = this.Head;
        Node firstPart, secondPart;
        Node temp;

        //exception index < 0 and index > size
        if(index > this.size - 1 || index < 0)
        {
            System.out.println("Incorrect index!");
            return;
        }
        //exception index = 0
        if(index == 0)
        {
            curr = curr.nextElement;

            //decrement next elements
            temp = curr;
            while(temp != null)
            {
                temp.index--;
                temp = temp.nextElement;
            }

            this.Head = curr;
            this.size--;

            return;
        }

        //others
        //get first and second part
        while(curr.index < index - 1)
        {
            curr = curr.nextElement;
        }

        temp = curr.nextElement;

        //decrement next elements
        while(temp != null)
        {
            temp.index--;
            temp = temp.nextElement;
        }

        //collect 2 parts
        firstPart = curr;
        secondPart = curr.nextElement;
        firstPart.nextElement = secondPart.nextElement;

        this.size--;
    }

    public int getElement(int index)
    {
        Node curr = this.Head;

        while(curr.index < index)
        {
            curr = curr.nextElement;
        }

        return curr.element;
    }

    public Node getNode(int index)
    {
        Node curr = this.Head;

        while(curr.index < index)
        {
            curr = curr.nextElement;
        }

        return curr;
    }

    public int getSize()
    {
        return this.size;
    }

    public void print()
    {
        Node curr = this.Head;

        for(int i = 0; i < this.size; i++)
        {
            System.out.println(curr + " " + curr.index + " " +  curr.element);
            curr = curr.nextElement;
        }
    }
}
