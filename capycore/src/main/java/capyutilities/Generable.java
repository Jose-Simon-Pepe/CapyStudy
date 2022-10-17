package capyutilities;

import generator.configs.StudyConfiguration;
import studysession.StudySession;

public interface Generable<Object,Configuration> {

    Object get();


    Object using(Configuration toUse);

    Configuration getConfig();

}
