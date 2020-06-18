package Q_1_60;

public class Q2 {
    public int x;
    private Q2(){}
    private Q2(int a, int b){}
    private Q2(int a, int b, int c){}
public final static void met(){
    System.out.println("deneme");
}
    public static void main(String[] args) {
        Q2 q=new Q2();
        System.out.println(q.x);
       final int a;
       a=10;
        System.out.println(a);
met();

        /*
        2. Which three statements are true about the structure of a Java class? (Choose three.)
        A. A class cannot have the same name as its field.
        B. A public class must have a main method.
        C. A class can have final static methods.
        D. A class can have overloaded private constructors.
        E. Fields need to be initialized before use.
        F. Methods and fields are optional components of a class.

        Answer: BDE
         */
    }
}
