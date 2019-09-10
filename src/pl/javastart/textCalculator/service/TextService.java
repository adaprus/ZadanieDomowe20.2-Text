package pl.javastart.textCalculator.service;

public class TextService {
    public int numberOfCharacters(String text) {
        return text.length();
    }

    public int numberOfWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public int numberOfCharactersWithNoSpaces(String text) {
        String[] words = text.split(" ");
        String textWithNoSpaces = words[0];

        for (int i = 1; i < words.length; i++) {
            textWithNoSpaces += words[i];
        }
        System.out.println(textWithNoSpaces);
        return textWithNoSpaces.length();
    }

    public boolean isPalindrome(String text) {
        String[] characters = text.split("");
        for (int i = 0; i < text.length() / 2; i++) {
            if (!(characters[i].equals(characters[text.length() - i - 1]))) {
                return false;
            }
        }
        return true;
    }
}
