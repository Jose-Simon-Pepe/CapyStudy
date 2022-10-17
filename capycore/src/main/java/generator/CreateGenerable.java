package generator;

import spacedpractice.SpacedPractice;
import studysession.StudySession;


public class CreateGenerable {
    public StudySession studySession() {
        return new StudySession();
    }

    public SpacedPractice spacedPractice() {
        return new SpacedPractice();
    }

    public ReviewSheetGenerator reviewSheet() {
        return new ReviewSheetGenerator();
    }
}
