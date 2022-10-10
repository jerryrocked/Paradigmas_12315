#pragma once
#include <iostream>
#include "formas.h"


using namespace std;

class Cuadrado : public Forma {
  protected:
    int lado;
    int tipo;
  public:
    Cuadrado();
    ~Cuadrado();
    Cuadrado(int lado, string nombre, string color, int x, int y, int tipo );
    double calcularPerimetro();
    double calcularArea();
    /* int getLado(); */
    int getLadoMenor();
    int getLadoMayor();
};
