import java.util.ArrayList;

public class Store {
    public ArrayList<Userinput> users;

    public Store() {
        this.users = new ArrayList<>();
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }

    public boolean add(Userinput user) {
        users.add(user);
        return true;
    }

    public String listUsers() {
        if (isEmpty()) {
            return "No user saved";
        } else {
            StringBuilder listOfUsers = new StringBuilder();
            for (int i = 0; i < users.size(); i++)
                listOfUsers.append(i).append(":").append(users.get(i)).append("\n");
            return listOfUsers.toString();
        }
    }

    public Userinput getUser(int choice) {
        if (choice >= 0 && choice < users.size()) {
            return users.get(choice);
        }
        return null;
    }

    public void setUser(int choice, Userinput user) {
        if (choice >= 0 && choice < users.size()) {
            users.set(choice, user);
        }
    }

    public void removeUser(int choice) {
        if (choice >= 0 && choice < users.size()) {
            users.remove(choice);
        }
    }
}