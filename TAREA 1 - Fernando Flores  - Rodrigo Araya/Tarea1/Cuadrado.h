#ifndef CUADRADO_H
#define CUADRADO_H

#include "Rectangulo.h"

class Cuadrado : public Rectangulo
{
	public:
		Cuadrado();
		~Cuadrado();
		int lado;
		ImpCuad(int lado,int color);
		AreaCuad(int lado);
		PerCuad(int lado);
};

#endif
