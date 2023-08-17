package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
        TypedQuery<Department> query = entityManager.createQuery("SELECT e FROM Department e ", Department.class);
        List<Department> list = query.getResultList();
        list.forEach(department -> department.getEmployee().forEach(employee -> System.out.println(employee.getEmployeeName())));
    }
}
