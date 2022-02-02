class College{
    int rollNumber ;
    String name;
    static String college = "PCST";

   public void Student(int a, String b){
       rollNumber = a;
        name = b;

        System.out.println("student name"+" "+name+" "+"and this is a roll Number"+" "+rollNumber+" "+"college name "+""+college);
   } 
} 
public class Student{
    public static void main(String[] args) {
        College obj = new College();
        obj.Student(108, "raja");
        obj.Student(109, "arbaj");
    }
}