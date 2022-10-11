package student;

import capyutilities.ServicesUtilities;

public class StudentSrv extends ServicesUtilities {
    public Boolean saveStudentData(Student whosaves) {
        return input_is_empty(whosaves.getName(),whosaves.getSurname(),whosaves.getPass());
    }
}
