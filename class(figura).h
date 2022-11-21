#include <iostream>

using namespace std;

class forma{
public:
forma();
~forma();
int centro, color;
string nombre_figura;
void figura();
void cambio_color();

};

class rectangulo:public forma {
  public:
  int L_mayor, L_menor;
  void figura_rectangulo();
  void area_rectangulo();
  void perimetro_rectangulo();

};

class cuadrado:public rectangulo {
  public:
  int lado;
  void area_cuadrado();
  void perimetro_cuadrado();

};

class circulo:public elipse {
  public:
  int radio;
  void area_circulo();
  void perimetro_circulo();
};

class elipse:public forma {
  public:
  int r_mayor, r_menor;
  void figura_elipse();
  void area_elipse();
  void perimetro_elipse();
};


