package com.example.about;

// 참고 블로그 https://kingofbackend.tistory.com/131
public class StaticEx {

    /* Static 멤버 선언
    필드나 메소드를 생성할 때,인스턴스로 생성할 것인지 static 으로
    생성할 것인지에 대한 판단 기준은 공용으로 사용하느냐 아니냐로 내리면 됩니다.
    그냥 생성한다면 자동으로 인스턴스로 생성되며 static 으로 생성하려면
    필드와 메소드 선언 시 static 이라는 키워드를 추가적으로 붙이면 됩니다.

    * */
    static int num1 = 0; // 클래스 필드
    int num2 = 0; //인스턴스 필드

    static void print1() { //클래스 메소드
        System.out.println("출력 1");
    }

    void print2() { //인스턴스 메소드
        System.out.println("출력 2");
    }

    public static void main(String[] args) {
        StaticEx n1 = new StaticEx(); // 첫 번째 number
        StaticEx n2 = new StaticEx(); // 두 번째 number

        n1.num1++;
        n1.num2++;
        System.out.println(n2.num1);
        System.out.println(n2.num2);

        /* 인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로
           인스턴스가 각기 다른 값을 가지지만 static 변수는 모든
           인스턴스가 하나의 저장공간을 공유해 항상 같은 값을
           가지는 현상
        * */

        StaticEx.print1(); // 인스턴스를 생성하지 않아도 호출 가능
        //정적 메소드는 메모리에 올라갈 때 정적 메소드가 자동적 생성


        StaticEx st = new StaticEx(); // 인스턴스 생성
        st.print2(); //인스턴스를 생성해야만 호출이 가능
    }
}

/* Static

  고정된이라는 의미를 가지고 있습니다. Static 이라는 키워드를 사용해
  Static 변수와 Static 메소드를 만들 수 있는데,
  다른 말로는 정적 필드와 정적 메소드라고도 하며, 이 둘을 합쳐 클래스 멤버라고도 합니다.
  static 필드와 static 메소드는 객체에 소속된 멤버가 아니라 클래스에 고정된 멤버입니다.

  Static 멤버 생성

  Static 키워드를 통해 생성된 정적 멤버들은 Heap 영역이 아닌 Static 영역에
  할당됩니다. Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의
  멤버를 어디서든지 참조할 수 있는 장점을 가지지만 Garbage Collector의 관여 영역
  밖에 존재하기에 Static 영역에 있는 멤버들은 프로그램의 종료시까지
  메모리에 할당된 채로 존재하게 됩니다. 그렇기에 Static을 너무 남발하게 되면
  만들고자 하는 시스템 성능에 악역향을 줄 수 있습니다.
**/