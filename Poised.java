import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Poised {
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {

        // Creating an object for my method and print out the results as well as creating a boolean to false.
        Project updatedProject = newProject();
        System.out.println(updatedProject);
        boolean is_edit = true;

        // Use while loop to represent a menu to the user where they can choose different options to work from.
        while (is_edit) {

            System.out.println("Enter what you would like to do with the project:\n" +
                    "\n1. - Change the due date." +
                    "\n2. - Change the total amount of the paid up to date." +
                    "\n3. - Update a contractor's contact details." +
                    "\n4. - Finalise the project." +
                    "\n5. - Exit.");
            String menu = inputs.nextLine();

            /* Use switch cases to help with the decision-making of the menu. Case 1 will allow the user to change the
             due date. Case 2 will allow the user to change the total amount paid up to date. Case 3 will allow the
             user to change the contractor's contact details. Case 4 will exit the menu and break the while loop.*/
            switch (menu) {

                case "1":
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the deadline here:\n");
                    String newDeadline = sc.nextLine();
                    updatedProject.setDeadline(newDeadline);
                    System.out.println("\n" + updatedProject);
                    break;

                case "2":
                    Scanner ac = new Scanner(System.in);
                    System.out.println("Enter the added amount paid here:\n");
                    double newAmount = ac.nextDouble();
                    updatedProject.setAmountPaid(newAmount);
                    System.out.println("\n" + updatedProject);
                    break;

                case "3":
                    Scanner cd = new Scanner(System.in);
                    System.out.println("Enter the new telephone number here:\n");
                    int newTelephoneNumber = cd.nextInt();
                    updatedProject.getContractor().setTelephoneNumber(newTelephoneNumber);

                    new Scanner(System.in);
                    System.out.println("Enter the new email address here:\n");
                    String newEmail = cd.nextLine();
                    updatedProject.getContractor().setEmail(newEmail);
                    System.out.println("\n" + updatedProject);
                    break;

                case "5":
                    is_edit = false;
                    System.out.println("Thank you for using the program.");
                    break;
            }
        }
    }

    public static Project newProject() {

        /* This method will get all the necessary info needed for the project. Asking the user to enter details and
        store it in different attributes. The while loops will help with the try and catch blocks for error handling.
        The two variables in the try and catch blocks will be initialized outside the loops so that they will still
        fall in the scope.*/
        Scanner questions = new Scanner(System.in);
        System.out.println("Enter the project number here:\n");
        int newProjectNumber = questions.nextInt();

        questions = new Scanner(System.in);
        System.out.println("Enter the project name here:\n");
        String newProjectName = questions.nextLine();

        questions = new Scanner(System.in);
        System.out.println("Enter the building type here:\n");
        String newBuildingType = questions.nextLine();

        questions = new Scanner(System.in);
        System.out.println("Enter the address of the project here:\n");
        String newProjectAddress = questions.nextLine();

        int newErfNumber;
        while (true) {

            try {
                questions = new Scanner(System.in);
                System.out.println("Enter the ERF number here:\n");
                newErfNumber = questions.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a whole number value. Please try again.");
            }
        }
        double newTotalProjectFee;
        while (true) {

            try {
                questions = new Scanner(System.in);
                System.out.println("Enter the total project fee here:\n");
                newTotalProjectFee = questions.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a valid numerical number that is seperated by a comma if necessary. Please try again.");
            }
        }

        questions = new Scanner(System.in);
        System.out.println("Enter the amount paid here:\n");
        double newAmountPaid = questions.nextDouble();

        questions = new Scanner(System.in);
        System.out.println("Enter the deadline here:\n");
        String newDeadline = questions.nextLine();

        // Calling the newPersons method three times to get three different people's info, the print will show which one
        // they need to enter.
        System.out.println("Enter the details of the architect here:\n");
        Persons architect = newPersons();

        System.out.println("Enter the details of the contractor here:\n");
        Persons contractor = newPersons();

        System.out.println("Enter the details of the customer here:\n");
        Persons customer = newPersons();

        // Checking whether the person entered a project name and if they did not it will automatically add the customer's
        // name as the project name.
        if (newProjectName.equals("")) {
            newProjectName = customer.getName();
        }
        // Storing all the attributes in the object as parameters.
        return new

                Project(newProjectNumber, newProjectName, newBuildingType, newProjectAddress,
                newErfNumber, newTotalProjectFee, newAmountPaid, newDeadline, architect, contractor, customer);

    }

    public static Persons newPersons() {

        // This method will get all the info of the architect, contractor and customer. Asking the user to enter the
        // details and store them in attributes.
        Scanner contactsDetails = new Scanner(System.in);
        System.out.println("Enter the name here:\n");
        String newName = contactsDetails.nextLine();

        contactsDetails = new Scanner(System.in);
        System.out.println("Enter the telephone number here:\n");
        int newTelephoneNumber = contactsDetails.nextInt();

        contactsDetails = new Scanner(System.in);
        System.out.println("Enter the email address here:\n");
        String newEmail = contactsDetails.nextLine();

        contactsDetails = new Scanner(System.in);
        System.out.println("Enter the physical address here:\n");
        String newPhysicalAddress = contactsDetails.nextLine();

        // Returning all the info back into the method.
        return new Persons(newName, newTelephoneNumber, newEmail, newPhysicalAddress);
    }
}
