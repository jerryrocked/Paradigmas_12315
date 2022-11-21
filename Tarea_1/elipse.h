#pragma once
#include <iostream>
#include "formas.h"

using namespace std;

class Elipse : public Forma {
  protected:
    int radioMenor, radioMayor;
    int tipo;
  public:
    Elipse();
    ~Elipse();
    Elipse(int radioMenor, int radioMayor, string nombre, string color, int x, int y, int tipo);
    int getLadoMenor();
    int getLadoMayor();
    double calcularArea();
    double calcularPerimetro();
};
