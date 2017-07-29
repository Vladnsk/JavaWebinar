import java.util.Scanner;

/**
 * Created by Владислав on 29.07.2017.
 */
public class AutoTester extends SoftwareTester{
    String skills;

    AutoTester(String firstName, String lastName, int age, char sex, int experience, String education) {
        super(firstName, lastName, age, sex, experience, education);
    }

    AutoTester(String name, String secondName, int salary) {
        super(name, secondName, salary);
    }

    public String getSkills(){
        return this.skills;
    }

    public void setSkills(String skills){
        this.skills = skills;
    }

    @Override
    public void printSoftwareTester(){
        super.printSoftwareTester();
    }

    public void printFullInfo(){
        super.printSoftwareTester();
        System.out.println("Навыки: " + skills);
        System.out.println("Полная зарплата " + getFullName() + " равна: " + fullSalary(0));
        System.out.println("---------------------------------");
    }

    public int fullSalary(int bonus){
        int result = getSalary() + 2350 * this.experience + bonus;
        return  result;
    }

    public int summArray(int [][] mass){

        int summ = 0;

        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass[i].length; j++){
                summ += mass[i][j];
            }
        }
        System.out.println("Сумма массива: " + summ);
        return summ;
    }
}
