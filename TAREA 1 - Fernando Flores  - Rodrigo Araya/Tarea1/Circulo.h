#ifndef CIRCULO_H
#define CIRCULO_H

#include "Elipse.h"

class Circulo : public Elipse
{
	public:
		Circulo();
		~Circulo();
		int Radio;
		ImpCirc(int Radio, int color);
		AreaCirc(int Radio);
		PerCirc(int Radio);
};

#endif
