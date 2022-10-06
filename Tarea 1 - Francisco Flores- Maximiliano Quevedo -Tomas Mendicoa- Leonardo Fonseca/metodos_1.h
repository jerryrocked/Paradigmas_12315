#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <graphics.h>
#include <iostream>
#include "clases.h"
float pi = M_PI;
int gd = DETECT, gm, color;
using namespace std;

forma::forma(){
  cout << "CREADO" << endl;
  this -> centro = 0;
  this -> color = 15;
  this -> nombre = "";
}
void forma::obtenerYCambiarColor(){
    printf("\nElija el numero que corresponda a su color:\n1 Azul\n2 Verde\n3 Cyan\n4 Rojo\n5 Magenta\n6 cafe\n7 Amarillo\n");
    scanf("%d", &color);
    if(color==7)
    {
        color = 14;
    }

}
forma::~forma(){
  cout << "DESTRUIDO" << endl;
}


void rectangulo::CalcularArea_rectangulo(){
    float lado,area,seleccion2,lado2,area2,base,altura,areaR,radio,areaC,areaE,radiom,base2,altura2;
					printf("Base: ");
					scanf("%f",&base);
					printf("Altura: ");
					scanf("%f",&altura);
					areaR = (base * altura);
					printf("\nEl area del rectangulo es %.2f\n",areaR);
					initgraph(&gd, &gm, "");
					setcolor(color);
                    rectangle(150,250,450,350);
					system("pause");
					closegraph();
					printf("Quiere agrandar la forma? 1 si 2 no: ");
					scanf("%f",&seleccion2);
					if (seleccion2==1){
                        printf("introduzca factor de cambio: ");
                        scanf("%f",&lado2);
                        area2 = areaR*lado2;
                        if (areaR<area2){
                            printf("\nEl area del rectangulo es %.0f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            rectangle(200,300,550,450);
                            system("pause");
                            closegraph();
                        }
                            if (areaR>area2){
                            printf("\nEl area del rectangulo es %.2f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            rectangle(75,125,225,175);
                            system("pause");
                            closegraph();
                        }
					}

}
void rectangulo::CalcularPerimetro_rectangulo(){
    float base, altura, perimetroR;
    printf("Base: ");
    scanf("%f",&base);
    printf("Altura: ");
    scanf("%f",&altura);
    perimetroR = ((2*base) + (2*altura));
    printf("\nEl area del rectangulo es %.2f\n",perimetroR);
                    initgraph(&gd, &gm, "");
                    setcolor(color);
                    rectangle(150,250,450,350);
                    system("pause");
                    closegraph();
}


void elipse::CalcularArea_elipse(){
    float lado,area,seleccion2,lado2,area2,base,altura,areaR,radio,areaC,areaE,radiom,base2,altura2;
    printf("RadioMayor: ");
    scanf("%f",&radioMayor);
    printf("Radio Menor: ");
    scanf("%f",&radioMenor);
    areaE = (radioMenor * radioMayor * pi);
      printf("\nEl area de la elipse es %.2f\n",areaE);
    initgraph(&gd, &gm, "");
    int maxx = getmaxx();
    int maxy = getmaxy();
    setcolor(color);
    ellipse(maxx/2,maxy/2,0,360,100,50);
    system("pause");
    closegraph();
    printf("Quiere agrandar la forma? 1 si 2 no: ");
    scanf("%f",&seleccion2);
    if (seleccion2==1){
    printf("introduzca el factor de aumento: ");
    scanf("%f",&lado2);
    area2 = areaE*lado2;
    if (areaE<area2){
     printf("\nEl area del circulo es %.0f\n",area2);
    initgraph(&gd, &gm, "");
    setcolor(color);
    ellipse(maxx/2,maxy/2,0,360,200,100);
    system("pause");
    closegraph();

}
      if (areaE>area2){
      printf("\nEl area del circulo es %.2f\n",area2);
      initgraph(&gd, &gm, "");
      setcolor(color);
      ellipse(maxx/2,maxy/2,0,360,50,25);
      system("pause");
      closegraph();
 }
}
}
void elipse::CalcularPerimetro_elipse(){
    float radioMayor, radioMenor,perimetroR;
    float b=2;
    printf("Base: ");
    scanf("%f",&radioMayor);
    printf("Altura: ");
    scanf("%f",&radioMenor);
    perimetroR = (b*pi*(sqrt((pow(radioMayor,2)+pow(radioMenor,2)/2))));
    printf("\nEl area del rectangulo es %.2f\n",perimetroR);
    initgraph(&gd, &gm, "");
    int maxx = getmaxx();
    int maxy = getmaxy();
    setcolor(color);
    ellipse(maxx/2,maxy/2,0,360,100,50);
    system("pause");
    closegraph();
}

void cuadrado::CalcularArea_cuadrado(){
    float lado,area,seleccion2,lado2,area2,base,altura,areaR,radio,areaC,areaE,radiom,base2,altura2;
    printf("Lado: ");
    scanf("%f",&lado);
    areaC = (lado*lado);
    printf("\nEl area del cuadrado es %.2f\n",areaC);
	initgraph(&gd, &gm, "");
	setcolor(color);
	rectangle(6,120,200,300);
	system("pause");
	closegraph();
					printf("Quiere cambiar el tamaño (1-Si 2-No): ");
					scanf("%f",&seleccion2);
					if (seleccion2==1){
                        printf("introduzca factor de cambio: ");
                        scanf("%f",&lado2);
                        area2 = areaC*lado2;
                        if (areaC<area2){
                            printf("\nEl area del cuadrado es %.0f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            rectangle(50,240,300,475);
                            system("pause");
                            closegraph();
                        }
                            if (areaC>area2){
                            printf("\nEl area del cuadrado es %.2f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            rectangle(3,60,100,150);
                            system("pause");
                            closegraph();
                        }
					}

}

void cuadrado::CalcularPerimetro_cuadrado(){
    float lado, perimetroC;
    printf("Lado: ");
    scanf("%f",&lado);
    perimetroC = (4*lado);
    printf("\nEl perimetro del cuadrado es %.2f\n",perimetroC);
    initgraph(&gd, &gm, "");
    setcolor(color);
    rectangle(6,120,200,300);
    system("pause");
    closegraph();
}

void circulo::CalcularArea_circulo(){
                    float lado,area,seleccion2,lado2,area2,base,altura,areaR,radio,areaC,areaE,radiom,base2,altura2;
					printf("Radio: ");
					scanf("%f",&radio);
					areaC = (pi * pow(radio,2));
					printf("\nEl area del circulo es %.2f\n",areaC);
					initgraph(&gd, &gm, "");
					int maxx = getmaxx();
                    int maxy = getmaxy();
                    setcolor(color);
                    circle(maxx/2,maxy/2,50);
                    system("pause");
					closegraph();
					printf("Quiere agrandar la forma? 1 si 2 no: ");
					scanf("%f",&seleccion2);
					if (seleccion2==1){
                        printf("Introduzca el factor de cambio: ");
                        scanf("%f",&lado2);
                        area2 = areaC*lado2;
                        if (areaC<area2){
                            printf("\nEl area del circulo es %.0f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            circle(maxx/2,maxy/2,100);
                            system("pause");
                            closegraph();

                        }
                            if (areaC>area2){
                            printf("\nEl area del circulo es %.2f\n",area2);
                            initgraph(&gd, &gm, "");
                            setcolor(color);
                            circle(maxx/2,maxy/2,25);
                            system("pause");
                            closegraph();

                        }
				    }
}

void circulo::CalcularPerimetro_circulo(){
    float radio,perimetroCi;
    printf("Radio: ");
    scanf("%f",&radio);
    perimetroCi = (2*pi*radio);
    printf("\nEl perimetro del circulo es %.2f\n",perimetroCi);
    initgraph(&gd, &gm, "");
    int maxx = getmaxx();
    int maxy = getmaxy();
    setcolor(color);
    circle(maxx/2,maxy/2,50);
    system("pause");
    closegraph();
}

