package reviewsheet;

import capyutilities.Generable;
import note.studynote.StudyNote;

public class ReviewSheet implements Generable<ReviewSheet, ReviewSheetConfiguration> {

    private StudyNote from;

    public ReviewSheet(StudyNote from) {
        this.from = from;
    }

    public ReviewSheet() {
    }

    @Override
    public ReviewSheet get() {
        return null;
    }

    @Override
    public ReviewSheet using(ReviewSheetConfiguration toUse) {
        return null;
    }


    public StudyNote getFrom() {
        return from;
    }
}
