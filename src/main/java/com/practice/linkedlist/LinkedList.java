package com.practice.linkedlist;

public class LinkedList {
     Node head;

     public LinkedList(){
         head = null;
     }

     public void append(int data){
        Node current = head;
        if(head == null){
            head = new Node(data);
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
     }

     public void printList(){
         Node current = head;
         if(current == null){
             System.out.print("Empty List");
             return;
         }
         while(current.next != null){
             System.out.println(current.data);
             current = current.next;
         }
         System.out.println(current.data);
     }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.printList();
    }

}
