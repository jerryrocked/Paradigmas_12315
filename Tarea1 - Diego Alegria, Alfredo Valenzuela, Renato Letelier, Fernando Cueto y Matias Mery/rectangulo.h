#include <iostream>
#include "figura.h"

using namespace std;

//    Clase        Clase que ereda.
class Rectangulo : public Figura{

    //---ATRIBUTOS---//
    public:
        double ladoMayor, ladoMenor;

   //---METODOS---//
    public:
        //Constructor 1. -> Inicializa los datos de Figura y agrega lado mayor y lado menor.
        Rectangulo(string nombre, string color, int x, int y, int ladoMayor, int ladoMenor) : Figura(nombre, color, x, y){
            this->ladoMayor = ladoMayor;
            this->ladoMenor = ladoMenor;
        }

        //Constructor 2. -> Sirve para eredar clase Cuadrado e inicializa sin lados mayores y
        //                  menores ya que es innecesario para la clase Cuadrado.
        Rectangulo(string nombre, string color, int x, int y) : Figura(nombre, color, x, y){
        }

        //Imprime los DATOS DE RECTANGULO.
        void imprimir(){
            cout << "   Nombre:    " << nombre << " [Rectangulo]" << endl;
            cout << "   Color:     " << color << endl;
            cout << "   Coor:      " << x << "," << y << endl;
            cout << "   Lados:     " << ladoMayor << "," << ladoMenor << endl;
            cout << "   Perimetro: " << perimetro() << endl;
            cout << "   Area:      " << area() << endl;
            cout << endl;
        }

        //Calcula perimetro de rectangulo.
        float perimetro(){
            float per;
            per = 2*ladoMayor + 2*ladoMenor;
            return per;
        }

        //Calcula area de rectangulo.
        float area(){
            float a;
            a = ladoMayor * ladoMenor;
            return a;
        }

        //Cambia el tamaño de los lados de rectangulo.
        void cambiarTamano(double n){
            ladoMayor = ladoMayor * n;
            ladoMenor = ladoMenor * n;
        }

        //Obtiene el lado mayor.
        int getLadoMayor(){
            return ladoMayor;
        }

        //Obtiene el lado menor.
        int getLadoMenor(){
            return ladoMenor;
        }
};
