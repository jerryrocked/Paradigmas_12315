#include <iostream>
#include <graphics.h>
#include "rectangulo.h"
/* #include "elipse.h"
#include "circulo.h"
*/
#include "cuadrado.h"

#include "Figuras.h"
using namespace std;

void menu() {
  char choice;

  //Todo
  string color, nombre;
  int x,y;

  //Rectangulo, Cuadrado
  int ladoMayor,ladoMenor;

  //Elipse

  //Circulo

  Rectangulo *forma1;
  Figuras *oArreglo = new Figuras();
  int gd = DETECT, gm ;
  initgraph (&gd,&gm,(char *)"");
do
	{
		cout << "a) Ingresar un Rectángulo \nb) Ingresar un Cuadrado \nc) Ingresar un Elipse \nd) Ingresar Círculo \ne) Ordenar \nq) Quit" << endl;
    cout << "Selecciona una opción...:" << endl;
		cin >> choice;



		switch(choice) {

      case 'a':
        system("clear");
        cout << "Seleccionaste Rectángulo"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color :"<<endl;
        cin>> color;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa lado mayor :"<<endl;
        cin>> ladoMayor;
        cout<<"ingresa lado menor :"<<endl;
        cin>> ladoMenor;

        oArreglo->insertarFinal(nombre, color, x, y, ladoMenor, ladoMayor, 1);

        break;
      case 'b':
        system("clear");
        cout << "Seleccionaste Cuadrado"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color :"<<endl;
        cin>> color;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa cateto :"<<endl;
        cin>> ladoMayor;

        oArreglo->insertarFinal(nombre, color, x, y, ladoMayor, ladoMayor, 2);
        break;
      case 'c':
        system("clear");
        cout << "Seleccionaste Elipse"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color :"<<endl;
        cin>> color;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa radio menor :"<<endl;
        cin>> ladoMenor;
        cout<<"ingresa radio mayor :"<<endl;
        cin>> ladoMayor;

        oArreglo->insertarFinal(nombre, color, x, y, ladoMenor, ladoMayor, 3);
        break;
      case 'd':
        cout << "d"<<endl;
        system("clear");
        break;
      case 'e':
        cout<<"Imprimir" <<endl;
        if(oArreglo->getCant() != 0) {


        oArreglo->ordernarArreglo();
        for(int i = 0; i< oArreglo->getCant(); i++ ) {
          cout<< "Nombre: " << oArreglo->getElemento(i)->getNombre()<<endl;
          cout<< "Color: " << oArreglo->getElemento(i)->getColor()<<endl;
          cout<< "X: " << oArreglo->getElemento(i)->getX()<<endl;
          cout<< "Y: " << oArreglo->getElemento(i)->getY()<<endl;
          cout<<"Área: "<< oArreglo->getElemento(i)->calcularArea()<<endl;
          if(oArreglo->getElemento(i)->calcularPerimetro() != 0) {
             cout<<"Perimetro: "<< oArreglo->getElemento(i)->calcularPerimetro()<<endl;
          }
          oArreglo->getElemento(i)->dibujar();

        }
        getch();
        closegraph();
        }

      default:
        cout << "Intenta denuevo"<<endl;
        break;
    }
	} while (choice != 'q' && choice != 'Q');

}

int main()
{

  menu();

  return 0;
}
