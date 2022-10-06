#include <iostream>
#include "figura.h"
#include <math.h>
#include <cmath>

using namespace std;

class Circulo : public Elipse{
    private:
        double radio;

    public:
        Circulo(string nombre, string color, int x, int y, int radio) : Elipse(nombre, color, x, y){
            this->radio = radio;
        }

        void imprimir(){
            cout << "   Nombre:    " << nombre << " [Circulo]" << endl;
            cout << "   Color:     " << color << endl;
            cout << "   Coor:      " << x << "," << y << endl;
            cout << "   Radio:     " << radio << endl;
            cout << "   Perimetro: " << perimetro() << endl;
            cout << "   Area:      " << area() << endl;
            cout << endl;
        }

        float perimetro(){
            float per;
            per = 2 * M_PI * radio;
            return per;
        }

        float area(){
            float A;
            A = M_PI * radio * radio;
            return A;
        }

        void cambiarTamano(double n){
            radio = radio * n;
        }

        int getRadio(){
            return radio;
        }
};
