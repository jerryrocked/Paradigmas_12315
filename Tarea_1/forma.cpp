#include "formas.h"

Forma::Forma(){}
Forma::~Forma(){}

Forma::Forma(string nombre, string color, int x, int y, int tipo) {
  this->nombre = nombre;
  this->color = color ;
  this-> x = x ;
  this->y = y ;
  this->tipo = tipo;
  this->lado1 = lado1;
  this->lado2 = lado2;
}

string Forma::getNombre(){return nombre;};
string Forma::getColor(){return color;};
int Forma::getX(){return x;};
int Forma::getY(){return y;};
int Forma::getTipo(){return tipo;}
