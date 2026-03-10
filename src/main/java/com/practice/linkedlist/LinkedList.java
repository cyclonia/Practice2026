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

     public int getLength(){
         Node current = head;
         if(current == null){
             System.out.print("Empty List");
             return -1;
         }
         int length = 0;
         while(current.next != null){

             current = current.next;
             length++;
         }
         return length + 1;
     }

     public int getMiddle(){
         Node current = head;
         int length = getLength();

         int mid = length/2;
         while (mid > 0){
             current = current.next;
             mid--;
         }
         return current.data;
     }

     public void printList(){
         Node current = head;
         if(current == null){
             System.out.print("Empty List");
             return;
         }
         while(current.next != null){
             System.out.print(current.data + "-> ");
             current = current.next;
         }
         System.out.print(current.data + "-> ");
     }
     static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(99);
        ll.append(5);
        ll.append(6);
        ll.printList();
        System.out.println("Length = " + ll.getLength());
        System.out.println("Middle = " + ll.getMiddle());
    }

}
