#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <graphics.h>
#include <iostream>
#include "metodos_1.h"

int a,seleccion;
float lado,area,seleccion2,lado2,area2;
float base,altura,areaR,radio,areaC,areaE,radiom,base2,altura2;


int main() {
int gd = DETECT, gm;
	do {
		printf("1. AREA\n");
		printf("2. PERIMETRO\n");
		printf("3. SALIR\n\n");
		printf("Opcion ==> ");
		scanf("%d",&a);

		if (a == 1) {
			printf("\nSu opcion es la %d:\n",a);
			printf("1 Calcular area del Cuadrado\n");
			printf("2 Calcular area del Rectangulo\n");
			printf("3 Calcular area del Circulo\n");
			printf("4 Calcular area de la Elipse\n");
			printf("Seleccion: ");
			scanf("%d",&seleccion);

			switch (seleccion) {
				case 1:
				    {
				    cuadrado C;
				    C.obtenerYCambiarColor();
				    C.CalcularArea_cuadrado();

				    }
				break;
				case 2:
				    {
                    rectangulo R;
                    R.obtenerYCambiarColor();
                    R.CalcularArea_rectangulo();
				    }
				break;
				case 3:
				    {
                    circulo Ci;
                    Ci.obtenerYCambiarColor();
                    Ci.CalcularArea_circulo();
				    }
				break;
				case 4:
				    {
                    elipse E;
                    E.obtenerYCambiarColor();
                    E.CalcularArea_elipse();
				    }

				break;
			}
		}
		else if (a == 2) {
			printf("\nSu opcion es la %d:\n",a);
			printf("1 Calcular perimetro del Cuadrado\n");
			printf("2 Calcular perimetro del Rectangulo\n");
			printf("3 Calcular perimetro del Circulo\n");
			printf("4 Calcular perimetro de la Elipse\n");
			printf("Seleccion: ");
			scanf("%d",&seleccion);

			switch (seleccion) {
				case 1:
				    {
				    cuadrado C;
				    C.obtenerYCambiarColor();
				    C.CalcularPerimetro_cuadrado();
				    break;
				    }
                case 2:
                    {
                    rectangulo R;
                    R.obtenerYCambiarColor();
                    R.CalcularPerimetro_rectangulo();
                    break;
                    }
                case 3:
                    {
                    circulo Ci;
                    Ci.obtenerYCambiarColor();
                    Ci.CalcularPerimetro_circulo();
                    break;
                    }
                case 4:
                    {
                    elipse E;
                    E.obtenerYCambiarColor();
                    E.CalcularPerimetro_elipse();
                    break;
                    }

			break;
			}
		}
	} while (a < 3);

	return 0;
}
