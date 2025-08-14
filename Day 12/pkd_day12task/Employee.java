package pkd_day12task;

class Employee {
    PersonalDetails personal;
    ProfessionalDetails professional;
    SalaryDetails salary;
    LeaveDetails leave;
    ProjectDetails project;

    Employee(PersonalDetails p, ProfessionalDetails prof, SalaryDetails sal, LeaveDetails l, ProjectDetails proj) {
        this.personal = p;
        this.professional = prof;
        this.salary = sal;
        this.leave = l;
        this.project = proj;
    }

    void displaySection(int choice) {
        switch (choice) {
            case 1: personal.display(); break;
            case 2: professional.display(); break;
            case 3: salary.display(); break;
            case 4: leave.display(); break;
            case 5: project.display(); break;
            default: System.out.println("Invalid choice.");
        }
    }
}

