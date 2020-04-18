package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

    private EntityManagerFactory factory;

    public EntityManagerFactory getFactory() {
        EntityManager em = factory.createEntityManager();
        return em;
    }
    //instantiem cu fisierul de configurare
    //cream entity manager
    public EntityManagerFactory createFactory() {
        factory = Persistence.createEntityManagerFactory("MusciAlbumsPU");
        return factory;
    }

    public void closeFactory(){
        factory.close();
    }
}