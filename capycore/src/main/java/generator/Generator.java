package generator;

import spacedpractice.SpacedPractice;

public class Generator{


    public Create create() {
        return new Create();
    }

    public Generator spacedPractice(){
        return this;
    }

    public SpacedPractice get(){
        return new SpacedPractice();
    }


}
