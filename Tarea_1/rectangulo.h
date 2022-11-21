#pragma once
#include <iostream>
#include "formas.h"

using namespace std;

class Rectangulo : public Forma {
  protected:
    int ladoMenor, ladoMayor;
    int tipo;
  public:
    Rectangulo();
    ~Rectangulo();
    Rectangulo(int ladoMenor, int ladoMayor, string nombre, string color, int x, int y , int tipo);
    double calcularPerimetro();
    double calcularArea();
    int getLadoMenor();
    int getLadoMayor();
};

