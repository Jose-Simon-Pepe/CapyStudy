package generator;

import reviewsheet.ReviewSheet;
import spacedpractice.SpacedPractice;
import studysession.StudySession;

public class Create {
    public StudySession studySession(){
        return new StudySession();
    }
    public SpacedPractice spacedPractice(){
        return new SpacedPractice();
    }

    public ReviewSheet reviewSheet(){
        return new ReviewSheet();
    }
}
