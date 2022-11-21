#include "rectangulo.h"

Rectangulo::Rectangulo(){};
Rectangulo::~Rectangulo(){};

Rectangulo::Rectangulo(int ladoMenor, int ladoMayor, string nombre, string color, int x, int y, int tipo):Forma(nombre, color, x, y, tipo){
  this->ladoMenor = ladoMenor;
  this->ladoMayor = ladoMayor;
}

int Rectangulo::getLadoMayor(){return ladoMayor;};
int Rectangulo::getLadoMenor(){return ladoMenor;};

double Rectangulo::calcularPerimetro(){return 2*(ladoMayor+ladoMenor);};
double Rectangulo::calcularArea(){return (ladoMayor*ladoMenor);};
