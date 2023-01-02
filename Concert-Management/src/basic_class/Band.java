package basic_class;

import java.util.ArrayList;

public class Band {
    // Data Fields
    private String name;
    private ArrayList<String> members;

    // Constructor
    public Band() {
        name = "";
        members = new ArrayList<>();
    }
    public Band(String name, ArrayList<String> members) {
        this.name = name;
        this.members = members;
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

    // toString


    @Override
    public String toString() {
        return getName();
    }

    // Methods
    public void addMember(String name){
        members.add(name.toLowerCase());
    }
}
