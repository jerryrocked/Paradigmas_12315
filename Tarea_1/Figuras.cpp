#pragma once
#include "Figuras.h"
#include <iostream>

Figuras::Figuras(){
  cant=0;
  arreglo = new Forma *[cant];
}
Figuras::~Figuras() {
  if(arreglo != NULL)
    delete[]arreglo;
}

int Figuras::getCant(){return cant;}

Forma * Figuras::getElemento(int pos) {
  if(pos < cant) {
    return arreglo[pos];
  }
};


void Figuras::insertarFinal(string nombre, string color, int x, int y, int ladoMenor,int ladoMayor,int tipo) {
  Forma *nuevo;
  if(tipo == 1) {
    nuevo = new Rectangulo(ladoMenor, ladoMayor, nombre, color, x, y, tipo);
  } else if(tipo == 2) {
    nuevo = new Cuadrado(ladoMayor, nombre, color, x, y, tipo);
  } else if (tipo == 3) {
    nuevo = new Elipse(ladoMenor,ladoMayor, nombre, color, x, y, tipo);
  } else if (tipo == 4) {
    nuevo = new Circulo(ladoMenor,nombre,color,x,y,tipo);
  } else {

  }
  Forma **aux = new Forma*[cant + 1];
  for(int i=0;i<cant;i++) {
    aux[i] = arreglo[i];
  }
  aux[cant] = nuevo;
  cant++;
  if(arreglo != NULL) {
    delete[]arreglo;
  }
  arreglo = aux;
}
void Figuras::ordernarArreglo() {
  Forma *aux;
  for(int i = 0; i<cant-1; i++ ) {
    for(int j=i+1; j<cant; j++) {
      aux = arreglo[i];
      arreglo[i] = arreglo[j];
      arreglo[j] = aux;
    }
  }
}
