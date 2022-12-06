package lesson2_methodsoverloading;

public class ExecutionOverloading {
    public static void main(String[] args) {
        System.out.println("This student are the qualification: " +QualificationManager.getQualification(78.5));
        System.out.println("The qualification for the student is: " + QualificationManager.getQualification(4));
    }
}
