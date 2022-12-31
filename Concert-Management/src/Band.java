import java.util.ArrayList;

public class Band {
    // Data Fields
    private String name;
    private ArrayList<String> members = new ArrayList<>();

    // Constructor
    public Band() {
        name = "";
    }
    public Band(String name) {
        this.name = name;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    // Methods
    public void addMember(String name){
        members.add(name.toLowerCase());
    }
}
