package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        final SportSocialNetworkUserImpl<User> saribri = new SportSocialNetworkUserImpl("Sara", "Briccoli", "saribricka", 22);		
        final SportSocialNetworkUserImpl<User> cichito = new SportSocialNetworkUserImpl("Matteo", "Cicognani", "mattecico", 21);
        final SportSocialNetworkUserImpl<User> loryhm = new SportSocialNetworkUserImpl("Lorenzo", "Briccoli", "lorybricko", 17);
        
        saribri.addSport(Sport.SWIM);
        saribri.addSport(Sport.ENDURO);
        
        System.out.println("Sara likes to swim" + saribri.hasSport(Sport.SWIM));
        System.out.println("Sara likes to play basketball" + saribri.hasSport(Sport.BASKET));
        
        cichito.addSport(Sport.VOLLEY);
        cichito.addSport(Sport.BIKE);
        
        System.out.println("Teo likes to ride a bike" + cichito.hasSport(Sport.BIKE));
        System.out.println("Teo likes to swim" + cichito.hasSport(Sport.SWIM));     
        
        loryhm.addSport(Sport.F1);
        loryhm.addSport(Sport.MOTOCROSS);
        
        System.out.println("Lorenzo likes soccer" + loryhm.hasSport(Sport.SOCCER));
        System.out.println("Lorenzo likes to watch motocross" + loryhm.hasSport(Sport.MOTOCROSS));
        
    }
}
