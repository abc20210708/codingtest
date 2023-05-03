package com.example.about.stack;

// 참고 깃허브 https://github.com/you88311/data-structure/blob/main/stack/src/ListStack.java
public class ListStack<T> {

    // 스택의 맨 위를 가리키는 노드
    Node<T> head = null;
    Node<T> bottom = null;

    // 스택이 비어있는지 확인하는 메소드
    public boolean isEmpty() {
        return head == null; //비어있으면 true
    }

    //스택 맨 위에 요소를 추가하는 메소드
    public void push(T data) {
        // 새로운 노드를 생성하고 데이터를 저장
        Node<T> newNode = new Node<>();
        newNode.data = data;

        //스택이 비어있지 않으면
        //새로운 노드를 현재 맨 위 노드의 다음 노드로 설정
        if (!isEmpty()) {
            newNode.next = this.head;
        }
        // 스택의 맨 위 노드를 새로운 노드로 갱신
        this.head = newNode;

        // 스택이 비어있으면 새로운 노드를 맨 아래 노드로 설정
        if (isEmpty()) {
            this.bottom = newNode;
        }
    }

    // 스택 맨 위의 요소를 삭제하며 반환하는 메소드
    public T pop() {
        // 스택이 비어있으면 예외를 발생시킴
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        // 스택 맨 위 노드의 데이터를 임시 변수에 저장
        // 해당 노드를 변수에 저장한다.
        T tmp = this.head.data;
        Node<T> poppedNode = this.head;

        // 스택의 맨 위 노드를 현재 노드의 다음 노드로 갱신
        this.head = this.head.next;

        //노드의 데이터와 다음 노드를 모두 null로 초기화
        poppedNode.next = null;
        poppedNode.data = null;

        //스택 맨 위 노드의 데이터를 반환
        return tmp;
    }

    // 스택 맨 위의 요소를 삭제하지 않고 반환하는 메소드
    public T peek() {
        //스택이 비어있으면 null 반환
        if (isEmpty())
            return null;
        return this.head.data;
    }

}//

/*
 제네릭 클래스 Node => 단일 연결 리스트를 구현하기 위한 노드 클래스입니다.
* */
class Node<T> {
    Node<T> next = null; // 다음 노드
    T data = null; // 노드에 저장될 데이터
}
