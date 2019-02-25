package serv;

import javax.jws.WebService;
 

@WebService(endpointInterface = "serv.TestService")
public class TestServiceImpl implements TestService {
 
    public String getMessage() {
        return "Test Message";
    }

	public double multiplica(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
    
}