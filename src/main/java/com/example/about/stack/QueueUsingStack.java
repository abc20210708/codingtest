package com.example.about.stack;
import java.util.Stack;

// 스택으로 큐를 구현
public class QueueUsingStack {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueUsingStack() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int x) {
        // inputStack에 요소를 삽입
        inputStack.push(x);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        // outputStack이 비어있으면 inputStack의 모든 요소를 outputStack으로 이동
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        // outputStack에서 가장 위에 있는 요소를 반환
        return outputStack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        // outputStack이 비어있으면 inputStack의 모든 요소를 outputStack으로 이동
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        // outputStack에서 가장 위에 있는 요소를 반환하지만 제거하지는 않음
        return outputStack.peek();
    }

    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    public int size() {
        return inputStack.size() + outputStack.size();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Front element: " + queue.peek());
    }
}
