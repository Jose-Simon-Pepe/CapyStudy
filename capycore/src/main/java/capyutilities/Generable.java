package capyutilities;

import studysession.StudySession;

public interface Generable<Object,Configuration> {

    Object get();

    Object using(Configuration toUse);

}
