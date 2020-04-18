package repo;

import entity.AlbumsEntity;
import util.PersistenceUtil;

import javax.persistence.EntityManager;

public class AlbumRepository {

    public void create(AlbumsEntity entity){
        // Primeste entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        em.close();
    }

    public AlbumsEntity findById(int id){
        // Primeste  entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        AlbumsEntity albumsEntity = em.find(AlbumsEntity.class,id);
        em.getTransaction().commit();
        em.close();
    }

    public AlbumsEntity findByName(String name){
        // Primeste entity manager
        EntityManager em = PersistenceUtil.createFactory().getFactory();
        em.getTransaction().begin();
        // aici nu am inteles cum sa scriu interogarea sau daca sa o scriu aici sau nu
        AlbumsEntity albumsEntity = em.createNamedQuery("select from AlbumsEntity where name like name")
        em.close();


    }
}
