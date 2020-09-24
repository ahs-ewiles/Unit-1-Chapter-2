/**
 * Eli Wiles
 * Programming III AP CS A
 * Programming Challenge 16
 * 9/22/2020
 */
import java.util.Scanner;

public class prgrammingChallenge16 {

    public static void main(String[] args) {
        //I will import my Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //I will enter all of my variables
        String name;
        String age;
        String city;
        String college;
        String profession;
        String animal;
        String animalName;
        
        //I will ask the user for his or her name
        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        
        //I will ask the user for his or her age
        System.out.println("Please enter your age: ");
        age = keyboard.nextLine();
        
        //I will ask the user for a city
        System.out.println("Please enter a name of a city: ");
        city = keyboard.nextLine();
        
        //I will ask the user for a name of a college
        System.out.println("Please enter a name of a college: ");
        college = keyboard.nextLine();
        
        //I will ask the user for a profession
        System.out.println("Please enter a profession: ");
        profession = keyboard.nextLine();
        
        //I will ask the user for a type of animal
        System.out.println("Please enter a type of animal: ");
        animal = keyboard.nextLine();
        
        //I will ask the user for a pet's name
        System.out.println("Please enter a name of an animal: ");
        animalName = keyboard.nextLine();
        
        //I will enter the strings that the user has entered into the 
        //story
        System.out.print("There once was a person named " + name 
        + " who lived in " + city);
        System.out.print(". At the age of " + age);
        System.out.print(", " + name);
        System.out.print(" went to college at " + college);
        System.out.print(". " + name);
        System.out.print(" graduated and wetn to work as a " + profession);
        System.out.print(". Then, " + name);
        System.out.print(" adopted a(n) " + animal);
        System.out.print(" named " + animalName);
        System.out.print(". They both lived happily ever after!");
               
        
    }

}
