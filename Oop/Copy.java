public class Copy {
    public static void main(String args[]){
        Student s1= new Student();
        s1.name="Anjali";
        s1.roll=21;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=60;
        s1.marks[2]=50;

        Student s2=new Student(s1);

        s2.password="xyz";
        System.out.println(s2.password);

        s1.marks[2]=100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }   
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Shallow copy constructor

    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;

    }
    Student() {
        marks = new int[3];
    }

    //deep copy constructor

    // Student (Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
}
