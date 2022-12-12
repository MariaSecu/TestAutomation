package chapter3d;

public class TestResultMethod {
    public static char testResult(double score) {
        if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        } else
            return 'A';
    }
}
