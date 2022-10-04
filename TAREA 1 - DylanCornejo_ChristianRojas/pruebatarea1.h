#include <iostream>
#include "graphics.h"
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
    void cambiarTamanoRectangulo(float factorEscala); 
};

class Elipse : public Forma {
  protected:
  	int radioMayor;
    int radioMenor;
  public:
    Elipse(int x, int y, int color, string nombreForma, int radioMayor, int radioMenor);
    float obtenerAreaElipse();
    void imprimirElipse();
};

class Cuadrado : public Rectangulo {
  protected:
	int lado;
  public:
  	Cuadrado(int x, int y, int color, string nombreForma, int lado);
};

class Circulo : public Elipse{
  protected:
  	int radio;
  public:
  	Circulo(int x, int y, int color, string nombreForma, int radio);
  	void imprimirCirculo();
  	float calcularArea();
  	float calcularPerimetro();
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
}

Rectangulo::Rectangulo(int x, int y, int color, string nombreForma, int ladoMayor, int ladoMenor): Forma(x, y, color, nombreForma){
  this->ladoMayor = ladoMayor;
  this->ladoMenor = ladoMenor;
}

void Rectangulo::imprimir(){
  rectangulo_lleno(this->x - this->ladoMayor/2 , this->y - this->ladoMenor/2 , this->x + this->ladoMayor/2, this->y + this->ladoMenor/2);
  refresca();
  this->imprimirForma();
}

float Rectangulo::calcularArea(){
  return (this->ladoMayor * this->ladoMenor);
}

float Rectangulo::calcularPerimetro(){
  return (this->ladoMayor * 2 + this->ladoMenor * 2);
}

void Rectangulo::cambiarTamanoRectangulo(float factorEscala){
  this->ladoMayor = this->ladoMayor * factorEscala;
  this->ladoMenor = this->ladoMenor * factorEscala;
}

Elipse::Elipse(int x, int y, int color, string nombreForma, int radioMayor, int radioMenor) : Forma(x, y, color, nombreForma){
  this->radioMenor = radioMenor;
  this->radioMayor = radioMayor;
}

float Elipse::obtenerAreaElipse(){
  return (3.14 * this->radioMayor * this->radioMenor);
}

void Elipse::imprimirElipse(){
  cout << "elipse" << endl;
}

Circulo::Circulo(int x, int y, int color, string nombreForma, int radio) : Elipse(x, y, color, nombreForma, 0, 0){
	this->radio = radio;
}

void Circulo::imprimirCirculo(){
	circulo_lleno(this->x, this->y, this->radio);
	refresca();
	this->imprimirForma();
}

float Circulo::calcularArea(){
	return (this->radio * this->radio * 3.14);
}

float Circulo::calcularPerimetro(){
	return (2 * this->radio * 3.14);
}

Cuadrado::Cuadrado(int x, int y, int color, string nombreForma, int lado) : Rectangulo(x, y, color, nombreForma, lado, lado){
}
































// MÉTODOS DE LAS CLASES
