package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos () {
		return asientos.length;
	}
	
	String verificarIntegridad () {
		boolean original = false;
		if (this.registro == this.motor.registro) {
			original = true;
			int c = this.asientos.length;
			for (int i = 0; i < c; i++) {
				if (this.asientos[i].registro != this.registro) {
					original = false;
				}
			}
		}
		if (original == true)
			return "Auto original";
		else
			return "Las piezas no son originales";
	}
}
