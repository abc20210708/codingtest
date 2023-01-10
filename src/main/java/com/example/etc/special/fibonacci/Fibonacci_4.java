package com.example.etc.special.fibonacci;
//참고 블로그 https://hyojun.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98-%EC%88%98-Java
public class Fibonacci_4 {
    static int[] data = new int[100001]; //최댓값 100,000

    public int solution(int n) {
        int answer = 0;

        answer = fibonacci(n);

        return answer;
    }

    private static int fibonacci(int n) {
        if (n < 2) return n; //0과 1은 그대로 return
        if(data[n] != 0) return data[n] % 1234567; //n번째 피보나치 수 / 1234567 값 return

        return data[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
    }


}

/*
    피보나치 수를 구하는 알고리즘을 재귀함수를 이용해서 구하면
    구하고자 하는 수가 커질수록 중복계산이 많이 발생해 효율성이 떨어진다.

    따라서 이전에 구한 결과값을 저장해놓고 필요한 경우 사용하는 동적계획법을 이용

    구하고자 하는 피보나치 수의 최댓값이 100,000 이므로 0을 100,101 크기만큼의 배열을
    생성해두고 값을 저장하는데 사용한다.


    - 피보나치 수를 구하는 함수 작성

    피보나치 수 0과 1의 값은 그대로 0과 1이므로 n이 2보다 작은 경우에는 바로 n 값을 return
    만약 data 배열에 이전에 구한 n 값이 있다면 해당 값을 1234567로 나눈 값을 return
    처음으로 구하는 값이라면 값을 return하는 동시에 data 배열에 저장
* */