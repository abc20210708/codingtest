package com.example.etc.special;

import java.util.Stack;
//참고 블로그 https://vmpo.tistory.com/123
public class StackToQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        queue.enQueue(4);
        System.out.println(queue.deQueue());
        queue.enQueue(5);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}

    class Queue<T> {
        Stack<T> inner = new Stack<>();
        Stack<T> outer = new Stack<>();

        public void enQueue(T data) {
            inner.push(data);
        }

        public T deQueue() {
            if(outer.isEmpty()) {
                while (!inner.isEmpty()) {
                    outer.push(inner.pop());
                }
            }
            return outer.pop();
        }
    }



/* Stack 2개로 Queue를 구현

스택은 마지막에 저장된 데이터가 가장 먼저 출력되기 때문에 저장된 데이터부터
다음 스택으로 옮겨주고 그때 다시 출력하면 제일 처음에 저장한 데이터를 출력할 수 있다.
즉, 큐 형태가 된다.

*
* */