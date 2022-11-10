#include <iostream>
#include <cmath>
#include "miniwin.h"

using namespace miniwin;
using namespace std;


class Forma{
public:
    int COLOR;
    float x;
    float y;

};
class Rectangulo : public Forma {
public:
    float lado_menor,lado_mayor;
    void agregarRect();
    float perimetroRect();
    float areaRect();
    void imprimir();
};

class Elipse : public Forma{
public:
    float radMenor,radMayor;
    void agregarElipse();
    float areaElipse();
    void imprimir();
};
class Cuadrado : public Rectangulo{
public:
    float lado;
    void agregarCuadrado();
    float perimetroCuad();
    float areaCuad();
    void imprimir();

};
class Circulo : public Elipse {
public:
    float rad;
    void agregarCirculo();
    float areaCirculo();
    void imprimir();

};

void Rectangulo::agregarRect(){
cout<<"Ingrese la medida del lado menor del rectangulo: ";
cin>>lado_menor;cout<<endl;
cout<<"Ingrese la medida del lado mayor del rectangulo: ";
cin>>lado_mayor;cout<<endl;
}
float Rectangulo::perimetroRect(){
    float Perimetro =(2*lado_mayor)+(2*lado_menor);
    cout<<"el perimetro es: "<<Perimetro<<endl;
    return Perimetro;
}
float Rectangulo::areaRect(){
    float area =(lado_mayor*lado_menor);
    cout<<"el area es:"<<area<<endl;
    return area;
}

void Rectangulo::imprimir(){
    float x,y;
    int COLOR;
    cout<<"\n\n########### SELECCION DE COLOR DE LA FORMA ############ ";
    cout<<"\n\n1. ROJO";
    cout<<"\n2. VERDE";
    cout<<"\n3. AZUL";
    cout<<"\n4. AMARILLO";
    cout<<"\n5. MAGENTA";
    cout<<"\n6. CYAN";
    cout<<"\n7. BLANCO\n";
    cout<<"\n\nseleccione el numero del color que segun corresponda:  ";

    cin>>COLOR;cout<<endl;
    cout<<"Ingrese la coordenada para el eje X: ";
    cin>>x;cout<<endl;
    cout<<"Ingrese la coordenada para el eje Y: ";
    cin>>y;cout<<endl;
    cout<<"\nLa coordenada X es: "<<x;
    cout<<"\nLa coordenada Y es: "<<y;
    color(COLOR);
    rectangulo_lleno(y,x,lado_mayor,lado_menor);
    refresca();

}

void Elipse::agregarElipse(){
    cout<<"Ingrese el valor del radio menor: ";
    cin>>radMenor;cout<<endl;
    cout<<"Ingrese el valor del radio mayor: ";
    cin>>radMayor;cout<<endl;
}
float Elipse::areaElipse(){
    float PI;
    PI = 3.14;
    float areaElipse=(PI*(radMayor*radMenor));
    cout<<"\nel area del elipse es:"<<areaElipse<<endl;
    return areaElipse;
}
void Elipse::imprimir(){
    float x,y;
    int COLOR;
    cout<<"\n\n########### SELECCION DE COLOR DE LA FORMA ############ ";
    cout<<"\n\n1. ROJO";
    cout<<"\n2. VERDE";
    cout<<"\n3. AZUL";
    cout<<"\n4. AMARILLO";
    cout<<"\n5. MAGENTA";
    cout<<"\n6. CYAN";
    cout<<"\n7. BLANCO\n";
    cout<<"\n\nSeleccione el numero del color que segun corresponda:  ";
    cin>>COLOR;cout<<endl;

     cout<<"\nIngrese la coordenada para el eje X: ";
     cin>>x;cout<<endl;
     cout<<"\nIngrese la coordenada para  el eje Y: ";
     cin>>y;cout<<endl;
     cout<<"\nLa coordenada X es: "<<x;
     cout<<"\nLa coordenada Y es: "<<y;
     color(COLOR);
    elipse_lleno(y,x,radMenor,radMayor);
    refresca();

}

void Cuadrado::agregarCuadrado(){
    cout<<"Ingrese el valor del lado del cuadrado: ";
    cin>>lado;cout<<endl;

}
float Cuadrado ::perimetroCuad(){
    float Perimetro_cuad = lado*4;
    cout<<"\nel perimetro es: "<<Perimetro_cuad<<endl;
    return Perimetro_cuad;
}
float Cuadrado::areaCuad(){
 float areaCuad =(lado*lado);
    cout<<"\nel area es:"<<areaCuad<<endl;
    return areaCuad;
}

void Cuadrado::imprimir(){

    float cx,cy;
    int COLOR;
    cout<<"\n\n########### SELECCION DE COLOR DE LA FORMA ############ ";
    cout<<"\n1. ROJO";
    cout<<"\n2. VERDE";
    cout<<"\n3. AZUL";
    cout<<"\n4. AMARILLO";
    cout<<"\n5. MAGENTA";
    cout<<"\n6. CYAN";
    cout<<"\n7. BLANCO\n";
    cout<<"\n\nSeleccione el numero del color que segun corresponda:  ";

    cin>>COLOR;cout<<endl;
    cout<<"\nIngrese la coordenada para el eje X: ";
    cin>>x;cout<<endl;
    cout<<"\nIngrese la coordenada para el eje Y: ";
    cin>>y;cout<<endl;
    cout<<"\nLa coordenada X es: "<<x;
    cout<<"\nLa coordenada Y es: "<<y;
    color(COLOR);
    rectangulo_lleno(y,x,lado,lado);
    refresca();
}

void Circulo::agregarCirculo(){
    cout<<"Ingrese el valor del radio del circulo: ";
    cin>>rad;cout<<endl;
}
float Circulo::areaCirculo(){
    float PI;
    PI = 3.141592;
    float area_circ=(PI*(rad*rad));
    cout<<"\nel area del circulo es:"<<area_circ<<endl;
    return area_circ;
}

void Circulo::imprimir(){
    float x,y;
    int COLOR;
    cout<<"\n\n########### SELECCION DE COLOR DE LA FORMA ############ ";
    cout<<"\n\n1. ROJO";
    cout<<"\n2. VERDE";
    cout<<"\n3. AZUL";
    cout<<"\n4. AMARILLO";
    cout<<"\n5. MAGENTA";
    cout<<"\n6. CYAN";
    cout<<"\n7. BLANCO\n";
    cout<<"\n\nSeleccione el numero del color que segun corresponda:  ";

    cin>>COLOR;cout<<endl;
    cout<<"\nIngrese una coordenada para el eje X: ";
    cin>>x;cout<<endl;
    cout<<"\nIngrese una coordenada para el eje Y: ";
    cin>>y;cout<<endl;
    cout<<"\nLa coordenada X es: "<<x;
    cout<<"\nLa coordenada Y es: "<<y;
    color(COLOR);
    circulo_lleno(x,y,rad);
    refresca();

}

