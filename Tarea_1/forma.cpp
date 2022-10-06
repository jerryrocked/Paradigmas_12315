#include "formas.h"

Forma::Forma(){}
Forma::~Forma(){}

Forma::Forma(string nombre, string color, int x, int y) {
  this->nombre = nombre;
  this->color = color ;
  this-> x = x ;
  this->y = y ;
}

string Forma::getNombre(){return nombre;};
string Forma::getColor(){return color;};
int Forma::getX(){return x;};
int Forma::getY(){return y;};
