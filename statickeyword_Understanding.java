class Mobile{
    String brand;
    int price;
    static String name;//static variable is created which will be same for different objects
    static {

        name = "phone";
        System.out.println("This is static method.");
    }
    public void show(){
        System.out.println("Brand: " + brand +" "+ "Price: " + price +" "+ "Name: " + name);
    }
    public static void show1(Mobile obj){
        System.out.println("Brand: " + obj.brand +" "+ "Price: " + obj.price +" "+ "Name: " + name);
    }

}
public class statickeyword_Understanding {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 80000;
//        obj1.name = "SmartPhone";
        // This is the wrong way to called the static variable
        //static variable should be called with the class name;
        Mobile.name = "SmartPhone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Andriod";
        obj2.price = 60000;
//        obj2.name = "SmartPhone";
        // Static variable "name" should be called by Class name;
        Mobile.name = "SmartPhone";
        obj1.show();
        obj2.show();
        //So to call the static method we have to called in below way
        //To access non staic variable we have to pass the particular object inside the method as well as method call
        
        Mobile.show1(obj1);

    }
}
