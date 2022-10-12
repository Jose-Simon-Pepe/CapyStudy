package capyutilities;

import org.jetbrains.annotations.NotNull;
import student.Student;

public abstract class ServicesUtilities {

    protected boolean input_was_completed(String @NotNull ... inputs) {
        for (String input : inputs) {
            if (input == null || input.isBlank()) {
                return false;
            }
        }
        return true;
    }

    protected boolean input_is_right(@NotNull Student who) {
        Student toSave = null;
        if (passIsRight(who.getPass()) && !stringContainsNumber(who.getName())
                && !stringContainsNumber(who.getSurname()) && stringStartsWithCapital(who.getName())) {
             toSave = formatNameAndSurname(who);
            return stringStartsWithCapital(toSave.getName()) && stringStartsWithCapital(toSave.getSurname());
        }
        else{
            return false;
        }
    }


    private Student formatNameAndSurname(Student who) {
        who.setName(who.getName().substring(0, 1).toUpperCase() + who.getName().substring(1));
        who.setSurname(who.getSurname().substring(0, 1).toUpperCase() + who.getSurname().substring(1));
        return who;
    }

    private boolean passIsRight(String pass) {
        return stringContainsNumber(pass) && stringContainsCapital(pass) && pass.length() > 8;
    }

    private boolean stringContainsNumber(@NotNull String string) {
        for (char letter : string.toCharArray()) {
            if (Character.isDigit(letter)) {
                return true;
            }
        }
        return false;
    }

    private boolean stringContainsCapital(@NotNull String pass) {
        for (char letter : pass.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    private boolean stringStartsWithCapital(@NotNull String string) {
        return Character.isUpperCase(string.trim().charAt(0));
    }

}
