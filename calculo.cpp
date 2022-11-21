#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <graphics.h>
#include <iostream>
#include "class.h"

float pi = M_PI;
int gd = DETECT, gm, color;
using namespace std;

forma::forma(){
  cout << "CREADO" << endl;
  this -> centro = 0;
  this -> color = 15;
  this -> nombre = "";
}
void forma::cambio_color(){
    printf("\n elige color: \n 1)Azul\n 2)Verde\n 3)Cyan\n 4)Rojo\n 5) Magenta\n 6)cafe\n 7)Amarillo\n ");
    scanf("%d", &color);
    if(color==7)
    {
        color = 14;
    }

}
forma::~forma(){
  cout << "Resuelto" << endl;
}


void rectangulo::area_rectangulo(){
    int lado, area_rec, base, altura;
					printf("ingrese el valor de la base: ");
					scanf("%i",&base);
					printf("ingrese el valor de la altura: ");
					scanf("%i",&altura);
					area_rec = (base * altura);
					printf("\nEl area del rectangulo es %i\n",area_rec);
                   setcolor(color);
                   closegraph();
}
void rectangulo:perimetro_rectangulo(){
    int base, altura, perimetro_rec;
    printf("ingrese el valor de la base: ");
    scanf("%i",&base);
    printf("ingrese el valor de la altura: ");
    scanf("%i",&altura);
    perimetro_rec = ((2*base) + (2*altura));
    printf("\nEl perimetro del rectangulo es %i\n",perimetro_rec);
                    initgraph(&gd, &gm, "");
                    setcolor(color);
                    closegraph();
}

void cuadrado::area_cuadrado(){
    int lado, area_cua;
    printf("ingrese el valor del lado: ");
    scanf("%f",&lado);
    area_cua = (lado*lado);
    printf("\nEl area del cuadrado es %i\n",area_cua);
	initgraph(&gd, &gm, "");
	setcolor(color);
	closegraph();
}

void cuadrado::perimetro_cuadrado(){
    int lado, perimetro_cua;
    printf("ingrese el valor del lado: ");
    scanf("%i",&lado);
    perimetro_cua = (4*lado);
    printf("\nEl perimetro del cuadrado es %.2f\n",perimetro_cua);
    initgraph(&gd, &gm, "");
    setcolor(color);
    closegraph();
}

void circulo::area_circulo(){
                    float radio, area_cir;
					printf("ingrese el valor del radio: ");
					scanf("%f",&radio);
					area_cir = (pi * pow(radio,2));
					printf("\nEl area del circulo es %f\n",area_cir);
					initgraph(&gd, &gm, "");
					int max_x = getmax_x();
                    int max_y = getmax_y();
                    setcolor(color);
                    circle(max_x/2,max_y/2);
}


void circulo::perimetro_circulo(){
    float radio, perimetro_cir;
    printf("ingrese el valor del radio: ");
    scanf("%f",&radio);
    perimetro_cir = (2*pi*radio);
    printf("\nEl perimetro del circulo es %f\n",perimetro_cir);
    initgraph(&gd, &gm, "");
    int max_x = getmax_x();
    int max_y = getmax_y();
    setcolor(color);
    circle(max_x/2,max_y/2,50);
    closegraph();
}

void elipse::area_elipse(){
    float radio_mayor, radio_menor, area_eli;
    printf("ingrese el valor del radio mayor: ");
    scanf("%f",&radio_mayor);
    printf("ingrese el valor del radio menor: ");
    scanf("%f",&radio_menor);
    area_eli = (radio_menor * radio_mayor * pi);
      printf("\nEl area de la elipse es %f\n",area_eli);
    initgraph(&gd, &gm, "");
    int max_x = getmax_x();
    int max_y = getmax_y();
    setcolor(color);
    area_eli(max_x/2,max_y/2);
    closegraph();

}

void elipse::perimetro_elipse(){
    float radio_mayor, radio_menor, perimetro_eli;
    float b = 2;
    printf("ingrese el valor de la base: ");
    scanf("%f",&radio_mayor);
    printf("ingrese el valor de la altura: ");
    scanf("%f",&radio_menor);
    perimetro_eli = (b*pi*(sqrt((pow(radio_mayor,2)+pow(radio_menor,2)/2))));
    printf("\nEl perimetro del elipse es %f\n",perimetro_eli);
    initgraph(&gd, &gm, "");
    int max_x = getmax_x();
    int max_y = getmax_y();
    setcolor(color);
    perimetro_eli(max_x/2,max_y/2);
    closegraph();
}
