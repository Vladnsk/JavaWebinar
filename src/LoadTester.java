/**
 * Created by Владислав on 29.07.2017.
 */
public class LoadTester extends SoftwareTester {
    String skills;
    LoadTester(String firstName, String lastName, int age, char sex, int experience, String education) {
        super(firstName, lastName, age, sex, experience, education);
    }

    LoadTester(String firstName, String lastName, int age, char sex, int experience,
               String education, String skills) {
        super(firstName, lastName, age, sex, experience, education);
        this.skills = skills;
    }

    LoadTester(String name, String secondName, int salary) {
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
        System.out.println("Навыки: " + getSkills());
        System.out.println("---------------------------------");
    }

    public int fullSalary(int bonus){
        int result = getSalary() + 2500 * this.experience + bonus;
        return  result;
    }

    public int [][] mirrorArray(int [][] mass){

        int [][] array = new int[mass.length][mass.length];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                array[i][j] = mass[i][mass.length-j-1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        return array;
    }
}
