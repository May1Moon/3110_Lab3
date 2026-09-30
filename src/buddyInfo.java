public class buddyInfo {



    private String name;
    private int  phoneNumber;
    private String address;

    //default constructor
    public buddyInfo(){
        name = "unknown";
        phoneNumber = 0;
        address = "unknown";
    }

    // constructer
    public buddyInfo(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }



    public static void main(String[] args) {

        System.out.println("Hello world");
        buddyInfo friend = new buddyInfo("homer",10,"home");
        System.out.println("Hello " + friend.getName());

    }
}
