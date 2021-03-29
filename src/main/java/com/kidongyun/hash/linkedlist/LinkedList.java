package com.kidongyun.hash.linkedlist;

import org.springframework.stereotype.Component;

@Component
public class LinkedList {
    private int size = 0;
    private Node head = Node.empty();



    public int size() {
        return size;
    }
}
