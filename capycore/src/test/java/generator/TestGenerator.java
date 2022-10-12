package generator;

import org.junit.jupiter.api.Test;
import spacedpractice.SpacedPractice;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo Cómo estudiante, quiero generar prácticas espaciados automáticamente
 * todo Cómo estudiante, quiero generar sesiones de estudio
 * todo Cómo estudiante, quiero generar fichas de repaso automáticamente a partir de mis notas de estudio
 */
public class TestGenerator {

    @Test
    void should_test_that_generator_creates_spaced_practices() {
        //given
        Generator generator = new Generator();
        //when
        SpacedPractice sp = generator.create().spacedPractice().get();
        //then
        assertNotNull(sp);
    }

    @Test
    void should_test_that_generator_creates_study_sessions() {
        //given
        //when
        //then
    }

    @Test
    void should_test_that_generator_creates_review_files_from_study_sheets() {
        //given
        //when
        //then
    }

}
