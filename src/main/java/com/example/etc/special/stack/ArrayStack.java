package com.example.etc.special.stack;
//참고 블로그 https://go-coding.tistory.com/5


// 배열로 Stack 구현
public class ArrayStack {
    int top; //인덱스
    int size; //스택 배열의 크기
    int[] stack;

    //생성자로 멤버변수들을 초기화 해주면서
    //stack 배열을 size 만큼 초기화
    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        stack[++top] = item;
    }

    public void pop() {
        int pop = stack[top];
        stack[top--] = 0;
    }

/*
배열을 초기화 해줄때 int [] stack = new int [5]을 하게되면
배열의 크기는 5가 되고 값은 null 초기화 됩니다.
배열의 값들을 제거할때는 배열의 데이터 형태가 int형태이므로
null이 아닌 0값을 임의로 넣어줬습니다.
* */

}
/*
//peek 맨 마지막 데이터 보는 것

//search() -> 인덱스를 출력해준다.
맨 밑부터 인덱스가 0,1,2,3

//empty() 현재 비어있으면 true,
값이 들어가 있으면 false

* */