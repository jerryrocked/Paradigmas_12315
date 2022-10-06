#include "cuadrado.h"
#include "graphics.h"
Cuadrado::Cuadrado(){};
Cuadrado::~Cuadrado(){};

Cuadrado::Cuadrado(int lado, string nombre, string color, int x, int y ):Forma(nombre, color, x, y){
  this->lado = lado;
}

double Cuadrado::calcularPerimetro(){return (4*lado);};
double Cuadrado::calcularArea(){return (lado*lado);};

void Cuadrado::dibujar(){


  rectangle(x,y, lado, lado);



}
