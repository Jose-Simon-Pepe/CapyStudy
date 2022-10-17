package capyutilities;

public interface Generable<Object,Configuration> {

    Object get();


    Object using(Configuration toUse);

    Configuration getConfig();

}
