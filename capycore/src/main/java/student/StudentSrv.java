package student;

import capyutilities.ServicesUtilities;

public class StudentSrv extends ServicesUtilities {
    public Boolean saveStudentData(Student whosaves) {
        return input_was_completed(whosaves.getName(),whosaves.getSurname(),whosaves.getPass()) &&
                input_is_right(whosaves);
    }
}
