package student;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentRegistration {
        /*
        Registros de perfiles por usuario

        */

    StudentSrv studentService = new StudentSrv();
    Student whosaves = new Student();

    //  DONE: Cómo estudiante, quiero guardar mis datos en mi propio perfil
    //  DONE: Cómo estudiante, quiero tener una forma de acceso que garantice que soy yo quien está accediendo a mi contenido

    @Test
    void should_save_my_own_data() {
        //given a student
        whosaves.setName("Pedro").setSurname("Carlos").setPass("assS222212");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertTrue(wasSaved);
    }

    // Case: Student key data can't be empty or incorrectly wrote


    @Test
    void should_test_that_student_key_data_is_not_empty() {
        //given a student
        whosaves.setName("").setSurname("").setPass("");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertFalse(wasSaved);
    }

    /**
     * in order to input registration data is rightly wrote, it has to be:
     * 1- name and surname has to start with capital
     * 2- neither name nor surname can contain numeric characters
     * 3- password length has to be larger than 8, it has to have a capital, also at least one number
     */
    @Test
    void should_test_that_student_key_data_is_not_incorrectly_wrote() {
        //given a student
        whosaves.setName("PedrRo").setSurname("3f").setPass("balblabla");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertFalse(wasSaved);
    }


    @Test
    void should_test_that_system_formats_name_and_surname_automatically() {
        //given a student
        whosaves.setName("PedrRo").setSurname("faA").setPass("Contra<<<<<<<312");
        //when
        Boolean wasSaved = studentService.saveStudentData(whosaves);
        //then
        assertTrue(wasSaved);
    }

}


