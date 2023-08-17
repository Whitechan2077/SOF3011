package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FPL");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u", Users.class);
        List<Users> usersList = query.getResultList();
        usersList.forEach(users -> System.out.println(users.getSinhVienByIdSinhVien().getTenSinhVien()+":"+users.getUsername()));
    }
}
