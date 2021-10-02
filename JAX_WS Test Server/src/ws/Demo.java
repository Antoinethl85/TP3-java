package ws;

import javax.jws.*;

@WebService
public interface Demo {
	
	@WebMethod
	public String welcome();
	
	@WebMethod
	public String Tp(String fullname);
}
