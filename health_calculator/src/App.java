import calculators.BMICalculator;
import calculators.CaloriesCalculator;
import calculators.BloodPressureChecker;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double userHeight;
        double userWeight;
        String userGender;
        int userAge;
        String userActivity;
        double bmi;
        double calories;
        int userSystolic;
        int userDiastolic;
        boolean userAnswer;
        
        Scanner scanInput = new Scanner(System.in);

        String name = userName(scanInput);
        greeting(name);


        String optionPicked = menuOption(scanInput);

        while(!optionPicked.equals("4")) {
            if (optionPicked.equals("1")) {
                System.out.print("\nEnter your height (in inches): ");
                userHeight = scanInput.nextDouble();
                System.out.print("Enter your weight (in pounds): ");
                userWeight = scanInput.nextDouble();
                scanInput.nextLine();
                BMICalculator userBMI = new BMICalculator(userHeight, userWeight);
                bmi = userBMI.calculateBMI(userHeight, userWeight);
                System.out.printf("\nYour BMI is %.2f: ", bmi);
                
                userAnswer = continueFunction(scanInput);
                if (userAnswer == true) {
                    optionPicked = menuOption(scanInput);
                }

            } else if (optionPicked.equals("2")) {
                System.out.print("\nEnter your height (in inches): ");
                userHeight = scanInput.nextDouble();
                System.out.print("Enter your weight (in pounds): ");
                userWeight = scanInput.nextDouble();
                scanInput.nextLine();
                System.out.print("\nEnter your gender (type male/female): ");
                userGender = scanInput.nextLine();

                while(!userGender.equalsIgnoreCase("male") && !userGender.equalsIgnoreCase("m")
                && !userGender.equalsIgnoreCase("f") && !userGender.equalsIgnoreCase("female")){
                    System.out.println("Invalid gender input.");
                    System.out.println("Please type m/male or f/female");
                    userGender = scanInput.nextLine();
                }

                if (userGender.equalsIgnoreCase("m") || userGender.equalsIgnoreCase("male")) {
                    userGender = "male";
                } else {
                    userGender = "female";
                }

                System.out.print("Enter your age (in years): ");
                userAge = scanInput.nextInt();
                scanInput.nextLine();
                System.out.println("Now you need to choose your activity level.");
                System.out.println("Your options are:");
                System.out.println("");
                userActivity = activityMenu(scanInput);
                
                CaloriesCalculator userCalories = new CaloriesCalculator();
                
                calories = userCalories.calculateCalories(userGender, userHeight, userWeight, userAge, userActivity);
                System.out.printf("\nYour daily calories intake is %.2f: ", calories);

                userAnswer = continueFunction(scanInput);
                if (userAnswer == true) {
                    optionPicked = menuOption(scanInput);
                }
                

            } else if(optionPicked.equals("3")) {
                System.out.print("\nEnter your systolic blood pressure (upper number): ");
                userSystolic = scanInput.nextInt();
                System.out.print("Enter your diastolic blood pressure (lower number): ");
                userDiastolic = scanInput.nextInt();
                scanInput.nextLine();
                BloodPressureChecker userBP = new BloodPressureChecker(userSystolic, userDiastolic);
                userBP.checkPressure(userSystolic, userDiastolic);

                userAnswer = continueFunction(scanInput);
                if (userAnswer == true) {
                    optionPicked = menuOption(scanInput);
                }                
            
            } else {
                System.out.println("\nYou entered an invalid option. Please try again.");
                userAnswer = continueFunction(scanInput);
                if (userAnswer == true) {
                    optionPicked = menuOption(scanInput);
                }    
            }
        }
            System.out.println("\nThank you for using our calculator.");
            System.out.println("Have a great rest of your day!\n");
        }


    public static String userName(Scanner scanInput) {
        String name = "";
        System.out.print("\nPlease, enter your name: ");
        name = scanInput.nextLine();
        return name;
    }

    public static void greeting(String name) {
        System.out.println("\nHello, " + name + "!");
        System.out.println("\nWelcome to the Simple Health Calculator App.");
        System.out.println("\n***********************************************************************");
        System.out.println("You will be provided with a menu of 4 different options:");
        System.out.println("1. Body Mass Index (BMI) Calculator");
        System.out.println("2. Daily Calorie Intake Calculator");
        System.out.println("3. Blood Pressure (BP) Checker");
        System.out.println("4. Quit");
        System.out.println("***********************************************************************");
    }

    public static String menuOption(Scanner scanInput) {
        String optionPicked;
        System.out.println("\nPress 1: To calculate your BMI");
        System.out.println("Press 2: To calculate your Daily Calorie Intake");
        System.out.println("Press 3: To check if you have a normal BP");
        System.out.println("Press 4: To quit");
        System.out.print("\nPlease, enter your option: ");

        optionPicked = scanInput.nextLine();
        return optionPicked;
    }

    public static String activityMenu(Scanner scanInput) {
        
        System.out.println("Choose your activity level:");
        System.out.println("Type 1: If you don't exercice at all.");
        System.out.println("Type 2: If your activity level is low.");
        System.out.println("Type 3: If your activity level is moderate.");
        System.out.println("Type 4: If your activity level is high.");
        System.out.println("Type 5: If you are extremely active.");
        System.out.print("\nEnter your choice now: ");

        String userChoice = scanInput.nextLine();
      
        return userChoice;
    }

    public static boolean continueFunction (Scanner scanInput) {
        System.out.println("\n\nWould you like to calculate something else?");
        System.out.print("Type Y to continue or N otherwise: ");
        String userAnswer = scanInput.nextLine();
        if (userAnswer.equalsIgnoreCase("Y")) {
            return true;
        } else {
            System.out.println("\nThank you for using our calculator.");
            System.out.println("Have a great rest of your day!\n");
            System.exit(0);
            return false;
        }
    }
}

