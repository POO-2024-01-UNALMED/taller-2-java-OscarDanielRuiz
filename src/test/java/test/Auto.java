package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos = new Asiento[10];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos () {
		int cantidad = 0;
		int i = 0;
		while (i < this.asientos.length) {
			if (this.asientos[i] != null)
				cantidad++;
			i++;
		}
		return cantidad;
	}
	
	String verificarIntegridad () {
		boolean original = false;
		if (this.registro == this.motor.registro) {
			original = true;
			int i = 0;
			while (i < this.asientos.length) {
				if (this.asientos[i].registro != this.registro) {
					original = false;
				}
				i++;
			}
		}
		if (original == true)
			return "Auto original";
		else
			return "Las piezas no son originales";
	}
}
