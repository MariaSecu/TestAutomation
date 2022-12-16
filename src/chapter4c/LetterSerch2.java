package chapter4c;

public class LetterSerch2 {
    public static String foundLetter(String text) {

        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("The yext contains letter 'A' ");
        } else {
            System.out.println("This text does not contain the letter 'A' ");
        }
        return null;
    }
}
