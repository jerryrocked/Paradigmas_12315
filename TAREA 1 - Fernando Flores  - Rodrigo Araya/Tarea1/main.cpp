#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>
#include "Forma.h"
#include "Rectangulo.h"
#include "Elipse.h"
#include "Cuadrado.h"
#include "Circulo.h"

using namespace std;

int azul=1,verde=2,rojo=4,magenta=5,amarillo=14,blanco=15;

Rectangulo rec;
Elipse el;
Cuadrado cu;
Circulo cir;

int main() {
	
	rec.nombre="Rectangulo";
	el.nombre="Elipse";
	cu.nombre="Cuadrado";
	cir.nombre="Circulo";
	
	rec.centro=2.3;
	el.centro=1.5;
	cu.centro=5.4;
	cir.centro=3.8;
	
	rec.color=rojo;
	el.color=magenta;
	cu.color=amarillo;
	cir.color=blanco;
	
	rec.LadoMayor=300;
	rec.LadoMenor=150;
	
	el.RadioMayor=200;
	el.RadioMenor=100;
	
	cu.lado=100;
	
	cir.Radio=150;
	
	int gdriver=DETECT, gmode;
	initgraph(&gdriver,&gmode,"C:\\BORLANDC\\BGI");
	
	el.ImpElipse(200,100,el.color);
	getch();
	rec.ImpRectangulo(150,200,rec.color); 
	getch();
	cu.ImpCuad(100,cu.color);
	getch();
	cir.ImpCirc(150,cir.color);
	getch();
	
	cleardevice();
	rec.color=rec.CambiarColor(rec.color);
	el.color=el.CambiarColor(el.color);
	cu.color=cu.CambiarColor(cu.color);
	cir.color=cir.CambiarColor(cir.color);
	
	el.ImpElipse(200,100,el.color);
	rec.ImpRectangulo(150,200,rec.color); 
	cu.ImpCuad(100,cu.color);
	cir.ImpCirc(150,cir.color);
	getch();
	
	
	return 0;
}
