package com.example.programmers.lv1.v10;
//참고 블로그 https://blog.itcode.dev/posts/2021/12/14/programmers-a0009.html
public class Q10 {

        public int solution(int[] nums) {
            int answer = 0;
            int num = 0;

            for(int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    for(int k = j+1; k < nums.length; k++) {
                        num = (nums[i] + nums[j] + nums[k]);
                        System.out.println(num);

                        answer += isPrime(num) ? 1 : 0;

                    }//k
                }//j
            }//i


            System.out.println("answer: "+answer);
            return answer;
        }

        //소수 여부 변환 메서드
        private boolean isPrime(int num) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                //나눠 떨어지는 경우
                if(num % i == 0) return false;
            }
            return true;
        }


    }



