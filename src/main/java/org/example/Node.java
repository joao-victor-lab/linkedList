package org.example;

public class Node
{
    Node next;
    int data;

    public Node(int data)
    {
        this.data = data;
    }

}

class LinkedList
{
    Node head;
    void append(int data)
    {
        if(head == null)
        {
            head = new Node(data);
            System.out.println("new data is : " + data);
            return;
        }

        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }

        current.next = new Node(data);

    }

    void aprepend(int data)
    {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        System.out.println("new head is " + data);
    }

    void deleteWithData(int data)
    {
        if(head == null) return;

        if (head.data == data)
        {
            head = head.next;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            System.out.println(current.data);
        }
    }

}