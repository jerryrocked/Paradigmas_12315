#include "elipse.h"

Elipse::Elipse(){};
Elipse::~Elipse(){};

Elipse::Elipse(int radioMenor,int radioMayor, string nombre, string color, int x, int y, int tipo ):Forma(nombre, color, x, y, tipo){
  this->radioMenor= radioMenor;
  this->radioMayor= radioMayor;
}

int Elipse::getLadoMenor(){return radioMenor;};
int Elipse::getLadoMayor(){return radioMayor;};

//pi = 3.141592
double Elipse::calcularArea(){return (3.141592*(radioMenor*radioMayor));};
double Elipse::calcularPerimetro(){return 0;};
