package ssau.esa.beans;

import ssau.esa.entity.Student;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class StudentBean {

    @PersistenceContext(unitName = "esa")
    private EntityManager em;

    public Collection<Student> findAll(){
        return em.createQuery("SELECT s from Student s", Student.class).getResultList();
    }
}
