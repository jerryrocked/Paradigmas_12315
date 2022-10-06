#include "forma.h"
#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<Forma*> formas;
  formas.push_back(new Forma("Forma", "Verde", 5, 6));
  formas.push_back(new Rectangulo("Rectangulo", "Azul", 3, 5, 20, 10));
  formas.push_back(new Cuadrado("Cuadrado", "Rojo", 1, 2, 5, 0));
  formas.push_back(new Elipse("Elipse", "Naranja", 4, 1, 6, 7));
  formas.push_back(new Circulo("Circulo", "Amarillo", 2, 3, 14, 0));

  for(int i=0; i<5; i++)
    formas.at(i)->color_igual();

  for(int i=0; i<5; i++)
    formas.at(i)->imprimir();
}
