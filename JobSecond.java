import java.io.InputStream;

public class JobSecond {

	public static void main(String[] args) {
	  try {
		System.out.println("TC-11 Triggered...");
		System.out.println("TC-12Triggered...");
		System.out.println("TC-14 Triggered...");
		System.out.println("TC-17 Triggered...");
		System.out.println("TC-13 Triggered...");
		System.out.println("TC-19 Triggered...");
		
		Process proc = Runtime.getRuntime().exec("java -jar HeadlessAutomationJar.jar");
		proc.waitFor();
		// Then retreive the process output
		InputStream in = proc.getInputStream();
		InputStream err = proc.getErrorStream();

		byte b[]=new byte[in.available()];
		in.read(b,0,b.length);
		System.out.println(new String(b));

		byte c[]=new byte[err.available()];
		err.read(c,0,c.length);
		System.out.println(new String(c));
	  } catch (Exception e ) {
		e.printStackTrace();
	  }		
	}

}
