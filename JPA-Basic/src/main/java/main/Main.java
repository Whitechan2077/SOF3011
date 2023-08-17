package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Users;
import utils.JPAUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtils.getEntityManager();
        //TẠO THAM SỐ
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u WHERE u.idSinhVien =:id", Users.class);
        //TRUYỀN THAM SỐ
        query.setParameter("id",5);
        List<Users> list =  query.getResultList();
        for (Users x:list
             ) {
            System.out.println(x.getUsername());
        }
        query.setFirstResult(10);//index record;
        query.setMaxResults(2);//max record
        //CÁC THAO TÁC CRUD
        try {
            entityManager.getTransaction().begin();
            //mở transaction
            entityManager.persist("obj");
            //update
            entityManager.merge("obj");
            //delete
            entityManager.remove("obj");
            entityManager.getTransaction().commit();
            //Commit lên db
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            throw new RuntimeException();
        }
        // thằng hibernate nó tự thông minh để có thể tự nhận  biết đối tượng trong db

    }
}
