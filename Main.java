import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members =
                new ArrayList<>();

        // Professor Objects
        members.add(
                new Professor(
                        101,
                        "Dr. Ahmed",
                        90000,
                        "CSE",
                        "Artificial Intelligence",
                        45
                )
        );

        members.add(
                new Professor(
                        102,
                        "Dr. Rahman",
                        85000,
                        "EEE",
                        "Renewable Energy",
                        30
                )
        );

        // Additional Employee Subclass
        members.add(
                new AdministrativeOfficer(
                        201,
                        "Mr. Karim",
                        50000,
                        "Registrar Office"
                )
        );

        System.out.println("===== UNIVERSITY PERSONNEL =====");

        // Dynamic Binding
        for (UniversityMember member : members) {

            member.displayBasicInfo();

            // Runtime Polymorphism
            member.performDuty();

            System.out.println("-------------------");
        }

        System.out.println("\n===== PROFESSOR RESEARCH PROFILES =====");

        // Safe Downcasting
        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                System.out.println("Professor: " + p.name);

                p.showResearchProfile();

                System.out.println("-------------------");
            }
        }
    }
}
