package Testng_scenario;

import org.apache.commons.codec.binary.Base64;

public class Password_encode_decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="admin123";
         byte[] encodestring = Base64.encodeBase64(str.getBytes());
         System.out.println("encoded string is:"+ new String(encodestring));
         
        byte[] decodestring = Base64.decodeBase64(encodestring);
        System.out.println("decoded string is:"+ new String(decodestring));
	}
	

}
