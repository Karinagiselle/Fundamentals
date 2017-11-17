package Excercises;

public class Palindrome {
    public static boolean check(String word) {

        String lowerCaseWord = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        boolean equals = true;

        while (left < right && lowerCaseWord.charAt(left) == lowerCaseWord.charAt(right)) {
            left++;
            right--;

            while (!Character.isLetter(lowerCaseWord.charAt(left))) {
                left++;
            }

            while (!Character.isLetter(lowerCaseWord.charAt(right))) {
                right--;
            }
        }

        if (lowerCaseWord.charAt(left) != lowerCaseWord.charAt(right)) {
            equals = false;
        }

        if (left > lowerCaseWord.length() || right < 0) {
            equals = false;
        }

        return equals;
    }
}
