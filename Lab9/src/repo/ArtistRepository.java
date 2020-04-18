package repo;

import entity.AlbumsEntity;
import entity.ArtistsEntity;
import util.PersistenceUtil;

import javax.persistence.EntityManager;

public class ArtistRepository {

    public void create(ArtistsEntity entity){
        // Primeste entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        em.close();
    }

    public ArtistsEntity findById(int id){
        // Primeste entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        ArtistsEntity artistsEntity = em.find(ArtistsEntity.class,id);
        em.getTransaction().commit();
        em.close();
    }

    public ArtistsEntity findByName(String name){
        // Primeste entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        // la fel ca la album
       /* ArtistsEntity artistsEntity = em.createNamedQuery("select from ArtistsEntity where name like name");
        */
        em.close();


    }

}
