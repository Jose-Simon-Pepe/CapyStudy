package student;

import capyutilities.ServicesUtilities;

public class StudentSrv extends ServicesUtilities {
    public Boolean saveStudentData(Student whoSaves) {

        return input_was_completed(whoSaves.getName(), whoSaves.getSurname(), whoSaves.getPass()) &&
                input_is_right(whoSaves);
    }
}
