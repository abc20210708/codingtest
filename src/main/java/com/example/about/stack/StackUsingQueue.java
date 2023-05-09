package com.example.about.stack;
import java.util.LinkedList;
import java.util.Queue;

// 큐로 스택 구현
public class StackUsingQueue {
    private Queue<Integer> queue;

    public StackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        // 삽입할 요소를 임시 큐에 저장
        Queue<Integer> tempQueue = new LinkedList<>();
        tempQueue.add(x);

        // 현재 큐에 있는 모든 요소를 임시 큐로 이동
        while (!queue.isEmpty()) {
            tempQueue.add(queue.poll());
        }

        // 임시 큐의 요소를 현재 큐로 복사
        queue = tempQueue;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return queue.poll();
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Top element: " + stack.top());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Top element: " + stack.top());
    }

}
