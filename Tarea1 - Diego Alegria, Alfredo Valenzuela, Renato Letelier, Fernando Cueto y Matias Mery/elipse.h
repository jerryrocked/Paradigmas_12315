#include <string>
#include "figura.h"
#include <math.h>
#include <cmath>

using namespace std;

class Elipse : public Figura{
    private:
        double radioMayor, radioMenor;

    public:
        Elipse(string nombre, string color, int x, int y, double radioMayor, double radioMenor) : Figura(nombre, color, x, y){
            this->radioMayor = radioMayor;
            this->radioMenor = radioMenor;
        }

        Elipse(string nombre, string color, int x, int y) : Figura(nombre, color, x, y){
        }

        void imprimir(){
            cout << "   Nombre:    " << nombre << " [Elipse]" << endl;
            cout << "   Color:     " << color << endl;
            cout << "   Coor:      " << x << "," << y << endl;
            cout << "   Radios:    " << radioMayor << ", " << radioMenor << endl;
            cout << "   Perimetro: " << perimetro() << endl;
            cout << "   Area:      " << area() << endl;
            cout << endl;
        }

        float perimetro(){
            float per;
            per = 2 * M_PI * sqrt( ((radioMayor*radioMayor)+(radioMenor*radioMenor))/2 );
            return per;
        }

        float area(){
            float A;
            A = M_PI * radioMayor * radioMenor;
            return A;
        }

        void cambiarTamano(double n){
            radioMayor = radioMayor * n;
            radioMenor = radioMenor * n;
        }

        int getRadioMayor(){
            return radioMayor;
        }

        int getRadioMenor(){
            return radioMenor;
        }
};


