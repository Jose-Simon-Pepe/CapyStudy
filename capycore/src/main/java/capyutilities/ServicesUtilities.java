package capyutilities;

import org.jetbrains.annotations.NotNull;
import student.Student;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class ServicesUtilities {

    protected boolean input_was_completed(String @NotNull ... inputs) {
        return Arrays.stream(inputs).noneMatch(String::isBlank);
    }

    protected boolean input_is_right(@NotNull Student who) {
        Student toSave;
        if (passIsRight(who.getPass()) && !stringContainsNumber(who.getName())
                && !stringContainsNumber(who.getSurname()) && stringStartsWithCapital(who.getName())) {
            toSave = formatNameAndSurname(who);
            return stringStartsWithCapital(toSave.getName()) && stringStartsWithCapital(toSave.getSurname());
        } else {
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
        return !string.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()).isBlank();
    }

    private boolean stringContainsCapital(@NotNull String pass) {
        return !pass.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()).isBlank();
    }

    private boolean stringStartsWithCapital(@NotNull String string) {
        return Character.isUpperCase(string.trim().charAt(0));
    }

}
