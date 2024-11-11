public class Userinput {
    private String name;
    private int birthMonth;
    private int birthDate;
    private boolean inCurrentUser;

    public Userinput(String name, int birthMonth, int birthDate, boolean inCurrentUser) {
        this.name = name;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.inCurrentUser = inCurrentUser;
    }

    public String getName() {
        return name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public boolean isInCurrentUser() {
        return inCurrentUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setInCurrentUser(boolean inCurrentUser) {
        this.inCurrentUser = inCurrentUser;
    }

    @Override
    public String toString() {
        return "Your name is: " + name
                + ", birthMonth: " + birthMonth
                + ", birthDate: " + birthDate
                + ", in the current User: " + inCurrentUser;
    }
}