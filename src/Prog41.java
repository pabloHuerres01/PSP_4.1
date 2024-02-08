import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Prog41 {
	private InetAddress ip; 
	private Scanner t = new Scanner(System.in);
	
	public Prog41() {
		int opcion;
		do {
			System.out.println("Introduce");
			opcion=Integer.parseInt(t.nextLine());
			switch(opcion) {
				case 1:
					ip();
					break;
				case 2:
					ipExterna();
					break;
				default:
				System.out.println("Error");
			
			}
		}while(opcion!=0);
	}
	public void ip() {
		try {
			ip=InetAddress.getByName("localhost");
			System.out.println("La ip de localhost es "+ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void ipExterna() {
		String url;
		System.out.println("Introduce la url");
		url=t.nextLine();
		try {
			ip=InetAddress.getByName(url);
			System.out.println("La ip de localhost es "+ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		Prog41 ej = new Prog41();

	}

}
