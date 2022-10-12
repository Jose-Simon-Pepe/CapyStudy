package studysession;

import capyutilities.Gettable;

public class StudySession implements Gettable<StudySession> {
    @Override
    public StudySession get() {
        return this;
    }
}
