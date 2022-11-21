#include <iostream>
#include "figura.h"

using namespace std;

//    clase.      clase eredada.
class Cuadrado : public Rectangulo{
    //---ATRIBUTOS---//
    private:
        int lado;

    //---METODOS---//
    public:
        //Constructor. -> Inicializa lado.
        Cuadrado(string nombre, string color, int x, int y, int lado) : Rectangulo(nombre, color, x, y){
            this->lado = lado;
        }

        //Imprime DATOS DE CUADRADO.
        void imprimir(){
            cout << "   Nombre:    " << nombre << " [Cuadrado]" << endl;
            cout << "   Color:     " << color << endl;
            cout << "   Coor:      " << x << "," << y << endl;
            cout << "   Lado:      " << lado << endl;
            cout << "   Perimetro: " << perimetro() << endl;
            cout << "   Area:      " << area() << endl;
            cout << endl;
        }

        //Calcula el perimetro de cuadrado.
        float perimetro(){
            float per;
            per = 2 * lado;
            return per;
        }

        //Calcula el area de cuadrado.
        float area(){
            float a;
            a = lado * lado;
            return a;
        }

        //Cambia el tamaño del lado.
        void cambiarTamano(double n){
            lado = lado * n;
        }

        //Obtiene lado.
        int getLado(){
            return lado;
        }
};
