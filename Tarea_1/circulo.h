#pragma once
#include <iostream>
#include "elipse.h"

using namespace std;

class Circulo : public Elipse {
  protected:
    int radio;
    int tipo;
  public:
    Circulo();
    ~Circulo();
    Circulo(int radio, string nombre, string color, int x, int y, int tipo);
    int getLadoMenor();
    int getLadoMayor();
    double calcularArea();
    double calcularPerimetro();
};

