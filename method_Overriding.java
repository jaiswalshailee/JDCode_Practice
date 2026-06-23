import Inheritennce01.Calc;

class Calcu{
    public int add(int n1, int n2){
        System.out.print("Addition: ");
        return n1+n2;
    }
}
class advanceC extends Calcu {
    public int add(int n1, int n2){
        System.out.print("Addition: ");
        return n1+n2+2; // As this method gets override here.
    }
}

public class method_Overriding {
    public static void main(String[] args){
        advanceC obj = new advanceC();
        int r1 = obj.add(2,3);
        System.out.println(r1);
    }
}
