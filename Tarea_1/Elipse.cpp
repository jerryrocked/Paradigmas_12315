#include "elipse.h"


Elipse::Elipse(){};
Elipse::~Elipse(){};

Elipse::Elipse(int radioMenor,int radioMayor, string nombre, string color, int x, int y ):Forma(nombre, color, x, y){
  this->radioMenor= radioMenor;
  this->radioMayor= radioMayor;
}
//pi = 3.141592
double Elipse::calcularArea(){return (3.141592*(radioMenor*radioMayor));};
double Elipse::calcularPerimetro(){return 0;};
