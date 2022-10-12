package student;

public class Student {

    private String name, surname, pass;
    private Boolean accessIDConfirmation = true;
    public Student setName(String name) {
        this.name=name;
        return this;
    }

    public Student setSurname(String surname) {
        this.surname=surname;
        return this;
    }


    public Student setPass(String pass) {
        this.pass=pass;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public Student setAccessIDConfirm(boolean value) {
        return this;
    }

    public Student tabAccessIDConfirmation(){
        accessIDConfirmation = !accessIDConfirmation;
        return this;
    }
}
