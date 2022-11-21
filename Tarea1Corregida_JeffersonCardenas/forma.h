#include <iostream>
using namespace std;

class Forma {
public:
  string nombre;
  double x, y; //coordenadas x e y

  Forma(string n, double coordx, double coordy){
    nombre = n;
    x = coordx;
    y = coordy;
  }

  void imprimir(); //imprime nombre, color y centro
  void mover(); //cambiar los valores de x e y
  void color_igual(); //función para el bucle que pone a todas las figuras del mismo color
};

class Rectangulo : public Forma{
public:
  double ladoMaj, ladoMin, area, perim;

  Rectangulo(string n, double coordx, double coordy, double lm, double lmin) : Forma(n, coordx, coordy){
    ladoMaj = lm;
    ladoMin = lmin;
  }

  void area_rec(); //calcular area del rectangulo
  void perim_rec(); //calcular perimetro del rectangulo
  void print_rec(); //imprime ademas los lados
  void cambiar_tam(int t); //cambia el tamaño segun un factor de escala
};

class Elipse : public Forma{
public:
  double Rmaj, Rmin, area;

    Elipse(string n, double coordx, double coordy, double rm, double rmin) : Forma(n, coordx, coordy){
    Rmaj = rm;
    Rmin = rmin;
  }

  void area_elip(); //calcular el area de la elipse
  void print_elip(); //imprime ademas los radios
};

class Cuadrado : public Rectangulo{
public:
  double lado, area, perim;

  Cuadrado(string n, double coordx, double coordy, double lm, double lmin) : Rectangulo(n, coordx, coordy, lm, lmin){
    lado = lm; //un cuadrado tiene todos sus lados iguales, por lo que solo una variable recibe el parametro de "lado mayor"
  }

  void area_cuad(); //area del cuadrado
  void perim_cuad(); //perimetro del cuadrado
  void print_cuad(); // imprime ademas los lados
};

class Circulo : public Elipse{
public:
  double radio, area, perim;

  Circulo(string n, double coordx, double coordy, double rm, double rmin) : Elipse(n, coordx, coordy, rm, rmin){
    radio = rm; //el radio es igual en todo el circulo
  }

  void area_circ(); //area del circulo
  void perim_circ(); //perimetro del circulo
  void print_circ(); //imprime ademas el radio
};
