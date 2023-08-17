package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
//Cấu hình class utils Jpa
public class JPAUtils {
    private static EntityManagerFactory entityManagerFactory;
    public static EntityManager getEntityManager(){
        if (entityManagerFactory == null || !entityManagerFactory.isOpen()){
            entityManagerFactory = Persistence.createEntityManagerFactory("FPL");
        }
        return  entityManagerFactory.createEntityManager();
    }
    public static void shutDown(){
        if (entityManagerFactory != null || !entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
        entityManagerFactory = null;
    }
}
