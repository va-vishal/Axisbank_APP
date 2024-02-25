package in.vishal;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Demo {

public String encodePwd(String pwd)
{
<<<<<<< HEAD
String vishal="abhi is a good b";
=======
	int i=11;
	String vishal="good boy"l
>>>>>>> f0bd3934560dbd456df6f35705d784a9f4319ee0
	Encoder encoder = Base64.getEncoder();
	byte[] encode = encoder.encode(pwd.getBytes());
	String encodepwd =new String(encode);
	return encodepwd;
	
}
}
