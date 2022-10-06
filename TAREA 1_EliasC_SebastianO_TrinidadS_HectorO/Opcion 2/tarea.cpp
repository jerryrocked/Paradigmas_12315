#include "tarea1.h"
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string>
#include <stream>
#include <iostream.h>
#include <iostream>
#include <miniwim.h>
#include <miniwing.h>
#include <stdlib.h>
using namespace std;
using std::cout; using std::string;
using std::endl; using std::cin;
using std::transform; using std::toupper;

Eleccion::Eleccion() {
  base = 0;
  altura = 0;
  diagonal = 0;
  Fig = ' ';
  Col = ' ';
}

Eleccion::~Eleccion() {}

void Eleccion::pedirFig() {
  while((Fig!="r")||(Fig!="c")||(Fig!="e")||(Fig!="g")||(Fig!="t")){
    cout << "Cual figura quiere (cuadrado (c), rectangulo (r), triangulo (t), "
          "circulo (g), elipce (e)): ";
    getline(cin, Fig);
    if((Fig!="r")||(Fig!="c")||(Fig!="e")||(Fig!="g")||(Fig!="t")){
      cout<<"La letra que elegiste no se puede aceptar, intenta con otra ";
    }
  }
  cout << endl;
  cout << "Cual color quieres: ";
  getline(cin, Col);
  cout << endl;
  Col = ponerMayus(Col);
}
void Eleccion::pedirTama() {
  if (Fig == "c") {
    cout << "Cual es el alto del cuadrado: ";
    cin>> base;
    cout << endl;
  } else if (Fig == "r") {
    cout << "Cual es el alto del rectangulo: ";
    cin>> base;
    cout << endl;
    cout << "Cual es el largo del rectangulo: ";
    cin>> altura;
    cout << endl;
  } else if (Fig == "t") {
    cout << "Cual es el largo de la base del triangulo: ";
    cin>> base;
    cout << endl;
    cout << "Cual es el largo de una de las diagonales del triangulo: ";
    cin>> altura;
    cout << endl;
    cout << "Cual es el largo del otro diagonal del triangulo: ";
    cin>>  diagonal;
    cout << endl;
  } else if(Fig == "g"){
    cout << "Cual es el radio del circulo: ";
    cin>> base;cout << endl;
  }else {
    cout << "Cual es el radio más alejado del elipce: ";
    cin>> base);
    cout << "Cual es el radio más cercano del elipce: ";
    cin>> altura);cout << endl;
}

string Eleccion:: ponerMayus(string &pal){
  for(int i = 0; i < pal.length(); i++){
    pal[i]=toupper(pal[i]);
  }
}
  
Forma::Forma() {
  x=0;
  y=0;
}

Forma::~Forma() {}

void Forma::posicion(){
  cout << "En que pocisión y estará la figura: ";
  getline(cin, y);cout << endl;
  cout << "En que pocisión x estará la figura: ";
  getline(cin, x);cout << endl;
}

void Forma::formar(){
  if(Fig=='r'){
    color(Col);
    rectangulo_lleno(x, y, altura, base);
  }else if(Fig=='c'){
    color(Col);
    cuadrado_lleno(x, y, base);
  }else if(Fig=='g'){
    color(Col);
    circulo_lleno(x, y, base);
  }else if(Fig=='e'){
    color(Col);
    elipce_lleno(x, y, base, altura);
  }else{
    color(Col);
    triangulo_lleno(x, y, base, altura, diagonal);
  }
  refresca();
}
  
Calcular::Calcular() {
  perimetro = 0;
  area = 0;
}
  
Calcular::~Calcular() {}

void Calcular::CalcularPeri() {
  if (Fig == "c") {
    perimetro = base * 2;
  } else if (Fig == "r") {
    perimetro = base + altura;
  } else if (Fig == "t") {
    perimetro = base + altura + diagonal;
  } else if (Fig == "g"){
    perimetro = 2 * 3.14 * base;
  }else{
    perimetro = 3.14 * (base+altura);
  }
}

void Calcular::CacularArea() {
  if (Fig == "c") {
    area = base * base;
  } else if (Fig == "r") {
    area = base * altura;
  } else if (Fig == "t") {
    int largo;
    largo = pow(((altura*altura) - ((base / 2)*(base/2))), (1 / 2));
    area = base * largo;
  } else if(Fig == "g"){
    area = 3.14 * base * base;
  }else{
    area = 3.14 * base * altura;
  }
}

cambiar::cambiar(){
  aceptar=' ';
  Cx=0;
  Cy=0;
}

cambiar::~cambiar(){}

void cambiar:: quererCambiar(){
  while((aceptar!="SI")||(aceptar!="NO")){
    cout<<"Quieres hacer el cambio (si o no): ";
    getline(cin, aceptar);cout<<endl;
    aceptar = ponerMayus(aceptar);
    if((aceptar!="SI")||(aceptar!="NO")){
      cout<<"Tiene que poner si o no"
    }
  }
  if(aceptar=="SI"){
    borra();
    refresca();
    hacerCamb();
  }
}

void cambio:: hacerCamb(){
  cout<<"Cual será la nueva pocisión x de la figura: ";
  getline(cin, x);cout<<endl;
  cout<<"Cual será la nueva pocisión y de la figura: ";
  getline(cin, y);cout<<endl;
  cout<<"Cual será el nuevo color de la figura: ";
  getline(cin, Col);cout<<endl;
  Col = ponerMayus(Col);
  pedirTama();
  formar();
}