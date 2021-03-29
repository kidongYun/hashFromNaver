package com.kidongyun.hash.linkedlist;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Node {
    private int data;
    private Node link;

    public static Node from(int data, Node link) {
        return builder().data(data).link(link).build();
    }

    public static Node from(int data) {
        return builder().data(data).build();
    }

    public static Node empty() {
        return builder().build();
    }
}
