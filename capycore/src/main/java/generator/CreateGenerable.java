package generator;

import capyutilities.Generable;
import generator.configs.SpacedPracticeConfiguration;
import generator.configs.StudyConfiguration;
import reviewsheet.ReviewSheet;
import reviewsheet.ReviewSheetConfiguration;
import spacedpractice.SpacedPractice;
import studysession.StudySession;

public class CreateGenerable {
    public Generable<StudySession, StudyConfiguration> studySession(){
        return new StudySession();
    }
    public Generable<SpacedPractice, SpacedPracticeConfiguration> spacedPractice(){
        return new SpacedPractice();
    }

    public Generable<ReviewSheet, ReviewSheetConfiguration> reviewSheet(){
        return new ReviewSheet();
    }
}
