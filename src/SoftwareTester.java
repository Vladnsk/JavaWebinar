import java.util.Date;

/**
 * Created by Владислав on 29.07.2017.
 * @author Vladislav Kulikov
 * @version 1.0
 */
public class SoftwareTester implements Human {
    String firstName;
    String lastName;
    int age;
    char sex;
    int experience;
    String education;
    static boolean citizenship;
    int salary;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public char getSex() {
        return this.sex;
    }

    SoftwareTester(String firstName, String lastName, int age, char sex, int experience, String education){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.experience = experience;
        this.education = education;
    }

    SoftwareTester(String name, String secondName){
        this.firstName = name;
        this.lastName = secondName;
    }

    SoftwareTester(String name, String secondName, int salary){
        this.firstName = name;
        this.lastName = secondName;
        this.salary = salary;
    }

    public void printSoftwareTester(){
        System.out.println("Name: " + this.firstName);
        System.out.println("Lastname: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Education: " + this.education);
        System.out.println("Experiens: " + this.experience);
        System.out.println("---------------------------------");
    }

    public static String checkCitizenship(){
        String result;
        if(SoftwareTester.citizenship == true)
            result = "РФ";
        else
            result = "Другое";
        return result;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    public void setCitizenship(boolean citizenship){
        SoftwareTester.citizenship = citizenship;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int fullSalary(int bonus){
        int result = getSalary() + 2000 * this.experience + bonus;
        return  result;
    }

    public String getFullName(){
        String fullName = getFirstName() + " " + getLastName();
        return fullName;
    }
}
