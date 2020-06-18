import Q_1_60.Q9;
class C {
    public C() {
        System.out.println("C");
    }
}

class B extends C {
    public B() {                   //line n1
        System.out.println("B");
    }
}
    public class question9 extends B {

public question9(){
    System.out.println("A");
}

        public static void main(String[] args) {
            question9 x=new question9();
        }

    }

/*
What is the result?

A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

Answer: A
 */
