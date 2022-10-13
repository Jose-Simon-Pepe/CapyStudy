package spacedpractice;

import capyutilities.Generable;
import generator.configs.StudyConfiguration;
import studysession.StudySession;

public class SpacedPractice implements Generable<SpacedPractice,StudyConfiguration> {

    StudyConfiguration toUse;
    @Override
    public SpacedPractice get() {
        return (SpacedPractice) this;
    }

    @Override
    public SpacedPractice using(StudyConfiguration toUse) {
        this.toUse = toUse;
        return this;
    }
}
