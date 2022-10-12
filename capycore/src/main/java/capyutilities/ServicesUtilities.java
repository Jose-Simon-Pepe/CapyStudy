package capyutilities;

import student.Student;

public abstract class ServicesUtilities {

    protected boolean input_was_completed(String... inputs) {
        for (String input : inputs) {
            if (input == null || input.isBlank()) {
                return false;
            }
        }
        return true;
    }

    protected boolean input_is_right(Student who) {
        return passIsRight(who.getPass()) && !stringContainsNumber(who.getName())
                && !stringContainsNumber(who.getSurname());
    }

    private boolean passIsRight(String pass) {
        return stringContainsNumber(pass) && stringContainsCapital(pass) && pass.length()>8;
    }

    private boolean stringContainsNumber(String string) {
        for (char letter : string.toCharArray()) {
            if (Character.isDigit(letter)) {
                return true;
            }
        }
        return false;
    }

    private boolean stringContainsCapital(String pass) {
        for (char letter : pass.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

}
