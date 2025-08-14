package pkd_day12task;

class ProfessionalDetails {
   private String designation, department, qualification, manager;
    private int experience;

    ProfessionalDetails(String designation, String department, String qualification, String manager, int experience) {
        this.designation = designation;
        this.department = department;
        this.qualification = qualification;
        this.manager = manager;
        this.experience = experience;
    }

    void display() {
        System.out.println("\n-- Professional Details --");
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Qualification: " + qualification);
        System.out.println("Manager: " + manager);
        System.out.println("Experience: " + experience + " years");
    }
}

