package constructors.parameterized_const;

public class para_const {
    public static void main(String[] args) {
        Student s1=new Student("Smith",101);
        Student s2=new Student("Ram",102);
        Student s3=new Student("Sham",103);

        System.out.println(s1.name+"->"+s1.id);
        System.out.println(s2.name+"->"+s2.id);
        System.out.println(s3.name+"->"+s3.id);
    }
}
