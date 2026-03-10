package com.practice.linkedlist;



public class Node {
    Integer data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
