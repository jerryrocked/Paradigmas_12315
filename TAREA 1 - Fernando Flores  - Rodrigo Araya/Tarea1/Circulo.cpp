#include "Circulo.h"
#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

int AreaCir,PerCir;

Circulo::Circulo(void){
}

Circulo::~Circulo(void){
}

Circulo::ImpCirc(int Radio, int color){
	setcolor(color);
	ellipse(650,450,0,360,Radio,Radio);
	outtextxy(650,280,"Circulo");
	outtextxy(650,605,"R 150cm");
	outtextxy(650,450,"centro: 3.8");
}

Circulo::AreaCirc(int Radio){
	AreaCir=(3.14*Radio*Radio);
	cout<<"El area del circulo es: "<<AreaCir;
	return AreaCir;
}


Circulo::PerCirc(int Radio){
	PerCir=(2*3.14*Radio);
	cout<<"El perimetro del circulo es: "<<PerCir;
	return PerCir;
}
