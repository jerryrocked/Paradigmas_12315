#include <iostream>
#include <miniwin.h>
#include <stdlib.h>
using namespace std;

class Eleccion{
public:
  Eleccion();
  ~Eleccion();
  int base, altura, diagonal;
  string Fig, Col;
  void pedirFig();
  void pedirTama();
  string ponerMayus(string);
};

class Forma: public Eleccion{
public:
  Forma();
  ~Forma();
  int x,y;
  void pocision();
  void formar();
};

class Calcular: public Eleccion{
public:
  Calcular();
  ~Calcular();
  int perimetro, area;
  void CalcularPeri();
  void CacularArea();
};

class PedirCambio {
public:
  PedirCambio();
  ~PedirCambio();
  void ElegirQueCambiar();
};

class Cambiar : public Forma{
public:
  Cambiar();
  ~Cambiar();
  string aceptar;
  int Cx, Cy;
  void quererCamb();
  void hacerCamb();
};