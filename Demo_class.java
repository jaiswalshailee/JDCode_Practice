
//Class - objects

class Calc{
    public int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
public class Demo_class {
    public static void main(String[] args){
        int num1 =3;
        int num2 =4;
        Calc c = new Calc();
        int res = c.add(num1, num2);
        System.out.println("Addition is : "+ res);
    }
}
