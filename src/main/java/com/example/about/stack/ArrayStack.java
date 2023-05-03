package com.example.about.stack;
// 참고 블로그 https://you88.tistory.com/29
// 참고 깃허브 https://github.com/you88311/data-structure/blob/main/stack/src/ArrayStack.java
public class ArrayStack {


    int size; //스택의 크기
    int top = -1; // 가장 위에 있는 데이터의 위치
    // 스택의 데이터를 저장할 배열
    Object[] stack;

    //생성자 메서드로 스택의 크기를 받아서 배열을 초기화
    public ArrayStack(int size) {
        this.size = size;
        stack = new Object[size];
    }

    //스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }

    //스택이 꽉 차 있는지 확인하는 메서드
    public boolean isFull() {
        return this.size == this.top + 1;
    }

    //스택에 데이터를 추가하는 메서드
    public void push(Object data) {
        //스택이 꽉 차있다면 예외를 발생생
       if (isFull())
            throw new ArrayIndexOutOfBoundsException();
       //스택의 가장 위에 있는 데이터의 위치를 1 증가하고 데이터를 추가
        this.stack[++top] = data;
    }

    //스택에서 데이터를 꺼내는 메서드
    public Object pop() {
        // 스택이 비어있다면 예외 발생
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        //스택의 가장 위에 있는 데이터를 꺼내고,
        //해당 위치의 값을 null로 초기화
        Object poppedData = stack[top];
        stack[top--] = null;
        //꺼낸 데이터를 반환
        return poppedData;
    }

    //스택의 가장 위에 있는 데이터를 반환하는 메서드
    public Object peek() {
        if (isEmpty())
            return null;
        else
            return this.stack[top];
    }

    public static void main(String[] args) {
        //스택 객체 생성
        ArrayStack stack = new ArrayStack(5);

        //스택에 데이터 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //스택에서 데이터 꺼내기
        System.out.println(stack.pop());//5
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3

        //스택의 가장 위에 있는 데이터 확인하기
        System.out.println(stack.peek());//2

        //스택이 비어있는지 확인
        System.out.println(stack.isEmpty());//false

        //스택에 더 이상 데이터를 추가할 수 없는지 확인
        System.out.println(stack.isFull());//false
        System.out.println(stack.top);
        System.out.println(stack.size);

    }

}//
