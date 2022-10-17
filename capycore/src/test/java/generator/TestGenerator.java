package generator;

import configurations.DefaultConfigGenerable;
import generator.configs.StudyConfiguration;
import note.studynote.StudyNote;
import org.junit.jupiter.api.Test;
import reviewsheet.ReviewSheet;
import spacedpractice.SpacedPractice;
import student.Student;
import studysession.StudySession;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo Cómo estudiante, quiero que estas prácticas espaciadas estén automáticamente calendarizadas siguiendo la curva del olvido que he seteado
 * todo Cómo estudiante, quiero calendarizar una sesión de estudio para el día actual
 * todo Cómo estudiante, quiero generar fichas de repaso automáticamente a partir de mis notas de estudio
 */
public class TestGenerator {

    Generator generator = new Generator();
    Student whoStudies = new Student();

    //  done Cómo estudiante, quiero generar prácticas espaciados automáticamente estudysessions y review files

    @Test
    void should_test_that_generator_creates_spaced_practices() {
        //given a generator
        //when
        SpacedPractice sp = generator.createGenerables().spacedPractice().get();
        //then
        assertNotNull(sp);
    }

    @Test
    void should_test_that_generator_creates_study_sessions() {
        //given a generator
        //when
        StudySession ss = generator.createGenerables().studySession().get();
        //then
        assertNotNull(ss);
    }

    @Test
    void should_test_that_generator_creates_review_files_from_study_sheets() {
        //given a generator
        //when
        SpacedPractice sp = generator.createGenerables().spacedPractice().get();
        //then
        assertNotNull(sp);
    }

    // todo Cómo estudiante, quiero generar review files de una nota de estudio que he hecho
    // todo generator cannot create reviewFile

    @Test
    void should_test_that_generator_uses_study_notes_to_create_review_file() {
        //given
        StudyNote fileToConvert = new StudyNote();
        //when
        ReviewSheet toCreate = generator.createGenerables().reviewSheet().from(fileToConvert).get();
        //then
        assertNotNull(toCreate);

    }

    @Test
    void should_test_that_generator_only_creates_review_files_if_exits_study_note() {
        //given
        StudyNote fileToConvert = null;
        //when
        ReviewSheet toCreate = generator.createGenerables().reviewSheet().from(fileToConvert).get();
        //then
        assertNull(toCreate);

    }

    @Test
    void should_test_that_generator_creates_review_files_using_passed_file() {
        //given
        StudyNote fileToConvert = new StudyNote();
        //when
        ReviewSheet toCreate = generator.createGenerables().reviewSheet().from(fileToConvert).get();
        //then
        assertEquals(fileToConvert, toCreate.getFrom());

    }

    // done Cómo estudiante, quiero generar sesiones de estudio automáticamente con mis configuraciones


    @Test
    void should_test_that_generator_creates_study_sessions_with_user_config() {
        //given
        StudyConfiguration studySessionsConfigurations = whoStudies.getStudyConfigurations(1);
        //when
        StudySession generated = generator.createGenerables().studySession().using(studySessionsConfigurations);
        //then
        assertEquals(studySessionsConfigurations, generated.getConfig());
    }

    @Test
    void should_test_that_generator_creates_study_sessions_with_user_config_if_has_one_at_least() {
        //given a student
        StudyConfiguration studySessionsConfigurations = null;
        //when
        StudySession generated = generator.createGenerables().studySession().using(studySessionsConfigurations);
        //then
        assertNull(generated);
    }

    // todo: en caso de no tener configuraciones creadas, generator usará una config por defecto
    // todo: en caso de no tener configuraciones creadas y no tener la defecto, no se creará un generable


    @Test
    void should_test_that_generator_uses_default_config_to_create_generables() {
        //given
        DefaultConfigGenerable byDefault = new DefaultConfigGenerable();
        //when
        StudySession generated = generator.createGenerables().studySession().get();
        //then
        assertEquals(generated.getConfig(),byDefault);
    }
}
