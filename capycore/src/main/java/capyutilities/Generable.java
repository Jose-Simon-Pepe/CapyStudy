package capyutilities;

import studysession.StudySession;

public interface Generable<Object,Configuration> {

    Object get();

    Generable using(Configuration toUse);

}
