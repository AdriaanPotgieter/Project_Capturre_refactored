public class Project {
    // Field with attributes.
    private int projectNumber;
    private String projectName;
    private String buildingType;
    private String projectAddress;
    private int erfNumber;
    private double totalProjectFee;
    private double amountPaid;
    private String deadline;

    // Calling the persons objects.
    private Persons architect;
    private Persons contractor;
    private Persons customer;

    // Use constructor with parameters to assign them values later in the program.
    public Project(int projectNumber, String projectName, String buildingType, String projectAddress, int erfNumber,
    double totalProjectFee, double amountPaid, String deadline, Persons architect, Persons contractor, Persons customer) {

        // Assigning the values to get replaced later.
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.erfNumber = erfNumber;
        this.totalProjectFee = totalProjectFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }
    // Use getters and setters to get and set the different attributes.
    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public int getErfNumber() {
        return erfNumber;
    }

    public void setErfNumber(int erfNumber) {
        this.erfNumber = erfNumber;
    }

    public double getTotalProjectFee() {
        return totalProjectFee;
    }

    public void setTotalProjectFee(double totalProjectFee) {
        this.totalProjectFee = totalProjectFee;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid += amountPaid;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Persons getArchitect() {
        return architect;
    }

    public void setArchitect(Persons architect) {
        this.architect = architect;
    }

    public Persons getContractor() {
        return contractor;
    }

    public void setContractor(Persons contractor) {
        this.contractor = contractor;
    }

    public Persons getCustomer() {
        return customer;
    }

    public void setCustomer(Persons customer) {
        this.customer = customer;
    }
    // Changing the info to a string to print it out in a user-friendly manner. Return the variable.
    public String toString() {
        String output = "Project number:\t" + projectNumber;
        output += "\nProject name:\t" + projectName;
        output += "\nBuilding type:\t" + buildingType;
        output += "\nAddress of project:\t" + projectAddress;
        output += "\nERF number:\t" + erfNumber;
        output += "\nTotal fee of project:\t" + totalProjectFee;
        output += "\nAmount paid up to date:\t" + amountPaid;
        output += "\nProject deadline:\t" + deadline;
        output += "\nArchitect:\t" + architect;
        output += "\nContractor:\t" + contractor;
        output += "\nCustomer:\t" + customer;

        return output;
    }

}
