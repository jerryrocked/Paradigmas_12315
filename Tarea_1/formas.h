#pragma once
#include <iostream>
using namespace std;

class Forma{
    protected :
      string color;
      string nombre;
      int x,y;
      int tipo;
      int lado1,lado2;

    public:
      Forma();
      ~Forma();
      Forma(string nombre, string color,int x, int y, int tipo);
      string getNombre();
      string getColor();
      int getX();
      int getY();
      int getTipo();
      virtual int getLadoMenor() = 0;
      virtual int getLadoMayor() = 0;
      virtual double calcularArea() = 0;
      virtual double calcularPerimetro() = 0;

};
