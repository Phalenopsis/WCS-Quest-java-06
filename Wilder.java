public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        StringBuilder sentence = new StringBuilder("je m'appelle " + this.firstname + " et ");
        if (this.aware) sentence.append("je suis aware");
        else sentence.append("je ne suis pas aware");

        return sentence.toString();
    }
}
