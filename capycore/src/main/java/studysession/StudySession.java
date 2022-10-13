package studysession;

import capyutilities.Generable;
import generator.configs.StudyConfiguration;

public class StudySession implements Generable<StudySession,StudyConfiguration> {

    StudyConfiguration toUse;

    @Override
    public StudySession get() {
        return this;
    }

    @Override
    public StudySession using(StudyConfiguration studySessionsConfigurations) {
        toUse = studySessionsConfigurations;
        return this;
    }
}
