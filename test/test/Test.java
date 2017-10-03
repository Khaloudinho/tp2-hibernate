package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import metier.Adresse;
import metier.Buveur;
import metier.Producteur;
import metier.Vin;
import metier.VinDeGarde;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vin unVin;
        Producteur unProd;
        Buveur unBuv;
        Adresse uneAd;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp2-hibernatePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        unVin = new VinDeGarde("Le Gouleyant",1996,120, 12.3f, 1995, 2000);
        uneAd = new Adresse("Blandan","15bis","54000");
        em.persist(uneAd);
        unProd = new Producteur(uneAd,"Dubonnet");
        em.persist(unProd);
        unVin.setLeProducteur(unProd);
        unBuv = new Buveur("Halin","Gilles");
        em.persist(unBuv);
        unBuv.getVins().add(unVin);
        em.persist(unVin);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
