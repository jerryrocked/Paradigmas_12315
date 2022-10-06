#pragma once
#include <iostream>
using namespace std;



class Forma{
    protected :
      string color;
      string nombre;
      int x,y;

    public:
      Forma();
      ~Forma();
      Forma(string nombre, string color,int x, int y);
      string getNombre();
      string getColor();
      int getX();
      int getY();
      virtual double calcularArea() = 0;
      virtual double calcularPerimetro() = 0;
      virtual void dibujar()= 0;

};
