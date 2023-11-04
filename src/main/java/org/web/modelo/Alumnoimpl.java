
package org.web.modelo;

import javax.persistence.EntityManager;
import org.web.entidad.Alumno;
import org.web.interfaces.iEscuela;

import org.web.servicio.Conector;


public class Alumnoimpl implements iEscuela {
    
   public EntityManager entityManager() {
    return (EntityManager) Conector.getConector().getEmf().getEntityManagerFactory();
}

EntityManager em = entityManager();
    @Override
    public void Registrar(Alumno alum) {
        try {
            em.getTransaction().begin();
            em.persist(alum);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
       
    }
    
}
