package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager em;


    public StudentDAOImpl(EntityManager emf) {
        this.em = emf;
    }

    @Transactional
    @Override
    public void save(Student student) {
        em.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return em.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = em.createQuery("from Student order by lastname desc", Student.class);
        List<Student> students = theQuery.getResultList();
        return students;

    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> student = em.createQuery("from Student where lastname = :lastname", Student.class);
        student.setParameter("lastname", lastName);
        return student.getResultList();
    }

    @Transactional
    @Override
    public void UpdateName(Student student) {
        em.merge(student);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Student student = em.find(Student.class, id);
        em.remove(student);
    }

    @Transactional
    @Override
    public int deleteAll(){
        int number =0;
        TypedQuery<Student> student = em.createQuery("from Student", Student.class);
        List<Student> students = student.getResultList();
        for (Student s: students){
            number++;
            em.remove(s);
        }
        return number;
    }
}
