package in.vishal;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Demo {

public String encodePwd(String pwd)
{
String vishal="abhi is a good b";
	Encoder encoder = Base64.getEncoder();
	byte[] encode = encoder.encode(pwd.getBytes());
	String encodepwd =new String(encode);
	return encodepwd;
	
}
}
