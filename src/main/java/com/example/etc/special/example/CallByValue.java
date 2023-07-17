package com.example.etc.special.example;

import org.apache.ibatis.javassist.tools.rmi.Sample;
// 참고 블로그 https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%9E%90%EB%B0%94%EB%8A%94-Call-by-reference-%EA%B0%9C%EB%85%90%EC%9D%B4-%EC%97%86%EB%8B%A4-%E2%9D%93
public class CallByValue {
    public static void main(String[] args) {
        Sample sample = new Sample();

        int var = 1;
        int[] arr = { 1 } ;

        // 변수 자체를 보냄 (call by value)
        add_value(var);
        System.out.println(var);

        // 배열 자체를 보냄 (call by reference)
        add_reference(arr);
        System.out.println(arr[0]);

    }

    static void add_value(int var_arg) {
        var_arg += 100;
    }

    static void add_reference(int[] arr_arg){
        arr_arg[0] += 100;
    }

}
