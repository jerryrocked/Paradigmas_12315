#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

#ifndef FORMA_H
#define FORMA_H


class Forma
{
	public:
		Forma();
		~Forma();
		string nombre;
		float centro;
		int color;
		CambiarColor(int color);
};

#endif
