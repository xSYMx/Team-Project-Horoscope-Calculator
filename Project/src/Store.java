public class Store {
    public Userinput[] users;
    public int totalUsers = 0;

    public Store(int newUser) {
        this.users = new Userinput[newUser];
    }

    private boolean isFull() {
        return totalUsers == users.length;
    }

    private boolean isEmpty() {
        return totalUsers == 0;
    }

    public boolean add(Userinput user) {
        if (isFull())
            return false;
        else
            users[totalUsers] = user;
        totalUsers++;
        return true;

    }// End of add

    public String listUsers() {
        if (isEmpty()) {
            return "No user saved";
        } else {
            String listOfUsers = "";
            for (int i = 0; i < totalUsers; i++)
                listOfUsers += i + ":" + users[i];
            return listOfUsers;
        }

    }//End of listusers

}