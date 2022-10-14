package generator;

import spacedpractice.SpacedPractice;

public class Generator{


    public CreateGenerable createGenerables() {
        return new CreateGenerable();
    }

    public Generator spacedPractice(){
        return this;
    }

    public SpacedPractice get(){
        return new SpacedPractice();
    }


}
