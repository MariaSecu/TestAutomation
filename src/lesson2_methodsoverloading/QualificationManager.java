package lesson2_methodsoverloading;

public class QualificationManager {
    public static String getQualification(double score) {
        if (score < 50) {
            return "Failed the test";
        } else if (score > 50 & score < 60) {
            return "Good!";
        } else if (score > 60 & score < 70) {
            return "Good job";
        } else if (score > 70 & score < 80) {
            return "You are on fair";
        } else if (score > 80 & score < 90) {
            return "Very good";
        } else if (score > 90 & score <= 100) {
            return "Exceleny";
        } else if (score < 1 & score > 101) {
            return "This score is not valid.";
        }
        return null;
    }

    public static String getQualification(int grade) {
        switch (grade) {
            case 1:
                return "Failed the test.Very bad.";
            case 2:
                return "Failed the test.Keep going.";
            case 3:
                return "Failed the test.Keep learn.";
            case 4:
                return "Failed the test. Work more.";
            case 5:
                return "Good";
            case 6:
                return "Good work";
            case 7:
                return "Very nice";
            case 8:
                return "You are on fair";
            case 9:
                return "Very good";
            case 10:
                return "Excelent";
            default:
                return "This grade is not valid";
        }
    }

}
