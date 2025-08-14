package pkd_day12task;


class LeaveDetails {
    int totalLeave, sickLeave, casualLeave, usedLeave, remainingLeave;

    LeaveDetails(int totalLeave, int sickLeave, int casualLeave, int usedLeave) {
        this.totalLeave = totalLeave;
        this.sickLeave = sickLeave;
        this.casualLeave = casualLeave;
        this.usedLeave = usedLeave;
        this.remainingLeave = totalLeave - usedLeave;
    }

    void display() {
        System.out.println("\n-- Leave Details --");
        System.out.println("Total Leaves: " + totalLeave);
        System.out.println("Sick Leaves: " + sickLeave);
        System.out.println("Casual Leaves: " + casualLeave);
        System.out.println("Used Leaves: " + usedLeave);
        System.out.println("Remaining Leaves: " + remainingLeave);
    }
}
