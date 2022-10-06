#pragma once
#include <iostream>
#include "formas.h"


using namespace std;

class Rectangulo : public Forma {
  protected:
    int ladoMenor, ladoMayor;
  public:
    Rectangulo();
    ~Rectangulo();
    Rectangulo(int ladoMenor, int ladoMayor, string nombre, string color, int x, int y );
    double calcularPerimetro();
    double calcularArea();
    void dibujar();
    int getLadoMenor();
    int getLadoMayor();
};
