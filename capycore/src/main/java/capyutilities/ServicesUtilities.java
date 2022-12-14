package capyutilities;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class ServicesUtilities<Object> {

    protected boolean input_was_completed(String  ... inputs) {
        return Arrays.stream(inputs).noneMatch(String::isBlank);
    }


    protected String capitalize_first_letter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }


    protected boolean stringContainsNumber( String string) {
        return !string.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()).isBlank();
    }

    protected boolean stringContainsCapital( String pass) {
        return !pass.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()).isBlank();
    }

    protected boolean stringStartsWithCapital( String string) {
        return Character.isUpperCase(string.trim().charAt(0));
    }

}
