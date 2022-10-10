#include "circulo.h"

Circulo::Circulo(){};
Circulo::~Circulo(){};

Circulo::Circulo(int radio, string nombre, string color, int x, int y, int tipo ):Elipse(radioMenor,radioMayor,nombre,color,x, y,tipo){
  this->radio = radio;
}

int Circulo::getLadoMayor(){return 0;};
int Circulo::getLadoMenor(){return radio;};

double Circulo::calcularPerimetro(){return (2*3.1415*radio);};
double Circulo::calcularArea(){return (3.1415*radio*radio);};

