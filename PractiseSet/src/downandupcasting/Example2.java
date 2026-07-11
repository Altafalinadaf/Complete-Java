package downandupcasting;


import java.util.ArrayList;

class InstagramUser2 {

    void login() {
        System.out.println("User logged into Instagram");
    }
}

class CreatorAccount2 extends InstagramUser2 {

    void viewInsights() {
        System.out.println("Viewing Insights");
    }
}

class BusinessAccount2 extends InstagramUser2 {

    void runAds() {
        System.out.println("Running Ads");
    }
}

interface a{
	void run();
}

interface b{
	void run();
}

class c implements a,b{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Example2 {

    public static void main(String[] args) {

        // Upcasting
        InstagramUser2 user1 = new CreatorAccount2();
        InstagramUser2 user2 = new BusinessAccount2();
       

        ArrayList<InstagramUser2> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
     

        System.out.println("=== All Users Login ===");

        for (InstagramUser2 user : users) {
            user.login();
        }

        // Downcasting
        System.out.println("\n=== Creator Features ===");

        CreatorAccount2 creator = (CreatorAccount2) user1;
        creator.viewInsights();

        System.out.println("\n=== Business Features ===");

        BusinessAccount2 business = (BusinessAccount2) user2;
        business.runAds();
    }
}