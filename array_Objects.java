import java.sql.SQLOutput;

class Student{
    int rollNo;
    String name;
    int marks;
}
public class array_Objects {
    public static void main(String[] args){
        //Threee objects created
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.rollNo = 20;
        s1.name = "Riya";
        s1.marks = 40;
        s2.rollNo = 30;
        s2.name = "siya";
        s2.marks = 48;
        s3.rollNo = 50;
        s3.name = "niya";
        s3.marks = 78;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(students[0]);
        System.out.println(s1); //this stores s1 adreess

        //Enhanced for loop:
        for(Student stud : students){
            System.out.println(stud.name + ":" + stud.rollNo+ ":" + stud.marks );
        }
    }

}
