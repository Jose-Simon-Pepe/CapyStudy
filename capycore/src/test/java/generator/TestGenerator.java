package generator;

import generator.configs.StudyConfiguration;
import org.junit.jupiter.api.Test;
import spacedpractice.SpacedPractice;
import student.Student;
import studysession.StudySession;

import static org.junit.jupiter.api.Assertions.*;

/**
 * done Cómo estudiante, quiero generar prácticas espaciados automáticamente
 * todo Cómo estudiante, quiero que estas prácticas espaciadas estén automáticamente calendarizadas siguiendo la curva del olvido que he seteado
 * todo Cómo estudiante, quiero calendarizar una sesión de estudio para el día actual
 * todo Cómo estudiante, quiero generar fichas de repaso automáticamente a partir de mis notas de estudio
 */
public class TestGenerator {

    Generator generator = new Generator();

    //  done Cómo estudiante, quiero generar prácticas espaciados automáticamente

    @Test
    void should_test_that_generator_creates_spaced_practices() {
        //given a generator
        //when
        SpacedPractice sp = generator.create().spacedPractice().get();
        //then
        assertNotNull(sp);
    }

    @Test
    void should_test_that_generator_creates_study_sessions() {
        //given a generator
        //when
        StudySession ss = generator.create().studySession().get();
        //then
        assertNotNull(ss);
    }

    @Test
    void should_test_that_generator_creates_review_files_from_study_sheets() {
        //given a generator
        //when
        SpacedPractice sp = generator.create().spacedPractice().get();
        //then
        assertNotNull(sp);
    }

    // todo Cómo estudiante, quiero generar sesiones de estudio automáticamente con mis configuraciones


    @Test
    void should_test_that_generator_creates_study_sessions_with_user_config() {
        //given
        Student whoStudies = new Student();
        StudyConfiguration studySessionsConfigurations = whoStudies.getStudyConfigurations(1);
        //when
        StudySession generated = generator.create().studySession().using(studySessionsConfigurations);
        //then
        assertNotNull(generated);
    }

    @Test
    void should_test_that_generator_creates_study_sessions_with_user_config_if_has_one_at_least() {
        //given
        Student whoStudies = new Student();
        StudyConfiguration studySessionsConfigurations = whoStudies.getStudyConfigurations(1);
        //when
        StudySession generated = generator.create().studySession().using(studySessionsConfigurations);
        //then
        assertNotNull(generated);
    }


}
