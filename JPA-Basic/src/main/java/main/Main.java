package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Users;
import utils.JPAUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtils.getEntityManager();
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u", Users.class);
        List<Users> list =  query.getResultList();
        for (Users x:list
             ) {
            System.out.println(x.getUsername());
        }
    }
}
