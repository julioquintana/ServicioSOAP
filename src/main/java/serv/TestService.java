package serv;

import javax.jws.WebService;
 

@WebService
public interface TestService {
  
    /**
     * M&eacute;todo que retorna un String.
     * @return
     */
    String getMessage();
    
    double multiplica(double a, double b);
}