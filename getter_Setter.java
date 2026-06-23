class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class getter_Setter {
    public static void main(String[] args){
        Human obj = new Human();
        obj.setAge(10);
        int res1 = obj.getAge();
        System.out.println("Age of a person " + res1 );
        obj.setName("Neha");
        String res = obj.getName();
        System.out.println("Name of the person " + res);
    }
}
