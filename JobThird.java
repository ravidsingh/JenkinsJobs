import java.io.InputStream;

public class JobThird {

	public static void main(String[] args) {
	  try {
		System.out.println("IQE-T4 Triggered...");
		System.out.println("IQE-T2 Triggered...");
		System.out.println("IQE-T1 Triggered...");
		
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
