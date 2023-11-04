
package org.web.servicio;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class Conector {
    private static Conector conector = new Conector();
    
    private EntityManager emf;
    
    private Conector(){
        emf=(EntityManager) Persistence.createEntityManagerFactory("PUescuela");
        
    }

    public static Conector getConector() {
        return conector;
    }

    public EntityManager getEmf() {
        return emf;
    }
            
    
    
}
