import java.util.Arrays;

/**
 * Created by Владислав on 29.07.2017.
 */
public class FunctionalTester extends SoftwareTester {
    String skills;

    FunctionalTester(String firstName, String lastName, int age, char sex, int experience, String education,
                     String skills) {
        super(firstName, lastName, age, sex, experience, education);
        this.skills = skills;
    }

    FunctionalTester(String name, String secondName) {
        super(name, secondName);
    }

    FunctionalTester(String name, String secondName, int salary) {
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
        System.out.println("---------------------------------");
    }

    public int fullSalary(int bonus){
        int result = getSalary() + 2200 * this.experience + bonus;
        return  result;
    }

    public int [][] sortArray(int [][] mass){

        int[] bufMass = new int[mass.length * mass[0].length];

        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                bufMass[count++] = mass[i][j];
            }
        }

        Arrays.sort(bufMass);

        count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = bufMass[count++];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        return mass;
    }
}
