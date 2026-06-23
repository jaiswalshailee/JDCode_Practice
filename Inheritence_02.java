import java.sql.SQLOutput;
/*
Visual Flow (Easy Diagram)
new B(5)
   ↓
B(int n)
   ↓
this() → B()
            ↓
         super() → A()
                        ↓
                    "In A"
            ↓
         "In B"
   ↓
"In B N"
 */
class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A N");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In B N");
    }
}
public class Inheritence_02 {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
