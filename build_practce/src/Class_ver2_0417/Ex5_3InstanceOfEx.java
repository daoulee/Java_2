package Class_ver2_0417;

// 여러 인물(Person, Student, Researcher, Professor)을 만들어 놓고,
// 이 객체들이 어떤 역할(타입)을 가지고 있는지 구분하는 거야.
// 마치 면접에서 지원자의 역할을 체크하는 것과 비슷해!

class Person { }
class Student extends Person { }
class Researcher extends Person { }
class Professor extends Researcher { }

public class Ex5_3InstanceOfEx {
    static void print(Person p) {
        if (p instanceof Person) System.out.print("Person ");
        if (p instanceof Student) System.out.print("Student ");
        if (p instanceof Researcher) System.out.print("Researcher ");
        if (p instanceof Professor) System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> ");
        print(new Student());     // 출력: Person Student

        System.out.print("new Researcher() -> ");
        print(new Researcher());  // 출력: Person Researcher

        System.out.print("new Professor() -> ");
        print(new Professor());   // 출력: Person Researcher Professor
    }
}