#include <iostream>

using namespace std;

class forma{
public:
forma();
~forma();
int centro, color;
string nombre;
void Imprimir();
void obtenerYCambiarColor();
};

class rectangulo:public forma {
  public:
  float ladoMenor, ladoMayor;
  void Imprimir_rectangulo();
  void CalcularArea_rectangulo();
  void CalcularPerimetro_rectangulo();
  void CambiarTamano_rectangulo();

};
class elipse:public forma {
  public:
  float radioMayor, radioMenor;
  void Imprimir_elipse();
  void CalcularArea_elipse();
  void CalcularPerimetro_elipse();
};
class cuadrado:public rectangulo {
  public:
  float lado;
  void CalcularArea_cuadrado();
  void CalcularPerimetro_cuadrado();
};
class circulo:public elipse {
  public:
  float radio;
  void CalcularArea_circulo();
  void CalcularPerimetro_circulo();
};
