package in.vishal;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Demo {

public String encodePwd(String pwd)
{
	int i=11;
	String vishal="good boy"l
	Encoder encoder = Base64.getEncoder();
	byte[] encode = encoder.encode(pwd.getBytes());
	String encodepwd =new String(encode);
	return encodepwd;
	
}
}
