package generator.configs;

import capyutilities.Configuration;

import java.util.ArrayList;
import java.util.List;

public class StudyConfiguration extends Configuration {



    public StudyConfiguration get() {
        return this;
    }

    public StudyConfiguration add(String... toSet) {
        settingList = new ArrayList<>();
        settingList.addAll(List.of(toSet));
        return this;
    }
}
