#ifndef FIGURA_H
#define FIGURA_H

#include <iostream>

using namespace std;

class Figura{

    //---ATRIBUTOS---//
    public:
        //Nombre.
        string nombre;

        //Color.
        string color;

        //Coordenadas.
        int x, y;

    //---METODOS---//
    public:
        //Constructor 1. -> Sirve para inicializar los atributos.
        Figura(string nombre, string color, int x, int y){
            this->nombre = nombre;
            this->color = color;
            this->x = x;
            this->y = y;
        }

        //constructor 2. -> Sirve para eredar otras figuras.
        Figura(){
        };

        //Imprime los datos.
        virtual void imprimir(){
        }

        //Imprime el parimetro.
        virtual float perimetro() = 0;

        //Imprime el area.
        virtual float area() = 0;

        //Cambia el tamaño.
        virtual void cambiarTamano(double){
        }

        //Setea y obtiene el nombre.
        void setNombre(string valorNombre); //Establecemos nombre.
        string getNombre();                 //Obtenemos nombre.

        //Setea y obtiene el color.
        void setColor(string valorColor);   //Establecemos color.
        string getColor();                  //Obtenemos color.

        //Setea y obtiene el eje X.
        void setX(int valorX);
        int getX();

        //Setea y obtiene el eje Y.
        void setY(int valorY);
        int getY();
};

#endif
