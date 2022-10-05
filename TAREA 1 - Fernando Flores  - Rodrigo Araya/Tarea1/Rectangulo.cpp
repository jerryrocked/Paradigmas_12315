#include "Rectangulo.h"
#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

int AreaRect;
int PerRect;

Rectangulo::Rectangulo(void){
}

Rectangulo::~Rectangulo(void){
}

Rectangulo::ImpRectangulo(int LadoMayor,int LadoMenor,int color){		//Imprime por pantalla el rectangulo
	int der=300;
	int abj=150;
	
	setcolor(color);
	rectangle(50,50,der,abj);	//rectangle(izq,arr,der,abj)
	outtextxy(125,30,"Rectangulo");
	outtextxy(125,155,"300cm");
	outtextxy(305,100,"150cm");
	outtextxy(125,100,"centro: 2.3");
	
	
}

Rectangulo::AreaRectangulo(int LadoMayor,int LadoMenor){
	AreaRect=(LadoMayor*LadoMenor);
	cout<<"El area del rectangulo es: ",AreaRect;
	return AreaRect;
}

Rectangulo::PerimetroRectangulo(int LadoMayor,int LadoMenor){
	PerRect=((LadoMayor*2)+(2*LadoMenor));
	cout<<"El perimetro del rectangulo es: "<<PerRect;
	return PerRect;
}

Rectangulo::TamanoRectangulo(int LadoMayor,int LadoMenor){
	int aumento=1;
	cout<<"Indique una cantidad para aumentar o disminuir el tamaño de la figura: \n";
	cin>>aumento;
	LadoMayor=(LadoMayor*aumento);
	LadoMenor=(LadoMenor*aumento);
	return LadoMayor,LadoMenor;
}
