package com.kidongyun.hash;

import com.kidongyun.hash.linkedlist.Node;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Hash {
    private final int size = 10;
    private final Node[] hashTable = new Node[size];

    private int hashCode(int value) {
        return value % size;
    }

    public void put(int value) {
        int key = hashCode(value);

        if(hashTable[key] == null) {
            this.hashTable[key] = Node.from(value);
            return;
        }

        this.hashTable[key].
    }

    @Override
    public String toString() {
        return Arrays.toString(hashTable);
    }
}
