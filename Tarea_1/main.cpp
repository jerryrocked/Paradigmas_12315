#include <iostream>

#include "rectangulo.h"
#include "elipse.h"
#include "circulo.h"
#include "cuadrado.h"

#include "miniwin.h"

#include "Figuras.h"
using namespace std;
using namespace miniwin ;

void dibujar(string colorFig, int ladoMenor, int ladoMayor, int coordenadaX, int coordenadaY, int tipo) {
    int op;
    if(colorFig == "ROJO"){
        op = 1 ;
    }
    else if(colorFig == "AZUL"){
        op = 2;
    }
    else if(colorFig == "CYAN"){
        op = 3;
    }
    else if(colorFig == "AMARILLO"){
        op = 4;
    }
    else if(colorFig == "BLANCO"){
        op = 5;
    }


    switch(op){
        case 1:
            color(ROJO);
            break;
        case 2:
            color(AZUL);
            break;
        case 3:
            color(CYAN);
            break;
        case 4:
            color(AMARILLO);
            break;
        case 5:
            color(BLANCO);
            break;
        default :
            color(VERDE);
            break;

    }
    switch(tipo){
        case 1:
           rectangulo(coordenadaX, coordenadaY, ladoMenor, ladoMenor);
           break;
        case 2:
           rectangulo(coordenadaX, coordenadaY, ladoMenor, ladoMayor);
           break;
        case 3:
          circulo(coordenadaX, coordenadaY, ladoMenor);
          break;
        case 4:
            circulo(coordenadaX,coordenadaY,ladoMenor);
            break;
        default:
            break;

    }

}

void menu() {
  char choice;


  //Todo
  string colorFigura, nombre;
  int x,y;

  //Rectangulo, Cuadrado
  int ladoMayor,ladoMenor;

  //Elipse
  int radioMayor,radioMenor;
  //Circulo

    int aux, aux2, aux3, aux4,aux5;
    string auxiliar;
  Rectangulo *forma1;

  Figuras *oArreglo = new Figuras();

do
	{
		cout << "a) Ingresar un Rectangulo \nb) Ingresar un Cuadrado \nc) Ingresar un Elipse \nd) Ingresar Circulo \ne) Imprimir Datos Figuras \nf) Dibujar \nq) Quit" << endl;
    cout << "Selecciona una opcion...:" << endl;
		cin >> choice;

		switch(choice) {

      case 'a': case 'A':
        system("cls");
        cout << "Seleccionaste Rectangulo"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color en MAYUSCULA:"<<endl;
        cin>> colorFigura;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa lado mayor :"<<endl;
        cin>> ladoMayor;
        cout<<"ingresa lado menor :"<<endl;
        cin>> ladoMenor;

        oArreglo->insertarFinal(nombre, colorFigura, x, y, ladoMenor, ladoMayor, 1);

        break;
      case 'b': case 'B':
        system("cls");
        cout << "Seleccionaste Cuadrado"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color en MAYUSCULA:"<<endl;
        cin>> colorFigura;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa cateto :"<<endl;
        cin>> ladoMayor;

        oArreglo->insertarFinal(nombre, colorFigura, x, y, ladoMayor, ladoMayor, 2);
        break;
      case 'c': case 'C':
        system("cls");
        cout << "Seleccionaste Elipse"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color en MAYUSCULA:"<<endl;
        cin>> colorFigura;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa radio menor :"<<endl;
        cin>> ladoMenor;
        cout<<"ingresa radio mayor :"<<endl;
        cin>> ladoMayor;

        oArreglo->insertarFinal(nombre, colorFigura, x, y, radioMenor, radioMayor, 3);
        break;
      case 'd': case 'D':
        cout << "d"<<endl;
        system("cls");
        cout << "Seleccionaste Circulo"<<endl;
        cout<<"ingresa nombre :"<<endl;
        cin>> nombre;
        cout<<"ingresa color en MAYUSCULA:"<<endl;
        cin>> colorFigura;
        cout<<"ingresa x :"<<endl;
        cin>> x;
        cout<<"ingresa y :"<<endl;
        cin>> y;
        cout<<"ingresa radio:"<<endl;
        cin>> ladoMenor;
        oArreglo->insertarFinal(nombre,colorFigura,x,y,ladoMenor,ladoMenor,4);

        break;

      case 'e':case 'E':
        cout<<"Imprimir" <<endl;
        if(oArreglo->getCant() != 0) {

        oArreglo->ordernarArreglo();
        for(int i = 0; i< oArreglo->getCant(); i++ ) {
          cout<< "Nombre: " << oArreglo->getElemento(i)->getNombre()<<endl;
          cout<< "Color: " << oArreglo->getElemento(i)->getColor()<<endl;
          cout<< "X: " << oArreglo->getElemento(i)->getX()<<endl;
          cout<< "Y: " << oArreglo->getElemento(i)->getY()<<endl;
          cout<<"Area: "<< oArreglo->getElemento(i)->calcularArea()<<endl;
          if(oArreglo->getElemento(i)->calcularPerimetro() != 0) {
             cout<<"Perimetro: "<< oArreglo->getElemento(i)->calcularPerimetro()<<endl;
          }

        }

        }
        break;
        case 'f':case 'F':
            cout << "f"<<endl;

            system("cls");

            cout<<"Dibujar"<<endl;

            if(oArreglo->getCant() != 0) {
                    oArreglo->ordernarArreglo();
            for(int i = 0; i< oArreglo->getCant(); i++ ) {
                auxiliar = oArreglo->getElemento(i)->getColor();
                aux = oArreglo->getElemento(i)->getX();
                aux2 = oArreglo->getElemento(i)->getY();
                aux3 = oArreglo->getElemento(i)->getLadoMenor();
                aux4 = oArreglo->getElemento(i)->getLadoMayor();
                aux5 = oArreglo->getElemento(i)->getTipo();
                dibujar(auxiliar,aux,aux2,aux3,aux4,aux5);

                espera(30);

          }

        }
        refresca();
        break;

      default:
        cout << "Intenta denuevo"<<endl;
        break;
    }
	} while (choice != 'q' && choice != 'Q');

}

int main()
{
  vredimensiona(600, 600);
  menu();

  return 0;
}
