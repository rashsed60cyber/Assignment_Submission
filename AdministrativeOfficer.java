class AdministrativeOfficer extends Employee {
    private String officeSection;

    public AdministrativeOfficer(int memberId,
                                 String name,
                                 double salary,
                                 String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void manageOffice() {
        System.out.println(name +
                " manages the " +
                officeSection +
                " office.");
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " handles administrative tasks in " +
                officeSection + ".");
    }
}
