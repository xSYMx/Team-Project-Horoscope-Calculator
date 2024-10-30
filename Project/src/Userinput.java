
public class Userinput {
    private String Name = "No name";
    private int birthMonth = 0;
    private int birthDate = 0;
    private boolean inCurrentUser = false;
    //default setting of User



    public Userinput(String Name, int birthMonth, int birthDate, boolean inCurrentUser){
        this.Name = Name;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.inCurrentUser = inCurrentUser;
    }


    public String getName() {
        return Name;
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


    public String toString()
    {
        return "Your name is:" + Name
                +", birthMonth:" + birthMonth
                +", birthDate:" + birthDate
                +", in the current User；" + inCurrentUser;
    }
} // End of class
