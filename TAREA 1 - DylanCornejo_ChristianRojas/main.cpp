#include "pruebatarea1.h"
#include <sstream>

int main(){
	Rectangulo r(400, 300, ROJO, "Rectangulo", 260, 100);
	Circulo c(500, 500, ROJO, "Circulo", 50);
	Cuadrado q(100, 100, ROJO, "Cuadrado", 100);
	vredimensiona(800, 600); // INICIALIZAR EL TAMAÑO DE LA PANTALLA
	q.imprimir();
	c.imprimirCirculo();
	return 0;
}


