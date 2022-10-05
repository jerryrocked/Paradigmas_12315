#include "Cuadrado.h"
#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

int AreaCu,PerCu;

Cuadrado::Cuadrado(){
}

Cuadrado::~Cuadrado(){
}

Cuadrado::ImpCuad(int lado,int color){
	setcolor(color);
	rectangle(400,50,500,150);
	outtextxy(450,30,"Cuadrado");
	outtextxy(450,170,"100cm");
	outtextxy(450,100,"centro: 5.4");
}
Cuadrado::AreaCuad(int lado){
	AreaCu=(lado*lado);
	cout<<"El area del cuadrado es: "<<AreaCu;
	return AreaCu;
}

Cuadrado::PerCuad(int lado){
	PerCu=(lado*4);
	cout<<"El perimetro del cuadrado es: "<<PerCu;
	return PerCu;
}
