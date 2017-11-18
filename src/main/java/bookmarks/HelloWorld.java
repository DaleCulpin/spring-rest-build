package bookmarks;

import javax.persistence.EntityManager;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(EntityManager.class.getProtectionDomain().getCodeSource().getLocation());
    }

}
