package student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentRegistration {
        /*
        Registros de perfiles por usuario
            TODO Cómo estudiante, quiero iniciar la aplicación sin tener que confirmar que soy yo dado que soy el único usuario del pc, para usarla más ágilmente
            TODO Cómo estudiante, quiero tener una forma de acceso que garantice que soy yo quien está accediendo a mi contenido
        */

    StudentSrv studentService = new StudentSrv();

    //            TODO Cómo estudiante, quiero guardar mis datos en mi propio perfil    
    @Test
    void should_save_my_own_data() {
        //given
        Student whosaves = new Student();
        whosaves.setName("pedro").setSurname("carlos").setPass("menem123");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertTrue(wasSaved);
    }

    // Case: Student key data can't be empty or incorrectly wrote


    @Test
    void should_test_that_student_key_data_is_not_empty() {
        //given
        Student whosaves = new Student();
        whosaves.setName("").setSurname("").setPass("");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertFalse(wasSaved);
    }
}


