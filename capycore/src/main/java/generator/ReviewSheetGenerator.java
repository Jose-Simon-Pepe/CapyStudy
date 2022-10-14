package generator;

import note.studynote.StudyNote;
import reviewsheet.ReviewSheet;

public class ReviewSheetGenerator {

    private StudyNote from;

    public ReviewSheetGenerator from(StudyNote fileToConvert) {
        from = fileToConvert;
        return this;
    }

    public ReviewSheet get(){
        if (from ==null) return null;
        return new ReviewSheet(from);
    }
}
