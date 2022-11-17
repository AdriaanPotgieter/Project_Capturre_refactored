public class Persons {

    // Field with attributes.
    private String name;
    private int telephoneNumber;
    private String email;
    private String physicalAddress;

    // Method with parameters.
    public Persons(String name, int telephoneNumber, String email, String physicalAddress){

        // Use constructor to assign values to the parameters.
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.physicalAddress = physicalAddress;
    }
    // Use getters and setters to get info as well as to be able to change the info.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
    // Change all the info to a string to print it out in a user-friendly manner. Return the variable.
    public String toString() {
        String output = "Name:\t" + name;
        output += "\nTelephone number:\t" + telephoneNumber;
        output += "\nEmail address:\t" + email;
        output += "\nPhysical address:\t" + physicalAddress;

        return output;
    }
}
