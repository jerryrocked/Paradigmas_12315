#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

#ifndef RECTANGULO_H
#define RECTANGULO_H

#include "Forma.h"

class Rectangulo : public Forma
{
	public:
		Rectangulo();
		~Rectangulo();
		int LadoMayor;
		int LadoMenor;
		ImpRectangulo(int LadoMayor,int LadoMenor, int color);
		AreaRectangulo(int LadoMayor,int LadoMenor);
		PerimetroRectangulo(int LadoMayor,int LadoMenor);
		TamanoRectangulo(int LadoMayor,int LadoMenor);
};

#endif
