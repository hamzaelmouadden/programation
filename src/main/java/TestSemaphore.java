import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.concurrent.Semaphore;

public class TestSemaphore {
    static Logger logger = LogManager.getLogger(TestSemaphore.class );
    private Collection<Client> collection ;
    private Semaphore semaphore ;
    private Agence agence;
    public TestSemaphore(int Max){
        this.collection=agence.getClients();
        this.semaphore= new Semaphore(Max);

    }
    public  boolean add(Client t)   {

try {   // ajout d'un objet, demande d'une autorisation auprès du sémaphore
    // cette méthode est bloquante, s'il n'y a pas d'autorisation disponible
    // on attend...

    semaphore.acquire() ;
    collection.add(t) ;

    return true ;

}


catch (InterruptedException e) {
    e.printStackTrace();
    logger.info("ERREUR DE CREATION D UN CLIENT");
    return false;
}


    }

    public  boolean remove(Client o)  {
        // on commence par vérifier que l'objet passé est
        // bien retiré de la collection
        boolean removed = collection.remove(o) ;
        if (removed) {
            // dans ce cas on rend une autorisation au sémaphore
            semaphore.release() ;
        }

        return removed ;
    }



}
