#include <iostream>
#include "graphics.h"
#include "miniwin.h"
#include "pruebatarea1.h"

Forma::Forma(int x, int y, int color, string nombreForma){
  this->x = x;
  this->y = y;
  this->color = color;
  this->nombreForma = nombreForma;
}

void Forma::imprimirForma(){
  cout << "Centro (X, Y) = ("<<this->x << ", " << this->y << ")"<< endl << "Color: " << this->color << endl << "Nombre de la Forma: " << this->nombreForma << endl;
}

void Forma::obtenerColor(){
}

void Forma::cambiarColor(int color){
  this->color = color;
}

Rectangulo::Rectangulo(int x, int y, int color, string nombreForma, int ladoMayor, int ladoMenor): Forma(x, y, color, nombreForma){
  this->ladoMayor = ladoMayor;
  this->ladoMenor = ladoMenor;
}

void Rectangulo::imprimirRectangulo(){
  this->imprimirForma();
  vredimensiona(800, 600);
  rectangulo_lleno(400 - this->ladoMayor/2 , 300 - this->ladoMenor/2 , 400 + this->ladoMayor/2, 300 + this->ladoMenor/2);
  refresca();
}

float Rectangulo::calcularArea(){
  return (this->ladoMayor * this->ladoMenor);
}

float Rectangulo::calcularPerimetro(){
  return (this->ladoMayor * 2 + this->ladoMenor * 2);
}

void Rectangulo::cambiarTamanoRectangulo(float factorEscala){
  this->ladoMayor = this->ladoMayor * factorEscala;
  this->ladoMenor = this->ladoMenor * factorEscala;
}

Elipse::Elipse(int x, int y, int color, string nombreForma, int radioMayor, int radioMenor) : Forma(x, y, color, nombreForma){
  this->radioMenor = radioMenor;
  this->radioMayor = radioMayor;
}

float Elipse::obtenerAreaElipse(){
  return (3.14 * this->radioMayor * this->radioMenor);
}

void Elipse::imprimirElipse(){
  cout << "elipse" << endl;
}
