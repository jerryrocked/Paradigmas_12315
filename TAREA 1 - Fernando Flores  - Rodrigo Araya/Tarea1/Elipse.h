#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

#ifndef ELIPSE_H
#define ELIPSE_H

#include "Forma.h"


class Elipse : public Forma
{
	public:
		Elipse();
		~Elipse();
		float RadioMayor;
		float RadioMenor;
		ImpElipse(float RadioMayor,float RadioMenor,int color);
		AreaElipse(float RadioMayor,float RadioMenor);
};

#endif
