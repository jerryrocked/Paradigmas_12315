#include "cuadrado.h"

Cuadrado::Cuadrado(){};
Cuadrado::~Cuadrado(){};

Cuadrado::Cuadrado(int lado, string nombre, string color, int x, int y, int tipo ):Forma(nombre, color, x, y, tipo){
  this->lado = lado;
}

int Cuadrado::getLadoMayor(){return lado;};
int Cuadrado::getLadoMenor(){return lado;};


double Cuadrado::calcularPerimetro(){return (4*lado);};
double Cuadrado::calcularArea(){return (lado*lado);};
