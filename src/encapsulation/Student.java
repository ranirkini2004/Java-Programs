package encapsulation;

public class Student {
    private String name="Rani";
    private String usn="4CB22CS102";
    private int age=30;
    private int marks=80;

    public String getName() {
        return name;
    }


    public String getUsn() {
        return usn;
    }



    public int getAge() {
        if(age>0 && age<100){
            return age;
        }else{
            return 0;
        }
    }

    public void setAge(int age) {
        if(age>this.age && age<100){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public int getMarks(){
//        return marks;
//    }
//    public String getUsn(){
//        return usn;
//    }

    //setter
//    public void setMarks(int marks){
//        this.marks=marks;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
}
