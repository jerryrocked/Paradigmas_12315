#pragma once
#include "rectangulo.h"
#include "formas.h"
#include "cuadrado.h"
//#include "elipse.h"
#include <iostream>

class Figuras {
  protected:
    Forma **arreglo;
    int cant;
  public:
    Figuras();
    ~Figuras();
  int getCant();
  Forma *getElemento(int pos);
  void insertarFinal(string nombre, string color, int x, int y, int ladoMenor,int ladoMayor,int tipo);
  void ordernarArreglo();
};
