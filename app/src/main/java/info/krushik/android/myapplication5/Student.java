package info.krushik.android.myapplication5;

public class Student {
    public String FirstName;
    public String LastName;
    public int Age;

    public Student(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public Student() {
    }

    @Override
    public  String toString(){
        return  String.format("%s %s, age %s", FirstName, LastName, Age);
    }
}
