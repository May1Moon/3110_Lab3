import java.util.ArrayList;

public class AddressBook {

    private ArrayList<buddyInfo> buds;

    public void addBuddy(buddyInfo bud){
        buds.add(bud);
    }
    public void removeBuddy(buddyInfo bud){
        buds.remove(bud);

    }
    public static void main(String[] args){
        System.out.println("Address Book");

    }
}
