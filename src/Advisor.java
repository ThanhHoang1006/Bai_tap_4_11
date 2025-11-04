public class Advisor extends Person {
    private final String organization;

    public Advisor(String fullName, String email, String organization) {
        super(fullName, email);
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        return "Advisor: " + fullName + " - Organization: " + organization + " - Email: " + email;
    }
}
