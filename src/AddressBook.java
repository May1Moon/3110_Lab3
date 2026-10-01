import java.util.ArrayList;

public class AddressBook {

    private ArrayList<buddyInfo> buds;

    public AddressBook(){
        buds = new ArrayList<>();
    }

    public void addBuddy(buddyInfo bud){
        buds.add(bud);
    }
    public void removeBuddy(buddyInfo bud){
        buds.remove(bud);

    }
    public static void main(String[] args){
        System.out.println("Address Book");
        buddyInfo buddy = new buddyInfo("tom",613,"carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

        /////

    }
}
