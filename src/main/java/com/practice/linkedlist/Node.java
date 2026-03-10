package com.practice.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    Integer data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
