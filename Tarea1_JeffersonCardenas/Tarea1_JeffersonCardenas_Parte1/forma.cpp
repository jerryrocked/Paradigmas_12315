#include "forma.h"
#include <iostream>
using namespace std;

void Forma::imprimir(){
  cout << "La figura es: " << nombre << endl;
  cout << "Color: " << color << endl;
  cout << "Centro: " << "x=" << x << " y=" << y << endl;
}

void Forma::cambiar_col(){
  cout << "A que color quiere cambiar " << nombre << "?: ";
  getline(cin, color);  cout << endl;
}

void Forma::color_igual(){
  color = "Purpura";
}

void Forma::mover(){
  cout << "Ingrese el valor x de " << nombre <<": ";
  cin >> x;
  cin.ignore();
  cout << "Ingrese el valor y de " << nombre << ": ";
  cin >> y;
  cin.ignore();
  cout << endl;
}

void Rectangulo::area_rec(){
  area = ladoMin*ladoMaj;
  cout << "Area del rectangulo: " << area << endl;
}

void Rectangulo::perim_rec(){
  perim = (2*ladoMin) + (2*ladoMaj);
  cout << "Perimetro del rectangulo: " << perim << endl;
}

void Rectangulo::print_rec(){
  imprimir();
  cout << "Lado Mayor: " << ladoMaj << endl;
  cout << "Lado Menor: " << ladoMin << endl;
}

void Rectangulo::cambiar_tam(int t){
  ladoMin = ladoMin * t;
  ladoMaj = ladoMaj * t;
}

void Elipse::area_elip(){
  area = 3.14 * (Rmaj * Rmin);
  cout << "Area de la elipse: " << area << endl;
}

void Elipse::print_elip(){
  imprimir();
  cout << "Radio Mayor: " << Rmaj << endl;
  cout << "Radio Menor: " << Rmin << endl;
}

void Cuadrado::area_cuad(){
  area = lado*lado;
  cout << "Area del cuadrado: " << area << endl;
}

void Cuadrado::perim_cuad(){
  perim = lado*4;
  cout << "Perimetro del cuadrado: " << perim << endl;
}

void Cuadrado::print_cuad(){
  imprimir();
  cout << "Longitud de los lados: " << lado << endl;
}

void Circulo::area_circ(){
  area = 3.14 * (radio*radio);
  cout << "Area del circulo: " << area << endl;
}

void Circulo::perim_circ(){
  perim = (3.14) * radio * 2;
  cout << "Perimetro del circulo: " << perim << endl;
}

void Circulo::print_circ(){
  imprimir();
  cout << "Radio del circulo: " << radio << endl;
}
