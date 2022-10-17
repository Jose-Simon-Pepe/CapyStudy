package spacedpractice;

import capyutilities.Generable;
import generator.configs.SpacedPracticeConfiguration;

public class SpacedPractice implements Generable<SpacedPractice, SpacedPracticeConfiguration> {

    SpacedPracticeConfiguration toUse;
    @Override
    public SpacedPractice get() {
        return (SpacedPractice) this;
    }

    @Override
    public SpacedPractice using(SpacedPracticeConfiguration toUse) {
        this.toUse = toUse;
        return this;
    }

    @Override
    public SpacedPracticeConfiguration getConfig() {
        return toUse;
    }
}
