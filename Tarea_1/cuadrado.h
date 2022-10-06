#pragma once
#include <iostream>
#include "formas.h"


using namespace std;

class Cuadrado : public Forma {
  protected:
    int lado;
  public:
    Cuadrado();
    ~Cuadrado();
    Cuadrado(int lado, string nombre, string color, int x, int y );
    double calcularPerimetro();
    double calcularArea();
    void dibujar();
};
