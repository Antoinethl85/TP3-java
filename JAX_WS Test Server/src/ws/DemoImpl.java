package ws;

import javax.jws.*;

@WebService(endpointInterface = "ws.Demo")
public class DemoImpl implements Demo{

	@Override
	public String welcome() {
		return "Welcome to TP 3";
	}

	@Override
	public String Tp(String fullname) {
		return "This TP was made by" + fullname;
	}

}
