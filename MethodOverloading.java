class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int res = obj.add(1,2,3);
        System.out.println(res);
        int res1 = obj.add(1,2);
        System.out.println(res1);
        double res2 = obj.add(1.1,2.1);
        System.out.println(res2);
    }
}
