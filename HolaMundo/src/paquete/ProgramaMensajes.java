package paquete;

public class ProgramaMensajes {

	public static void main(String[] args) {
		Mensaje m = new Mensaje();
		m.setEmisor("Pepito");
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {	
				System.out.println(m);
			}
		}
	}
}
