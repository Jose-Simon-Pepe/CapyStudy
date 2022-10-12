package spacedpractice;

import capyutilities.Gettable;

public class SpacedPractice implements Gettable<SpacedPractice>{

    @Override
    public SpacedPractice get() {
        return (SpacedPractice) this;
    }
}
