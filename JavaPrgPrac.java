// Question 1: Basic expressions and operations
// Question 2: Classroom class implementation

class Classroom {
    private String classname;
    private String[] students;
    
    public Classroom(String classname, String[] students) {
        this.classname = classname;
        this.students = students;
    }
    
    public void printClassroomInfo() {
        System.out.println("Class Name: " + classname);
        System.out.println("Students in the class:");
        
        if (students != null && students.length > 0) {
            for (int i = 0; i < students.length; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        } else {
            System.out.println("No students in this class.");
        }
    }
    
    public String getClassname() {
        return classname;
    }
    
    public String[] getStudents() {
        return students;
    }
}

public class JavaPrgPrac {
    public static void main(String[] args) {
        // Question 1: Basic expressions
        System.out.println("Name: Raja Kumar || UID: 24mca20229");
        System.out.println("Question 1: Expression Evaluation");
        System.out.println("=" + "=".repeat(40));
        
        // 1. (101 + 0) / 3
        int result1 = (101 + 0) / 3;
        System.out.println("1. (101 + 0)/3 = " + result1);
        
        // 2. 3.0e-6 * 10000000.1
        double result2 = 3.0e-6 * 10000000.1;
        System.out.println("2. 3.0e-6 * 10000000.1 = " + result2);
        
        // 3. true && true
        boolean result3 = true && true;
        System.out.println("3. true && true = " + result3);
        
        // 4. false && true
        boolean result4 = false && true;
        System.out.println("4. false && true = " + result4);
        
        // 5. (false && false) || (true && true)
        boolean result5 = (false && false) || (true && true);
        System.out.println("5. (false && false) || (true && true) = " + result5);
        
        // 6. (false || false) && (true && true)
        boolean result6 = (false || false) && (true && true);
        System.out.println("6. (false || false) && (true && true) = " + result6);
        
        System.out.println("\n" + "=" + "=".repeat(40));
        System.out.println("Question 2: Classroom Class Implementation");
        System.out.println("=" + "=".repeat(40));
        
        // Question 2: Classroom class
        String[] studentList = {"Alice Johnson", "Bob Smith", "Charlie Brown", "Diana Prince", "Eve Adams"};
        
        Classroom myClass = new Classroom("Computer Science 101", studentList);
        
        myClass.printClassroomInfo();
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        String[] mathStudents = {"John Doe", "Jane Smith", "Mike Wilson"};
        Classroom mathClass = new Classroom("Mathematics Grade 10", mathStudents);
        
        mathClass.printClassroomInfo();
    }
}