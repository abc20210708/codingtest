package com.example.backjoon.new01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//참고 블로그  https://st-lab.tistory.com/143
public class Q11047 {
    //최적해를 찾아나가는 것 K원을 만들 때 최소한의 개수를 이용해야하니
    //당연하게 가장 큰 가치를 지닌 동전부터 선택하는 것이 당연함

    //즉, N개의 동전 중 가장 큰 가치를 지닌 동전부터 탐색하여
    //동전의 가치가 K보다 클 경우는 넘어ㅏ고,
    //아닐 경우는 최대 구성 가능한 개수를 더해주면 된다.

    public static void main(String[] args) throws IOException {
        /*
        입력 방법은 Scanner 대신 BufferedReader를 이용하여 풀이하는 방법
        단, BufferedReader는 문자열을 한 줄로 읽기 때문에 N 과 K를 구분하기 위해
        공백을 기준으로 문자열을 분리해야하니 StringTokenizer를 사용하여 풀기

        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for (int i = 0; i <N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = N -1; i >= 0; i--) {

            //현재 동전의 가치가 K보다 작거나 같아야 구성이 가능
            if(coin[i] <= K) {
                //현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                cnt += (K / coin[i]);
                K %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}

/* 다른 풀이 참고 블로그 https://velog.io/@akwnsldj1/%EB%B0%B1%EC%A4%80-11047%EB%B2%88-%EB%8F%99%EC%A0%84-0-JAVA%EC%9E%90%EB%B0%94
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 첫째 줄에 N, K가 공백으로 주어지므로 N,K에 sc.nextInt()로 담아준다.
		int N = sc.nextInt(), K = sc.nextInt();
		// 둘째 줄 부터 N개 종류의 동전들이 주어진다. 따라서 동전의 종류를 담을 N칸 배열을 선언한다.
		int []coin = new int[N];
		// 총 몇개의 동전이 필요한지 체크할 변수
		int count = 0;

		// coin[]의 0~N-1방에 동전의 값을 넣어 준다.
		for (int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}

		// 최소한의 동전 개수를 찾아야 하므로 동전가치가 가장 큰 N-1번방부터 coin[i]를 찾는다.
		for (int i = N-1; i >= 0; i--) {
			if(K >= coin[i]) {// K보다 작거나 같으면서 가장 가치가 큰 coin[i]를 찾는는다.
				// K / coin[i]를 통해 coin[i]가 몇번 쓰였는지 개수를 센다.
				// 그리고 그 몫을 count에 누적시킨다.
				count += (K / coin[i]);
				// coin[i]*몫한 나머지 값. 즉, K % coin[i]한 값을 변수 K에 다시 넣어준다.
				K = (K % coin[i]);
				// K = 0이 되는 순간 반복문은 끝난다.
				// 반복이 돌아가능 동안 누적된 count값은 N개의 동전의 종류 중 최소한의 동전으로
				// K의 값과 같아진 동전들의 개수다.
			}
		}
		// 최소한의 동전 개수 출력
		System.out.println(count);
	}
}

* */

/* 동전 0
문제
준규가 가지고 있는 동전은 총 N종류이고,
각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
(1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력
첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
* */