package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
    Queue<String> queu = new LinkedList<>();
    queu.add("Smith");
    queu.add("Montessori");
    queu.add("Peralta");
    queu.add("House");
    return queu;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        printAndEmptyQueue(createQueue());
    }

}
