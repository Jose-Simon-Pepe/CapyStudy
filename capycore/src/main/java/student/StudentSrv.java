package student;

import capyutilities.ServicesUtilities;
import org.jetbrains.annotations.NotNull;

public class StudentSrv extends ServicesUtilities {
    protected boolean input_is_right(@NotNull Student who) {
        Student toSave;
        if (passIsRight(who.getPass()) && !stringContainsNumber(who.getName())
                && !stringContainsNumber(who.getSurname()) && stringStartsWithCapital(who.getName())) {
            toSave = who.setName(capitalize_first_letter(who.getName())).setSurname(capitalize_first_letter(who.getSurname()));
            return stringStartsWithCapital(toSave.getName()) && stringStartsWithCapital(toSave.getSurname());
        } else {
            return false;
        }
    }

    private boolean passIsRight(String pass) {
        return stringContainsNumber(pass) && stringContainsCapital(pass) && pass.length() > 8;
    }
    public Boolean saveStudentData(Student whoSaves) {

        return input_was_completed(whoSaves.getName(), whoSaves.getSurname(), whoSaves.getPass()) &&
                input_is_right(whoSaves);
    }
}
