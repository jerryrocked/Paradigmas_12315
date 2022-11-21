#include <iostream>
#include <sstream>
#include "miniwin.h"

using namespace std;
using namespace miniwin;

// DEFINICIÓN DE LAS CLASES
class Forma {
  protected:
    int x, y;
    int color;
    string nombreForma;
  public:
    Forma(int x, int y, int color, string nombreForma);
    void imprimirForma();
    string obtenerColor();
    void cambiarColor(int color);
};

class Rectangulo : public Forma {
  protected:
  	int ladoMayor;
    int ladoMenor; 
  public:  
    Rectangulo(int x, int y, int color, string nombreForma, int ladoMayor, int ladoMenor);
    void imprimir();
    float calcularArea();
    float calcularPerimetro();
    void cambiarTamano(float factorEscala); 
};

class Elipse : public Forma {
  protected:
  	int radioMayor;
    int radioMenor;
  public:
    Elipse(int x, int y, int color, string nombreForma, int radioMayor, int radioMenor);
    float obtenerArea();
    void imprimir();
};

class Cuadrado : public Rectangulo {
  public:
  	Cuadrado(int x, int y, int color, string nombreForma, int lado);
};

class Circulo : public Elipse{
  public:
  	Circulo(int x, int y, int color, string nombreForma, int radio);
};
// DEFINICIÓN DE LAS CLASES

// FUNCIONES ESPECIFICAS
string tostring(int num){   
  string str; 
  stringstream ss;  
  
  ss << num;  
  ss >> str;
  
  return str;
}

string colorString(int color){
	if (color == 0) return "NEGRO";
	if (color == 1)	return "ROJO";	
	if (color == 2) return "VERDE";	
	if (color == 3)	return "AZUL";	
	if (color == 4) return "AMARILLO";
	if (color == 5) return "MAGENTA";	
	if (color == 6)	return "CYAN";	
	if (color == 7)	return "BLANCO";		
}
// FUNCIONES ESPECIFICAS

// MÉTODOS DE LAS CLASES
Forma::Forma(int x, int y, int color, string nombreForma){
  this->x = x;
  this->y = y;
  this->color = color;
  this->nombreForma = nombreForma;
}

void Forma::imprimirForma(){
  mensaje("Es un " + this->nombreForma +  "\nSu centro esta en las coordenadas: ( "+ tostring(this->x) + " , "+ tostring(this->y) + " )\nSu color es: " + colorString(this->color));
  refresca();
}

string Forma::obtenerColor(){
	if (this->color == 0) return "NEGRO";
	if (this->color == 1) return "ROJO";	
	if (this->color == 2) return "VERDE";	
	if (this->color == 3) return "AZUL";	
	if (this->color == 4) return "AMARILLO";
	if (this->color == 5) return "MAGENTA";	
	if (this->color == 6) return "CYAN";	
	if (this->color == 7) return "BLANCO";	
}

void Forma::cambiarColor(int color){
  this->color = color;
  if (this->color == NEGRO) color_rgb(0, 0, 0);
  if (this->color == ROJO) color_rgb(255, 0, 0);
  if (this->color == VERDE) color_rgb(0, 255, 0);
  if (this->color == AZUL) color_rgb(0, 0, 255);
  if (this->color == AMARILLO) color_rgb(255, 255, 0);
  if (this->color == 5) color_rgb(255, 0, 255); 
  if (this->color == 6) color_rgb(0, 255, 255);
  if (this->color == BLANCO) color_rgb(255, 255, 255);
}

Rectangulo::Rectangulo(int x, int y, int color, string nombreForma, int ladoMayor, int ladoMenor): Forma(x, y, color, nombreForma){
  this->ladoMayor = ladoMayor;
  this->ladoMenor = ladoMenor;
}

void Rectangulo::imprimir(){
  cambiarColor(this->color);
  rectangulo_lleno(this->x - this->ladoMayor/2 , this->y - this->ladoMenor/2 , this->x + this->ladoMayor/2, this->y + this->ladoMenor/2);
  refresca();
  this->imprimirForma();
  if (this->nombreForma == "Rectangulo") mensaje("El valor de su lado mayor es: " + tostring(this->ladoMayor) + "\nEl valor de su lado menor es: " + tostring(this->ladoMenor));
  else if (this->nombreForma == "Cuadrado") mensaje("El valor de sus lados es: " + tostring(this->ladoMayor));
  borra();
  refresca();
}

float Rectangulo::calcularArea(){
  return (this->ladoMayor * this->ladoMenor);
}

float Rectangulo::calcularPerimetro(){
  return (this->ladoMayor * 2 + this->ladoMenor * 2);
}

void Rectangulo::cambiarTamano(float factorEscala){
  this->ladoMayor = this->ladoMayor * factorEscala;
  this->ladoMenor = this->ladoMenor * factorEscala;
  cambiarColor(this->color);
  rectangulo_lleno(this->x - this->ladoMayor/2 , this->y - this->ladoMenor/2 , this->x + this->ladoMayor/2, this->y + this->ladoMenor/2);
  mensaje("Se han cambiado los valores de la figura");
  refresca();
  borra();
  refresca();
}

Elipse::Elipse(int x, int y, int color, string nombreForma, int radioMayor, int radioMenor) : Forma(x, y, color, nombreForma){
  this->radioMenor = radioMenor;
  this->radioMayor = radioMayor;
}

float Elipse::obtenerArea(){
  return (3.14 * this->radioMayor * this->radioMenor);
}

void Elipse::imprimir(){
  if (this->nombreForma == "Elipse"){
  	Elipse aux(this->x, this->y, this->color, this->nombreForma, this->radioMayor, this->radioMenor);
  	int tope = this->radioMayor/2;
  	for (int i = 0; i <  tope; i++){
  		cambiarColor(this->color);
		circulo_lleno(aux.x + i * 2, aux.y, aux.radioMenor - 0.5 * i);
		circulo_lleno(aux.x - i * 2, aux.y, aux.radioMenor - 0.5 * i);
	}
	refresca();	
	imprimirForma();
	mensaje("El valor de su radio mayor es: " + tostring(this->radioMayor) + "\nEl valor de su radio menor es: " + tostring(this->radioMenor));
	borra();
	refresca();
  } 
   
  if (this->nombreForma == "Circulo"){
  	cambiarColor(this->color);
	circulo_lleno(this->x, this->y, this->radioMayor);
	refresca();
	imprimirForma();
	mensaje("El valor de su radio es: " + tostring(this->radioMayor));
	borra();
	refresca();
  }
}

Circulo::Circulo(int x, int y, int color, string nombreForma, int radio) : Elipse(x, y, color, nombreForma, radio, radio){
}

Cuadrado::Cuadrado(int x, int y, int color, string nombreForma, int lado) : Rectangulo(x, y, color, nombreForma, lado, lado){
}
































// MÉTODOS DE LAS CLASES
