package student;

import org.junit.jupiter.api.Test;

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
        whosaves.setName("").setSurname("").setPassword("");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertTrue(wasSaved);
    }
}


