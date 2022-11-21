#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <graphics.h>
#include <iostream>
#include "calculo.h"

int a, opcion;
int lado, area, base, altura, area_cua, area_rec;
float area_cir. area_eli, perimetro_cir, perimetro_eli;


int main() {
int gd = DETECT, gm;
	do {
		printf("1. Calcular areas\n");
		printf("2. Calcular perimetros\n");
		printf("3. Adios\n\n");
		printf("Opcion ==> ");
		scanf("%d",&a);

		if (a == 1) {
			printf("\neligio calcular el area, elija la figura:  %d:\n",a);
			printf("1 Calcular el area del cuadrado\n");
			printf("2 Calcular el area del rectangulo\n");
			printf("3 Calcular el area del circulo\n");
			printf("4 Calcular el area del elipse\n");
			printf("Seleccion: ");
			scanf("%d",&opcion);

			switch (opcion) {
				case 1:
				    {
				    cuadrado cu;
				    cu.cambio_color();
				    cu.area_cuadrado();

				    }
				break;
				case 2:
				    {
                    rectangulo rec;
                    rec.cambio_color();
                    rec.area_rectangulo();
				    }
				break;
				case 3:
				    {
                    circulo cir;
                    cir.cambio_color();
                    cir.area_circulo();
				    }
				break;
				case 4:
				    {
                    elipse eli;
                    eli.cambio_color();
                    eli.area_elipse();
				    }

				break;
			}
		}
		else if (a == 2) {
			printf("\nSu opcion es la %d:\n",a);
			printf("1 Calcular perimetro del cuadrado\n");
			printf("2 Calcular perimetro del rectangulo\n");
			printf("3 Calcular perimetro del circulo\n");
			printf("4 Calcular perimetro de la elipse\n");
			printf("Seleccion: ");
			scanf("%d",&opcion);

			switch (opcion) {
				case 1:
				    {
				    cuadrado cu;
				    cu.cambio_color();
				    cu.perimetro_cuadrado();
				    break;
				    }
                case 2:
                    {
                    rectangulo rec;
                    rec.cambio_color();
                    rec.perimetro_rectangulo();
                    break;
                    }
                case 3:
                    {
                    circulo cir;
                    cir.cambio_color();
                    cir.perimetro_circulo();
                    break;
                    }
                case 4:
                    {
                    elipse eli;
                    eli.cambio_color();
                    eli.perimetro_elipse();
                    break;
                    }

			break;
			}
		}
	} while (a < 3);

	return 0;
}
