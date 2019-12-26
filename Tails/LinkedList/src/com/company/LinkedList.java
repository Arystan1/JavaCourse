package com.company;

public class LinkedList {

    public Node node;

    public class Node {

        public int element;
        public Node nextElement;

        public Node(int el)
        {
            Node curr = this;

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
    }

    public LinkedList(int el)
    {
        this.node = new Node(el);
    }

    public void add(int el)
    {
        Node curr = this.node;

        while(curr.nextElement != null)
        {
            curr = curr.nextElement;
        }

        curr.nextElement = new Node(el);
    }

    public int size()
    {
        Node curr = this.node;
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
        Node curr = this.node;

        for(int i = 0; i < this.size(); i++)
        {
            System.out.println(curr + " " + curr.element);
            curr = curr.nextElement;
        }

    }
}
