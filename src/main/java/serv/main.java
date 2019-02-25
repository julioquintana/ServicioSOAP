package serv;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
 

public class main {
 
    /**
     * Publica y consume el servicio SOAP.
     * @param args
     */
    public static void main(String[] args) {
        publishWebService();
        
        
        consumeWebService();
    }
    
    /**
     * M&eacute;todo que publica el servicio web SOAP.
     */
    private static void publishWebService() {
        Endpoint.publish("http://localhost:8083/TestService", new TestServiceImpl());
         
        System.out.println("El Servicio esta en Linea.");
    }
    
    
    private static void consumeWebService() {
        try {
        
            //URL url = new URL("http://localhost:8083/TestService?wsdl");
            URL url = new URL("http://localhost:8083/TestService?wsdl");
            QName qname = new QName("http://serv/",
                "TestServiceImplService");
             
            Service service = Service.create(url, qname);
             
            TestService ServSoap = service.getPort(TestService.class);
             
            System.out.println(ServSoap.getMessage());
            
            double aa = 10;
            double bb = 35;
            
            System.out.println("el resultado es: " + ServSoap.multiplica(aa,bb) );
            
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}