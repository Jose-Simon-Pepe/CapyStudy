package generator;

import capyutilities.Generable;
import generator.configs.SpacedPracticeConfiguration;
import generator.configs.StudyConfiguration;
import reviewsheet.ReviewSheet;
import reviewsheet.ReviewSheetConfiguration;
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
