# R    E    A     D     M       E       양          식 

# 컴퓨터정보학부 2학년 1반 최다울 202230136

## 4월 xx일 (x주차)
### ( 학습 내용 ) , ( 코드 )

# h1 태그
## h2 태그
### h3 태그
#### h4 태그
##### h5 태그
###### h6 태그

## 3월 20일 (3주차)
#### README.md 파일 편집
* ( R E A D . M E 파일 작성법)
* 이름 학번 (h1 크기로 제일 위에 기재 )
* 학습 시기 ( 몇주차인지 )
* 배운 내용 & 코드
* 최근 학습이 제일 위로 최신화


## 4월 3일(4주차)
- ## 반복문
- ## for 문 , while 문 do while 문
- ## 2차원 배열

## 2차원 배열 
- #### ex 2-1반 페이지 , 2-2반 페이지 까지는 2차원 반이 늘어난다고 3차원이아님.
- #### 아예 다른 페이지일 경우 3차원
# 2차원 배열 예시
- #### 사용 상황: 
학생들의 시험 점수를 저장하고 출력하는 경우 (행은 학생, 열은 과목).

$ public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] scores = {
            {85, 90, 92}, // 학생 1의 점
            (국어, 수학, 영어)
            {78, 88, 91}, // 학생 2의 점수
            {90, 77, 89}  // 학생 3의 점수
        };

        System.out.println("학생 1의 수학 점수: " + scores[0][1]); // 출력: 90
        System.out.println("학생 2의 영어 점수: " + scores[1][2]); // 출력: 91
    }
}
#
# 📘 4월 10일 (5주차) 자바 수업

---

## 1️⃣ 자바의 예외 클래스

> 자바는 프로그램 실행 중 발생할 수 있는 오류들을 **클래스 형태의 예외(Exception) 객체**로 제공함.  
> 마치 "오류가 났다"는 걸 **편지로 보내주는 예외 객체**로 생각하면 이해 쉬움!

| 예외 타입 (클래스)              | 예외 발생 상황                                                                  | 패키지      |
|-------------------------------|----------------------------------------------------------------------------------|-------------|
| `ArithmeticException`         | 정수를 0으로 나눌 때 발생                                                       | `java.lang` |
| `NullPointerException`        | `null` 레퍼런스를 참조할 때 발생                                                | `java.lang` |
| `ClassCastException`          | 변환할 수 없는 타입으로 객체를 캐스팅할 때 발생                                 | `java.lang` |
| `OutOfMemoryError`            | 메모리가 부족할 때 발생                                                        | `java.lang` |
| `ArrayIndexOutOfBoundsException` | 배열 범위를 벗어난 인덱스에 접근할 때 발생                                | `java.lang` |
| `IllegalArgumentException`    | 잘못된 인자를 메서드에 전달할 때 발생                                          | `java.lang` |
| `IOException`                 | 입출력 도중 실패하거나 인터럽트 되었을 때 발생                                 | `java.io`   |
| `NumberFormatException`       | 숫자로 바꿀 수 없는 문자열을 숫자로 바꾸려 할 때 발생                          | `java.lang` |
| `InputMismatchException`      | `Scanner.nextInt()` 호출 시 문자를 숫자로 바꾸려 할 때 (예: "a" 입력 시)       | `java.util` |

---

## 2️⃣ 예외 클래스 사례 – `ArrayIndexOutOfBoundsException`

> 배열의 범위를 벗어난 인덱스에 접근할 때 발생하는 예외  
> 마치 **택배를 보낼 때 존재하지 않는 주소를 적은 것과 같은 상황!**

## 4️⃣ 자바의 객체 지향 특성: 캡슐화 (Encapsulation)

> 캡슐화란, **객체를 캡슐로 싸서 내부를 숨기고 보호하는 것**  
> 마치 약이 겉껍질에 싸여 있어서 **외부에서 성분을 직접 만지지 못하게 막는 것**과 같음!

### ✅ 캡슐화의 특징

- 객체의 **가장 본질적인 특징**
- 외부로부터 내부 구조를 숨기고 **접근을 제한함**
- 객체 간의 **정보 은닉**을 통해 안정성 향상

---

### 🧪 자바에서의 캡슐화 구현

- **클래스(class)**: 객체의 틀(설계도), 내부 속성과 기능을 선언
- **객체(instance)**: 클래스를 통해 실제로 만들어진 실체

> **TV, 자판기, 카메라, 사람**처럼 복잡한 내부 구조가 외부에 드러나지 않도록 감싸진 구조를 시각적으로 표현함.

- TV나 자판기처럼, **내부 회로는 숨기고 기능만 외부에 제공**함
- 자바의 객체도 마찬가지로, **클래스 내부의 데이터(필드)는 숨기고 메서드로만 접근하도록 구성**하는 것이 캡슐화의 핵심

> 📦 정리하자면, 캡슐화란 "사용자는 겉만 보게 하고, 속은 건드리지 못하게 만드는 구조"  
> (예: 약은 겉 포장만 보고 삼키지만, 내부 성분은 직접 못 만짐)

## 5️⃣ 자바의 객체 지향 특성: 상속 (Inheritance)

> 상속은 **기존 객체(부모)의 속성과 기능을 새로운 객체(자식)가 물려받는 것**  
> 마치 부모님에게 유전자를 물려받듯이, 자식 클래스는 부모 클래스의 필드와 메서드를 그대로 사용할 수 있음.

### ✅ 상속의 특징

- 상위 객체의 **속성이 하위 객체에 전달**됨
- 하위 객체는 **상위 객체의 모든 속성을 가지는 관계**
- 코드 재사용과 유지보수에 효과적임

---

### 🌿 실세계 상속 사례

- **나무**는 식물의 특성과 생물의 특성을 모두 가짐
- **사람**은 생물의 특성만 가지며, 식물의 특성은 없음

```plaintext
생물
├── 동물
│   ├── 어류
│   └── 사람
└── 식물
    ├── 나무
    └── 풀
```


# 7️⃣ 자바의 객체 지향 특성: 다형성 (Polymorphism)

> 다형성이란, **같은 이름의 메서드가 클래스나 객체에 따라 다르게 동작하는 성질**  
> 예: `speak()`라는 메서드를 부르면 **강아지는 "멍멍"**, **고양이는 "야옹"**, **새는 "삐약"** 울음소리가 다르게 나옴.

---

### 📌 다형성의 구현 방식

1. **메서드 오버로딩 (Overloading)**  
   - 한 클래스 내에서 **같은 이름의 메서드가 매개변수에 따라 여러 버전으로 정의**
   - 예: `print(int x)`, `print(String s)`

2. **메서드 오버라이딩 (Overriding)**  
   - **슈퍼 클래스의 메서드를 서브 클래스에서 재정의**해서 동작을 다르게 만듦
   - 예: `Animal` 클래스의 `speak()`를 `Dog`, `Cat`, `Bird` 클래스가 각각 다르게 구현

## 8️⃣ 객체 지향 언어의 목적

### 🎯 1. 소프트웨어의 생산성 향상

> 컴퓨터 산업이 발전하면서, **소프트웨어의 수명 주기(life cycle)**는 짧아지고  
> 새로운 프로그램을 빠르게 개발해야 할 필요성이 커짐

---

### 📌 객체 지향 언어의 역할

- **상속, 다형성, 객체, 캡슐화** 등의 개념을 통해  
  소프트웨어 구성 요소를 **재사용**하고, 유지보수를 **더 쉽고 빠르게** 함
- 기존 코드를 **수정하거나 확장**하는 게 쉬워짐
- 소프트웨어를 **처음부터 다시 만드는 부담 감소**
- 결과적으로 **개발 속도 향상 → 생산성 향상**

> 🔁 비유하자면, 객체 지향은 마치 **레고 블록처럼 조립하는 프로그래밍**  
> 이미 만들어둔 블록(객체)을 조합해서 빠르게 새로운 구조를 만드는 느낌!

## 객체 지향 언어의 목적

### 2. 실세계에 대한 쉬운 모델링

#### 🔹 초기 프로그래밍

- 수학 계산/통계 처리 등 **처리 과정과 계산 절차가 중요**했던 시기
- 프로그램은 주로 "절차 중심"으로 구성되었음

#### 🔹 현대 프로그래밍

- 컴퓨터가 산업 전반에 활용되면서 실세계의 문제를 다루기 시작
- 실세계에서 발생하는 다양한 상황을 프로그램으로 표현하려는 시도
- 이때부터는 단순한 계산보다 **실제 세상의 "물체(객체)"들이 상호작용**하는 방식을 모델링하기 시작

#### 🔹 객체 지향 언어의 등장

- 실세계의 일을 더 쉽게 표현하고 구현하기 위해, **"객체 중심" 프로그래밍 언어**가 등장
- 예를 들어, **자동차, 사람, 계좌** 같은 실생활의 대상들을 **객체**로 만들어 코드로 표현함  
  → 마치 우리가 **레고 블럭**을 조립하듯, 객체들을 조합해 복잡한 프로그램을 만드는 방식

---

### 🔹 객체 지향 프로그래밍 (Object-Oriented Programming)

- 프로그램을 **객체들 간의 상호작용**으로 구성
- **클래스 또는 객체들의 집합**으로 프로그램을 설계
- 각 객체는 **자신의 역할과 책임**을 가짐
- 예: 커피 자판기를 구성하는 다양한 부품(객체)들이  
  각각 기능을 수행하고, 상호작용함

  ## 클래스(Class)와 객체(Object)

### 🔹 클래스란?

- 객체의 **속성(state)**과 **행위(behavior)**를 선언한 설계도
- 쉽게 말해, **객체를 찍어내기 위한 틀** 혹은 도면이라고 할 수 있음

🛠 비유:
> 클래스는 **붕어빵 틀**, 객체는 그 틀로 구운 **붕어빵**  
> 붕어빵 틀(클래스)은 하나지만, 여러 개의 붕어빵(객체)을 만들 수 있음

---

### 🔹 객체란?

- 클래스라는 틀에서 **실제로 찍어낸 실체**
- 프로그램이 **실행되는 동안 메모리에 생성**되는 것
- **구체적인 메모리 공간을 가지는 존재**
- 객체는 보통 **인스턴스(instance)**라고도 부름

---

### 🔹 예시

## 클래스(Class)와 객체(Object)의 쉬운 비유

클래스는 객체를 만들기 위한 **설계도**,  
객체는 그 설계도로부터 **만들어진 실체**

---

### ex: 아이폰과 내 아이폰

| 개념     | 설명                                                     |
|----------|----------------------------------------------------------|
| 클래스   | 아이폰 14의 제조 설계도                                   |
| 객체     | 내가 쓰는 아이폰 14 (저장된 사진, 설정 등은 각각 다름)     |

---

📝 정리:  
**클래스는 설명서📘, 객체는 설명서대로 만들어진 물건📦**

## 생성자(Constructor)의 개념과 목적

생성자는 객체가 **생성될 때 자동으로 실행되는 메소드**로,  
주로 **객체를 초기화**하는 데 사용됩니다.

---

### 🧠 생성자의 특징

- 클래스 이름과 동일한 이름을 가짐
- 반환 타입이 없음 (`void`조차도 안 붙임!)
- 객체가 **생성되는 순간 자동 호출됨**
- 보통 객체의 **필드 초기화**에 사용됨

---

### 💄 비유: "객체 메이크오버"

| 단계             | 설명                                      |
|------------------|-------------------------------------------|
| 기본 객체        | 아직 아무런 값도 설정되지 않은 상태        |
| 생성자 실행      | 값들을 설정해주는 메이크업 과정            |
| 초기화된 객체    | 이름, 속성 등이 채워져 실제로 쓸 수 있는 상태 |

→ 마치 사람이 미용실 가서 스타일링 받고 나오는 느낌!

---
## 생성자의 특징

자바에서 생성자는 **객체가 생성될 때 단 한 번 자동으로 호출되는 메소드**이며, 객체의 필드 값을 초기화하는 데 사용됩니다. 생성자의 이름은 반드시 클래스 이름과 같아야 하고, **반환 타입은 절대 가질 수 없습니다**. `void`조차 붙이면 컴파일 오류가 발생합니다. 하나의 클래스 안에는 **여러 개의 생성자**를 정의할 수 있는데, 이를 **생성자 오버로딩**이라 부릅니다. 오버로딩된 생성자들은 매개변수의 수나 타입이 다르며, 객체 생성 시 전달되는 인자에 따라 어떤 생성자가 호출될지가 결정됩니다.

📦 비유하자면, **생성자는 물건이 공장에서 처음 나올 때 부품을 조립하고 포장하는 초기 공정과 같아요.**  
공장에서 같은 물건이라도 옵션에 따라 다르게 조립되듯, 생성자도 전달된 정보에 따라 **초기 상태를 다르게 설정**해줍니다. 그리고 이 과정은 **new 연산자를 통해 객체가 만들어질 때 단 한 번만 자동으로 실행**됩니다.

---

### 🔑 생성자의 주요 특징 정리

- 생성자의 이름은 **클래스 이름과 동일**
- **리턴 타입이 없음** (`void`도 사용 ❌)
- 객체 생성 시 **단 한 번만 자동 호출**
- 객체 생성 시 반드시 `new` 연산자와 함께 사용
- **여러 개 작성 가능** → 매개변수에 따라 다른 생성자 호출됨 (**생성자 오버로딩**)

---

### ✅ 예시: 생성자 오버로딩

```java
public class Circle {
    public Circle() {
        // 기본 생성자
    }

    public Circle(int r, String n) {
        // 매개변수 있는 생성자
    }
}
```


# 📘 4월 17일 자바 수업 정리

---

## 1️⃣ 생성자 – 기본 생성자 (Default Constructor)

- 매개변수가 없고, 내부에서 아무 작업도 하지 않는 생성자
- 생성자를 작성하지 않으면 자바가 자동으로 `클래스명()` 생성자 만들어줌

> 🧠 비유: 옵션 안 고르고 그냥 기본으로 계약한 원룸 느낌

---

## 2️⃣ 생성자가 자동 생성되지 않는 경우

- 생성자를 하나라도 직접 작성하면, 자바는 기본 생성자를 더 이상 자동으로 만들지 않음
- 기본 생성자를 사용하고 싶다면, 반드시 명시적으로 `public 클래스명() {}` 작성해야 함

> 🧠 비유: 내가 원하는 옵션 방을 직접 골랐기 때문에, 자동 기본 옵션 제공은 중단됨

---

## 3️⃣ this 레퍼런스

- `this`는 객체 자기 자신을 참조하는 키워드
- 주로 멤버 변수와 매개변수 이름이 겹칠 때 구분용으로 사용

> 🧠 비유: “내 거야”라고 말할 때의 ‘나’와 같은 느낌

---

## 4️⃣ 객체 안에서의 this

- `this`는 메서드를 호출한 객체를 가리킴
- ob1, ob2, ob3가 각각 `set()`을 호출하면, `this`는 각각 ob1, ob2, ob3를 참조

> 🧠 비유: 학생 세 명이 “내 노트”라고 말하면, 각자 자기 노트를 말하는 것과 같음

---

## 5️⃣ this()로 다른 생성자 호출

- 같은 클래스의 다른 생성자를 호출할 때 사용
- 생성자 안에서만 사용 가능하며, 반드시 **첫 줄**에 위치해야 함

> 🧠 비유: 같은 가게에서 세트 메뉴 하나 먼저 부르고, 거기에 추가로 토핑을 올리는 느낌

---

## 6️⃣ 인자 전달 – 배열이 전달되는 경우

- 배열은 **값이 아닌 참조(레퍼런스)**가 전달됨
- 메서드에서 배열을 변경하면, 원본 배열도 바뀜

> 🧠 비유: 종이 한 장을 복사하는 게 아니라, 같은 종이를 같이 쓰는 것

---

## 7️⃣ 인자 전달 – 객체가 전달되는 경우

- 객체도 배열과 마찬가지로 참조가 전달됨
- 전달된 객체 내부 상태가 변경되면, 호출한 쪽 객체도 함께 바뀜

---

## 8️⃣ 인자 전달 – 기본 타입의 값이 전달되는 경우

- `int`, `double` 등 기본형 타입은 **값 자체**가 복사되어 전달됨
- 메서드 내부에서 변경해도, 원본 값은 바뀌지 않음

> 🧠 비유: 사본을 받은 후 내가 거기 낙서해도, 원본 종이는 그대로인 느낌

---

## 9️⃣ 예제 – 인자로 배열이 전달되는 예

- `char[]` 배열을 전달받아, 공백(' ')을 `','`로 바꾸는 메서드 작성
- 배열을 메서드에 전달하면, 원본 배열도 같이 변경됨

---

## 🔁 메서드 오버로딩 (Overloading)

- 같은 이름의 메서드를 **매개변수의 타입이나 개수**만 다르게 해서 여러 개 정의
- 리턴 타입은 오버로딩과 관계 없음

> 🧠 비유: 같은 가게에서 “주문”이라고 말했지만, 사람마다 메뉴가 다른 경우

---

## 🧱 객체 배열 선언과 생성 과정

### 자바의 객체 배열 만들기 3단계

1. 객체 배열 변수 선언  
   → `Circle[] c;`
2. 배열 공간 확보  
   → `c = new Circle[5];`
3. 배열 각 칸에 실제 객체 생성  
   → `c[i] = new Circle(i);`

---

## 🔧 메서드

- 자바의 함수 = 메서드
- 모든 메서드는 반드시 클래스 내부에 선언되어야 함 (캡슐화 원칙)
- 메서드는 다음과 같은 구성 요소를 가짐:

  - 접근 지정자 (예: `public`)
  - 리턴 타입 (예: `int`)
  - 메서드 이름 (예: `getSum`)
  - 매개변수 목록 (예: `int i, int j`)
  - 본문 코드

---

## 예제 – Circle 배열 만들기

- `Circle` 객체를 5개 생성하고, 각각 반지름 0~4를 넣어 저장
- 이후 배열을 순회하며 각 객체의 면적을 출력함

# 📘 자바 접근 지정자, static 멤버, 가비지 컬렉션 정리

## 멤버 접근 지정자

| 접근 지정자 | 같은 패키지 | 다른 패키지 | 상속 관계 | 설명 |
|-------------|--------------|--------------|------------|------|
| `private`   | ❌           | ❌           | ❌         | 같은 클래스 내부에서만 접근 가능 |
| `default`   | ⭕           | ❌           | ❌         | 같은 패키지 내의 클래스만 접근 가능 |
| `protected` | ⭕           | ❌           | ⭕         | 같은 패키지 + 다른 패키지 자식 클래스도 접근 가능 |
| `public`    | ⭕           | ⭕           | ⭕         | 모든 클래스에서 접근 가능 |

> 📌 비유:  
> `private`는 **집 비밀번호**,  
> `default`는 **우리 아파트 주민 전용**,  
> `protected`는 **친척들까지 들어올 수 있음**,  
> `public`은 **누구든 환영하는 오픈 행사** 느낌이야!

---

## 클래스 접근 지정자

- `public` 클래스: 모든 패키지에서 접근 가능  
- `default` 클래스: 같은 패키지에서만 접근 가능  

> 🏠 비유:  
> `public class`는 누구나 들어올 수 있는 **오픈 카페**,  
> `default class`는 아파트 **입주민 전용 커뮤니티 센터**!

---

## 접근 지정자의 목적

- **객체지향의 캡슐화** 원칙을 지키기 위해 멤버 접근을 제어함
- 정보를 숨기고 필요한 것만 외부에 공개하도록 함

> 🔐 비유:  
> 클래스는 **비밀 금고**,  
> 접근 지정자는 **열쇠 권한**을 관리하는 느낌!

---

##  자바의 패키지 개념

- 관련된 클래스들을 묶는 **폴더(디렉토리)**
- 하나의 자바 응용프로그램은 여러 개의 패키지로 구성됨

> 📦 비유:  
> 패키지는 **문서철 폴더**,  
> 클래스는 그 안에 있는 **문서 한 장**이야!

---

## 가비지 컬렉션 개념

- JVM이 **사용하지 않는 객체(가비지)**를 자동으로 회수함
- `System.gc()` 또는 `Runtime.getRuntime().gc()`로 수동 요청 가능

> 🧹 비유:  
> 안 쓰는 변수는 **쓰레기**,  
> 가비지 컬렉터는 **청소부**!

---

## 가비지 발생 예시

```java
String a = new String("Good");
a = null; // "Good"은 가비지 발생



Person a = new Person("홍길동");
Person b = new Person("이몽룡");
b = a; // 이전 b가 가리키던 객체는 가비지

🪙 비유:
b가 새 장난감을 사면서 예전 장난감은 버림받은 상태!
```
# 📘 자바 접근 지정자, static 멤버, 가비지 컬렉션 정리

## 멤버 접근 지정자

| 접근 지정자 | 같은 패키지 | 다른 패키지 | 상속 관계 | 설명 |
|-------------|--------------|--------------|------------|------|
| `private`   | ❌           | ❌           | ❌         | 같은 클래스 내부에서만 접근 가능 |
| `default`   | ⭕           | ❌           | ❌         | 같은 패키지 내의 클래스만 접근 가능 |
| `protected` | ⭕           | ❌           | ⭕         | 같은 패키지 + 다른 패키지 자식 클래스도 접근 가능 |
| `public`    | ⭕           | ⭕           | ⭕         | 모든 클래스에서 접근 가능 |

> 📌 비유:  
> `private`는 **집 비밀번호**,  
> `default`는 **우리 아파트 주민 전용**,  
> `protected`는 **친척들까지 들어올 수 있음**,  
> `public`은 **누구든 환영하는 오픈 행사** 느낌이야!

---

## 클래스 접근 지정자

- `public` 클래스: 모든 패키지에서 접근 가능  
- `default` 클래스: 같은 패키지에서만 접근 가능  

> 🏠 비유:  
> `public class`는 누구나 들어올 수 있는 **오픈 카페**,  
> `default class`는 아파트 **입주민 전용 커뮤니티 센터**!

---

## 접근 지정자의 목적

- **객체지향의 캡슐화** 원칙을 지키기 위해 멤버 접근을 제어함
- 정보를 숨기고 필요한 것만 외부에 공개하도록 함

> 🔐 비유:  
> 클래스는 **비밀 금고**,  
> 접근 지정자는 **열쇠 권한**을 관리하는 느낌!

---

## 자바의 패키지 개념

- 관련된 클래스들을 묶는 **폴더(디렉토리)**
- 하나의 자바 응용프로그램은 여러 개의 패키지로 구성됨

> 📦 비유:  
> 패키지는 **문서철 폴더**,  
> 클래스는 그 안에 있는 **문서 한 장**이야!

---

## 가비지 컬렉션 개념

- JVM이 **사용하지 않는 객체(가비지)**를 자동으로 회수함
- `System.gc()` 또는 `Runtime.getRuntime().gc()`로 수동 요청 가능

> 🧹 비유:  
> 안 쓰는 변수는 **쓰레기**,  
> 가비지 컬렉터는 **청소부**!

---

##  가비지 발생 예시

```java
String a = new String("Good");
a = null; // "Good"은 가비지 발생
```

> 참조가 사라지는 순간, 힙 메모리 안의 객체는 가비지!

---

## 가비지 예제 (레퍼런스 교체)

```java
Person a = new Person("홍길동");
Person b = new Person("이몽룡");
b = a; // 이전 b가 가리키던 객체는 가비지
```

> 🪙 비유:  
> b가 새 장난감을 사면서 예전 장난감은 **버림받은 상태**!

---

## 객체 소멸 개념

- `new`로 만든 객체는 **JVM의 힙**에 저장됨
- 더 이상 사용하지 않으면 GC가 회수

> 🚮 자바는 쓰레기 버리는 걸 **직접 안 해도 되는 편리함**이 있어

---

## 객체 치환 시 주의

```java
ob1 = ob2; // ob1이 가리키던 객체는 더 이상 접근 불가 → 가비지
```

> 🎯 복사는 내용이 아니라 **참조(화살표)**가 바뀌는 거야!

---

## 오버로딩 실패 예시

```java
public int getSum(int i, int j) { ... }
public double getSum(int i, int j) { ... } // ❌ 실패
```

> ⚠️ 매개변수의 개수나 타입이 달라야 오버로딩 성공!

---

## static 메서드 예제

```java
public class Calc {
    public static int abs(int a) { return a > 0 ? a : -a; }
    public static int max(int a, int b) { return a > b ? a : b; }
    public static int min(int a, int b) { return a > b ? b : a; }
}
```

> 🧮 전역 유틸 클래스의 대표적인 예: `Math.abs()`, `Math.max()` 처럼 사용!

---

## static 메서드 제약 조건

- static 메서드는 **static 멤버만 접근 가능**
- 객체 생성 없이 실행되므로 non-static 멤버는 사용 불가

> 🧱 비유:  
> 건물 설계도만 있는 상태에선 **내부 가구 배치(객체 멤버)**는 접근 불가!

---

## static의 활용

- **전역 변수 / 전역 함수** 느낌
- **공통 속성 또는 기능** 정의 시 사용

---

## static 멤버 생성

- 클래스당 **하나만 생성됨**
- 모든 객체가 공유

> 👥 비유:  
> 학교 전체가 공유하는 **학칙**,  
> 반마다 있는 건 아님!

---


## static 멤버 사용 방법

- 클래스 이름으로 직접 접근
```java
StaticSample.m = 5;
StaticSample.f();
```
- 객체 이름으로도 접근 가능
```java
obj.m = 5;
obj.f();
```

---

## non-static 멤버 접근 불가 예시

```java
StaticSample.n = 5; // ❌ 오류
StaticSample.g();   // ❌ 오류
```

> ❗ 객체가 생성되어야 사용할 수 있음!

---

## static vs non-static 차이

| 특성 | non-static | static |
|------|------------|--------|
| 생성 시점 | 객체 생성 시 | 클래스 로딩 시 |
| 생성 수 | 객체마다 별도 | 클래스당 1개 |
| 메모리 위치 | 힙 영역 | 메서드 영역 |
| 공유 여부 | ❌ | ⭕ |

---

## static 멤버는 언제 생성?

- 객체 없이도 생성됨  
- 모든 객체가 같은 static 멤버를 공유

---

##  static 멤버 선언 예시

```java
class StaticSample {
    static int m;
    static void f() { ... }
}
```

---

## 접근 지정자 예제

```java
class Sample {
    public int a;
    private int b;
    int c; // default
}

public class AccessEx {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.a = 10; // ⭕
        s.b = 10; // ❌ private
        s.c = 10; // ⭕ default (같은 패키지)
    }
}
```

# 📘 2025년 4월 17일 자바 수업 정리

---

## ✅ 생성자의 종류

- 생성자는 객체를 만들 때 자동으로 호출되어 **객체를 초기화**하는 메서드다.
- **클래스 이름과 동일한 이름을 가지며, 반환 타입이 없다 (void도 사용 ❌)**

### 🛠 기본 생성자 (Default Constructor)

- 매개변수가 없고, 아무 작업도 하지 않는 단순한 생성자
- 클래스에 생성자가 아무것도 선언되어 있지 않으면 **컴파일러가 자동으로 생성**해준다

> 🔧 비유 : 공장에서 물건을 만들 때, 옵션 없이 **기본 구성으로 출고**되는 느낌

### ❗ 기본 생성자가 자동 생성되지 않는 경우

- 사용자가 직접 다른 생성자를 작성한 경우, 기본 생성자는 **자동으로 생성되지 않음**
- 이 경우 기본 생성자를 **명시적으로 정의해야 함**

> ⚠️ 비유 : 고객이 “특수 옵션”을 요구해서 공장에서 기본 옵션을 **자동으로 생략한 상황**

---

## ✅ 객체 속에서의 this

- `this`는 **자기 자신 객체를 가리키는 참조 변수**
- 필드 이름과 매개변수 이름이 겹칠 때 사용하여 **구분**해준다

> 🙋 비유 : "나 자신을 가리키는 말" — 같은 반에 ‘영수’가 둘일 때, “이 영수요!” 하고 **자기 자신을 가리키는 느낌**

---

## ✅ this 레퍼런스

- 객체 자기 자신에 대한 참조값을 가지고 있음
- **컴파일러가 자동으로 처리**, 개발자가 직접 선언하지 않아도 된다
- `this.변수` 형태로 **객체 내 필드에 접근**할 때 주로 사용됨

> 📦 비유 : 택배 상자 안에 “이 상자 안에 든 물건”이라고 라벨링 해두는 느낌

---

## ✅ 생성자에서의 this()

- 하나의 생성자에서 **다른 생성자를 호출**할 때 사용 (`this(...)`)
- 반드시 **생성자 내부 첫 줄에 위치해야 함**
- 생성자 코드 중복을 줄일 수 있음

> 🔁 비유 : 레시피 A를 만들기 위해 레시피 B를 **먼저 실행한 후**에 A를 계속하는 느낌  
> (예: “먼저 반죽 만들기(this), 그 후에 굽기”)

---

## ❌ this() 사용 실패 예

- `this()`는 생성자 내부에서만 사용 가능
- 일반 메서드에서는 사용할 수 없음
- 생성자 호출은 **무조건 첫 줄에 와야 함**, 다른 문장이 먼저 오면 컴파일 에러

---

## ✅ 멤버의 접근 지정자

- 접근 지정자는 **클래스의 멤버(변수/메서드)의 접근 범위를 지정**한다

| 지정자      | 접근 가능 범위 |
|-------------|----------------|
| `public`    | 모든 클래스에서 접근 가능 |
| (default)   | 같은 패키지 내 클래스만 접근 가능 |
| `private`   | 같은 클래스 내에서만 접근 가능 |

> 🔒 비유 :  
> - `public` = 누구나 출입 가능한 공공장소  
> - `default` = 회사 출입증 있는 사람만 들어갈 수 있는 구역  
> - `private` = 집 안방처럼 본인만 들어갈 수 있음

---

## ✅ 배열을 인자로 전달할 때 (배열 참조 전달)

- 자바에서는 배열을 메서드에 전달할 때 **배열의 참조(주소)**가 전달됨
- 메서드 안에서 배열 내용을 바꾸면 **원래 배열에도 영향을 줌**

> 📬 비유 : 편지를 복사해서 주는 게 아니라, **원본 편지의 위치(주소)**를 알려주는 것과 같음

---

## ✅ 클래스 상속

- `extends` 키워드를 사용하여 다른 클래스를 **상속**할 수 있음
- 부모 클래스(상위)는 **슈퍼 클래스**, 자식 클래스(하위)는 **서브 클래스**
- 자식 클래스는 부모 클래스의 멤버를 **그대로 물려받아 사용** 가능

> 👪 비유 : 자식이 부모의 유전자를 물려받는 것처럼,  
> 클래스를 재사용해서 **코드 중복을 줄이고 유지보수 용이**

---

## ✅ 상속의 필요성

- 중복되는 멤버를 상위 클래스(Person)로 올리고,  
  하위 클래스(Student, Professor 등)는 **특화된 기능만 추가**한다

> 🔁 비유 :  
> 모든 사람이 말하기/걷기/먹기를 하므로 ‘Person’에 정의하고,  
> 연구하기는 연구자만, 공부하기는 학생만 하도록 **구분된 기능을 추가**

---

## ✅ final 클래스와 메서드

- `final` 클래스: 더 이상 **상속할 수 없음**
- `final` 메서드: 더 이상 **오버라이딩 할 수 없음**

> 🚫 비유 :  
> - `final class`는 “이건 손대지 마!” 라는 **완성품**  
> - `final method`는 “이 부분은 수정 금지!”라는 **고정 기능**

---

## ✅ static 메서드의 제약 조건 1

- `static` 메서드는 **static 멤버만 접근 가능**
- 객체가 없어도 호출될 수 있으므로, 객체(인스턴스)의 멤버에는 접근할 수 없음

> 📡 비유 : 방송국(static)이 전국에 신호를 뿌리는 느낌.  
> 방송국은 전국에 알릴 수 있지만, **각 집 내부의 사적인 일(n)**은 알 수 없음

---

## ✅ static 메서드의 제약 조건 2

- `static` 메서드는 **this 사용 불가**
- this는 **객체 자기 자신을 가리키는 참조**인데,  
  static 메서드는 객체 없이도 호출되므로 존재하지 않음

> 📍 비유 : 사람이 존재해야 “나(this)”라는 말을 쓸 수 있는데,  
> 정적인 공간에서는 “나”라는 개념 자체가 없어서 this도 사용 불가!

# 📘 자바 상속, 객체 배열, 접근 제어자 정리

---

## 🧩 객체 배열

자바에서 객체 배열을 만들기 위해선 총 3단계가 필요해.

1. **배열 레퍼런스 변수 선언**  
   → `Circle[] c;`처럼 객체 타입 배열을 선언

2. **레퍼런스 배열 생성**  
   → `c = new Circle[5];` 배열 공간을 확보해

3. **배열의 각 요소(객체) 생성**  
   → `c[i] = new Circle(i);`처럼 실제 객체를 각 배열 칸에 채워 넣음

📦 비유:  
객체 배열은 **찬장이 비어있는 그릇들**이라고 생각하면 돼.  
처음엔 찬장을 만들고 (`new Circle[5]`), 그릇을 하나씩 채워넣어야 (`new Circle(i)`) 사용할 수 있어.

---

## 👨‍👩‍👧‍👦 상속의 필요성

클래스를 여러 개 만들다 보면 **중복 코드가 엄청 많아져서 유지보수 힘들어짐**.  
예: `말하기`, `먹기`, `걷기`, `자기` 같은 공통 기능이 각 클래스에 반복됨.

🌱 **상속을 사용하면**  
공통 기능을 하나의 클래스(`Person`)로 묶고  
다른 클래스들이 그걸 상속받아 중복을 줄일 수 있음.

> 📦 비유: 같은 회사에서 일하는 사람들이 기본 교육은 똑같이 받고, 각자 부서 업무만 추가로 배우는 것과 같음!

---

## 🚫 final 클래스와 final 메서드

- **final 클래스**  
  → 더 이상 상속 불가.  
  → 마치 완제품처럼 더 이상 확장하거나 바꿀 수 없음!

- **final 메서드**  
  → 오버라이딩(재정의) 불가능.  
  → 메서드 동작을 그대로 유지하고 싶을 때 사용.

> 🔒 비유:  
> `final` 클래스는 **출고된 봉인된 제품**  
> `final` 메서드는 **수정 불가능한 설명서**

---

## 👨‍👧 서브 클래스에서 슈퍼 클래스 접근

### 슈퍼 클래스의 필드/메서드 접근 가능 여부

| 접근 지정자 | 같은 패키지 | 다른 패키지 | 상속한 서브 클래스 |
|-------------|--------------|--------------|----------------------|
| `private`   | ❌           | ❌           | ❌                   |
| (default)   | ⭕           | ❌           | (패키지 동일 시) ⭕

| `protected` | ⭕           | ⭕ (상속 시) | ⭕                   |
| `public`    | ⭕           | ⭕           | ⭕                   |

- **private**: 오직 해당 클래스 안에서만 사용 가능
- **default**: 같은 패키지 안에서는 접근 가능
- **protected**: 같은 패키지 or 상속 관계에서는 접근 가능
- **public**: 어디서든 접근 가능

> 🔑 비유:  
> - `private`은 개인 일기장  
> - `protected`는 가족끼리 보는 단톡방  
> - `public`은 인스타 공개 계정!

---

## 🔐 protected 멤버 접근 요약

- 같은 패키지: 접근 허용
- 상속 관계: 패키지 상관없이 접근 허용
- 단, **객체를 통해 접근 불가**, 반드시 **상속한 서브 클래스 내부에서 직접 접근**해야 함

> 📦 비유: 부모님 집 열쇠는 상속받은 자식만 쓸 수 있음! (남이 못 씀)

---

## 📚 클래스 상속과 extends 키워드

- `extends`: 상속을 선언할 때 사용
- 부모 클래스: **슈퍼 클래스(super class)**
- 자식 클래스: **서브 클래스(sub class)**

> 예:  
> `class ColorPoint extends Point { ... }`  
> → `ColorPoint`는 `Point`를 확장(상속)한 클래스

---

## 📤 static 메서드의 제약 조건

1. **static 메서드는 오직 static 멤버만 접근 가능**
   - 객체 없이도 실행되므로, 인스턴스 필드 접근 ❌
   - `this` 키워드 사용 ❌

2. **static 메서드는 static 필드/메서드만 접근 가능**
   - static method 안에서는 다른 static method/변수는 사용 가능함

> 📦 비유:  
> `static`은 클래스 자체에서 작동하는 메서드니까,  
> **객체 없이 돌아가는 공장 설비**라고 생각하면 돼.  
> `this`는 객체 자신을 가리키는 건데, 공장 설비는 개인이 아니라서 `this`는 못 씀!
## 클래스 상속과 객체에 대한 개념 정리

### 클래스와 객체의 상속 관계
- 클래스 간의 **상속(inheritance)**은 코드의 중복을 제거하고 재사용성을 높이기 위한 핵심 개념이다.
- `extends` 키워드를 사용해 **자식 클래스(서브 클래스)**가 **부모 클래스(슈퍼 클래스)**를 상속받을 수 있다.
- 슈퍼 클래스에 선언된 멤버 필드와 메서드는 서브 클래스에서 그대로 사용할 수 있다.
- 서브 클래스는 슈퍼 클래스의 기능을 물려받으면서, 추가적인 멤버나 기능을 확장할 수 있다.

### 서브 클래스 객체의 모양
- 서브 클래스의 객체는 슈퍼 클래스의 멤버도 포함하고 있다. 즉, 서브 클래스의 객체는 **슈퍼 클래스 + 서브 클래스**의 멤버로 구성된다.
- 객체 생성 시 서브 클래스의 생성자가 호출되지만, 그 전에 슈퍼 클래스의 생성자가 먼저 실행된다. 이걸 "**상속된 멤버 초기화**"라고 한다.

### 생성자의 선택과 실행 순서
- 슈퍼 클래스와 서브 클래스는 각각 여러 개의 생성자를 가질 수 있다.
- **서브 클래스 객체가 생성되면**, 슈퍼 클래스의 생성자 1개 + 서브 클래스 생성자 1개가 **모두 실행**된다.
- 생성자 호출 순서: **서브 클래스의 생성자 호출 → 내부에서 슈퍼 클래스 생성자 호출**
- 실행 순서: **슈퍼 클래스 생성자 먼저 실행 → 서브 클래스 생성자 실행**

### 생성자 선택 방식
1. **개발자의 명시적 선택**: 서브 클래스에서 `super()` 키워드를 사용해 슈퍼 클래스의 생성자를 직접 호출.
2. **컴파일러에 의한 기본 생성자 자동 선택**:
   - 서브 클래스 생성자에서 `super()`를 명시하지 않으면, **컴파일러가 자동으로 슈퍼 클래스의 기본 생성자를 호출**함.
   - 슈퍼 클래스에 기본 생성자가 없으면 **오류 발생**.

### 생성자 호출 관련 예외 상황
- **슈퍼 클래스에 기본 생성자가 없는데**, 서브 클래스가 `super()`를 명시적으로 호출하지 않으면 오류가 발생한다.
- 오류 메시지 예시: `Implicit super constructor A() is undefined. Must explicitly invoke another constructor`.

### 접근 지정자에 따른 상속 접근 제한
- `private`: 서브 클래스에서 접근 불가
- **default(디폴트)**: 같은 패키지 안에 있을 경우 접근 가능
- `protected`: 같은 패키지거나 상속받은 서브 클래스이면 접근 가능
- `public`: 어디서든 접근 가능

#### 접근 가능 여부 요약표

| 클래스 종류             | private | default | protected | public |
|------------------------|---------|---------|-----------|--------|
| 같은 패키지의 클래스       | ❌      | ⭕      | ⭕        | ⭕     |
| 다른 패키지의 클래스       | ❌      | ❌      | ❌        | ⭕     |
| 같은 패키지의 서브 클래스 | ❌      | ⭕      | ⭕        | ⭕     |
| 다른 패키지의 서브 클래스 | ❌      | ❌      | ⭕        | ⭕     |

- `protected` 멤버는 같은 패키지의 클래스들에게 모두 허용되며, **다른 패키지라도 서브 클래스라면 접근 가능**하다.
- `private` 멤버는 오직 해당 클래스 내부에서만 접근 가능하다.

### 비유를 들어 정리하면?
- **슈퍼 클래스**는 부모님, **서브 클래스**는 자식.
- 부모님이 집(객체)을 지어놓고 자식은 그 집을 물려받아 꾸미는 느낌.
- 부모님이 열쇠(멤버 변수와 메서드)를 주면 자식은 그것을 쓰고 확장할 수 있음.
- 하지만 열쇠 중 일부(`private`)는 부모님만 쓸 수 있고 자식은 못 씀.
- 생성자는 집을 지을 때 사용하는 설계도 같은 역할. 부모 집 먼저 지어야 자식 집도 완성 가능.


# 📘 자바의 업캐스팅, 다운캐스팅, 오버라이딩 개념 정리

## ✅ 개념 요약

자바에서 오버라이딩(Overriding)은 부모 클래스의 메서드를 자식 클래스에서 동일한 이름과 매개변수 구조로 다시 정의하는 기능이다. 이를 통해 하나의 메서드 이름이 실제 객체에 따라 다르게 동작하는 다형성(Polymorphism)을 구현할 수 있다. 실행 시점에 어떤 메서드가 실행될지는 실제 객체의 타입에 따라 결정되며, 이를 동적 바인딩(Dynamic Binding)이라고 한다. 예를 들어 `Shape` 클래스의 `draw()` 메서드를 `Circle`, `Rect`, `Line`에서 각각 오버라이딩하면, `Shape` 타입의 변수로 호출하더라도 실제 객체 타입에 따라 다른 결과가 실행된다. 이건 마치 같은 대사를 주더라도 배우마다 연기 방식이 달라지는 것처럼 객체에 따라 메서드 동작이 달라지는 것이다.

업캐스팅(Upcasting)은 자식 객체를 부모 클래스 타입으로 참조하는 것으로, `Student` 객체를 `Person` 타입으로 선언하면 부모 클래스에 정의된 멤버들만 접근할 수 있고 자식 클래스의 고유 멤버들은 사용할 수 없게 된다. 이건 고양이, 사람, 돌고래를 모두 '생물'이라는 상위 개념 박스에 담아 공통된 특성만 사용하는 것과 같다. 업캐스팅은 자동 형변환이며, 다형성을 위해 자주 활용된다. 특히 다양한 자식 객체를 하나의 배열이나 리스트에 담기 위해 자주 사용되는데, 예를 들어 `Person[] arr = new Person[3];`처럼 선언하면 `Student`, `Professor`, `Researcher` 객체를 함께 담을 수 있다. 이건 다양한 과일을 하나의 “과일 박스”에 담는 느낌이다.

다운캐스팅(Downcasting)은 업캐스팅된 부모 타입 객체를 다시 자식 타입으로 변환하여 자식 클래스 고유 기능을 사용할 수 있게 한다. 이건 ‘생물’ 박스에서 고양이를 꺼내 고양이로서의 특성을 쓰는 것과 같은 개념이다. 하지만 이때는 명시적인 형변환이 필요하고, 실제 객체가 자식 클래스가 아니면 오류가 발생하므로 주의가 필요하다. 따라서 안전한 형변환을 위해 instanceof 연산자를 사용한다.

`instanceof`는 객체가 특정 클래스의 인스턴스인지 확인하는 연산자이며, 박스에 뭐가 들어있는지 라벨을 확인하는 것처럼 미리 검사할 수 있다. 예를 들어 `if (p instanceof Student)`처럼 확인한 뒤 `(Student)p`로 형변환을 하면 안전하게 자식 멤버를 사용할 수 있다.

이처럼 업캐스팅은 유연한 설계를 가능하게 하고, 다운캐스팅은 필요할 때 세부 기능을 활용할 수 있도록 해준다. 모든 객체를 하나의 부모 타입 배열에 담아 다형성을 실현하고, 필요할 때 다시 자식 형태로 꺼내어 활용하는 방식은 자바의 객체지향 설계에서 매우 핵심적인 구조다.

---

## 🧠 개념 요약 표

| 항목             | 설명                                                                 |
|------------------|----------------------------------------------------------------------|
| 오버라이딩        | 부모 메서드를 자식이 재정의 → 다형성 구현                             |
| 업캐스팅          | 자식 → 부모로 형변환 (자동) → 부모 멤버만 접근 가능                   |
| 다운캐스팅        | 부모 → 자식으로 형변환 (명시적 필요) → 자식 멤버 접근 가능            |
| instanceof       | 형변환 전에 객체 타입 체크 (안전한 다운캐스팅에 필수)                  |
| 다형성            | 같은 메서드 호출이 객체에 따라 다르게 반응함 (동적 바인딩 기반)        |

---

## 🔍 코드 예시

```java
// 업캐스팅
Student s = new Student("홍길동");
Person p = s;  // 업캐스팅 (자동)

// 접근 가능
System.out.println(p.name);    // ✅ 부모 멤버
// System.out.println(p.grade); // ❌ 자식 멤버 접근 불가

// 다운캐스팅
if (p instanceof Student) {
    Student s2 = (Student)p;
    System.out.println(s2.grade);  // ✅ 자식 멤버 사용 가능
}



