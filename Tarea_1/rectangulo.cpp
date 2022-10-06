#include "rectangulo.h"
#include "graphics.h"
Rectangulo::Rectangulo(){};
Rectangulo::~Rectangulo(){};

Rectangulo::Rectangulo(int ladoMenor, int ladoMayor, string nombre, string color, int x, int y ):Forma(nombre, color, x, y){
  this->ladoMenor = ladoMenor;
  this->ladoMayor = ladoMayor;
}

int Rectangulo::getLadoMayor(){return ladoMayor;};
int Rectangulo::getLadoMenor(){return ladoMenor;};;

double Rectangulo::calcularPerimetro(){return 2*(ladoMayor+ladoMenor);};
double Rectangulo::calcularArea(){return (ladoMayor*ladoMenor);};
 //Dibujar
void Rectangulo::dibujar(){

  if (color == "rojo"){
    setcolor(4);
  }
  else if(color == "azul"){
    setcolor(1);
  }
  rectangle(x,y, ladoMayor, ladoMenor);



}
