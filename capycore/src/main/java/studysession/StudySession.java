package studysession;

import capyutilities.Generable;
import configurations.DefaultConfigGenerable;
import generator.configs.StudyConfiguration;

public class StudySession implements Generable<StudySession,StudyConfiguration> {

    StudyConfiguration toUse;

    @Override
    public StudySession get() {
        return this;
    }

    public StudySession() {
        toUse= DefaultConfigGenerable.studySession() ;
    }

    @Override
    public StudySession using(StudyConfiguration studySessionsConfigurations) {
        if (studySessionsConfigurations == null) {
            toUse= DefaultConfigGenerable.studySession() ;
        } else {
            toUse = studySessionsConfigurations;
        }
        return this;
    }

    @Override
    public StudyConfiguration getConfig() {
        return toUse;
    }
}
