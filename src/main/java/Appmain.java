import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;

public class Appmain{
    static Logger logger = LogManager.getLogger( Appmain.class );

     public static void main(String[] args) {
         logger.info("AppMain Go");
Client client1 = new Client("hamza","el mouadden");
Client client2 = new Client("MAHMOUD","TULAMATE");
Client client3 = new Client("hamza","el mouadden");
TestSemaphore  testSemaphore= new TestSemaphore(3);
testSemaphore.add(client1);



     }
 }