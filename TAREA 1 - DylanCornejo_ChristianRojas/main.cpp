#include "pruebatarea1.h"

int main(){
	// Inicializacion de los objetos y objetos de clases derivadas
	Rectangulo r(400, 300, 5, "Rectangulo", 240, 100);
	Circulo c(500, 500, AMARILLO, "Circulo", 50);
	Cuadrado q(100, 100, ROJO, "Cuadrado", 100);
	Elipse e(400, 300, VERDE, "Elipse", 150, 100);
	vredimensiona(800, 600); // INICIALIZAR EL TAMAÑO DE LA PANTALLA
	r.imprimir();
	r.cambiarTamano(2);
	q.imprimir();
	c.imprimir();
	e.imprimir();
	
	return 0;
}


