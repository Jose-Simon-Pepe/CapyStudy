package configurations;

import generator.configs.StudyConfiguration;

public class DefaultConfigGenerable {
    static public StudyConfiguration studySession(){
        String configuracion1 = "contenido";
        String configuracion2 = "contenido";
        String configuracion3 = "contenido";
        return new StudyConfiguration().add(configuracion1,configuracion2,configuracion3).get();
    }

}
