#include "Elipse.h"
#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

int AreaEl;
float pi=3.14;

Elipse::Elipse(void)
{
}

Elipse::~Elipse(void)
{
}

Elipse::ImpElipse(float RadioMayor,float RadioMenor,int color){
	setcolor(color);
	ellipse(200,450,0,360,RadioMayor,RadioMenor);		//ellipse(centrox,centroy,anguloinicio,angulofinal,radiox,radioy)
	
	outtextxy(200,330,"Elipse");
	outtextxy(200,370,"R menor: 100cm");
	outtextxy(300,450,"R mayor: 200cm");
	outtextxy(200,450,"centro: 1.5");
}

AreaElipse(float RadioMayor,float RadioMenor){
	AreaEl=(pi*RadioMayor*RadioMenor);
	cout<<"El area de la elipse es: "<<AreaEl;
	return AreaEl;
}
