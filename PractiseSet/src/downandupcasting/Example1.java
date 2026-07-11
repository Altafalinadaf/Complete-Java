package downandupcasting;

import java.util.ArrayList;
import java.util.List;

class InstagramUser {
    void viewReels() {
        System.out.println("Viewing Reels");
    }
}

class CreatorAccount extends InstagramUser {
    void viewInsights() {
        System.out.println("Viewing Post Insights");
    }
}


public class Example1 {
    public static void main(String[] args) {

        // Upcasting
        InstagramUser user = new CreatorAccount();

        user.viewReels();

        // user.viewInsights(); // Error

        // Downcasting
        CreatorAccount creator = (CreatorAccount) user;
        creator.viewInsights();
        creator.viewReels();
        
    }
}