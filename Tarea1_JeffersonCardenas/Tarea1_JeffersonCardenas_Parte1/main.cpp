#include "forma.h"
#include <iostream>
using namespace std;

int main() {

  //Forma(nombre, color, valor x, valor y)
  Forma F("Forma", "Verde", 5, 6);
  //Rectangulo(nombre, color, valor x, valor y, lado mayor, lado menor)
  Rectangulo R("Rectangulo", "Azul", 5, 6, 20, 10);
  //Cuadrado(nombre, color, valor x, valor y, lado mayor, lado menor)
  Cuadrado C("Cuadrado", "Rojo", 1, 2, 5, 0); //el valor del lado menor no se usa

  //Elipse(nombre, color, valor x, valor y, radio mayor, radio menor)
  Elipse E("Elipse", "Naranja", 4, 1, 6, 7);

  //Circulo(nombre, color, valor x, valor y, radio mayor, radio menor)
  Circulo S("Circulo", "Amarillo", 2, 3, 14, 0); //el valor de radio menor no se usa

  F.mover();
  F.cambiar_col();

  R.mover();
  R.cambiar_col();
  R.cambiar_tam(2);

  F.imprimir();
  cout << "-------------------------------" << endl;
  R.print_rec();
  R.perim_rec();
  R.area_rec();
  cout << "-------------------------------" << endl;
  E.print_elip();
  E.area_elip();
  cout << "-------------------------------" << endl;
  C.print_cuad();
  C.area_cuad();
  C.perim_cuad();
  cout << "-------------------------------" << endl;
  S.print_circ();
  S.area_circ();
  S.perim_circ();

}
