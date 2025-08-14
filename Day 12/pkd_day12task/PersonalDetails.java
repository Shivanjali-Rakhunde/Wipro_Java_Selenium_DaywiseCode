package pkd_day12task;

class PersonalDetails {
   private String name, address, phone, email, dob;

    PersonalDetails(String name, String address, String phone, String email, String dob) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
    }

    void display() {
        System.out.println("\n-- Personal Details --");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
    }
}
