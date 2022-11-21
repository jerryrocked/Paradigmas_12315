#include <cmath>
class forma{
public:
char color, coordenada, nombre;
//~forma();
void Imprimir();
void cambiarColor();
void mover();

};

//clase derivada triangulo
class Rectangulo :public forma{
public:
Rectangulo(int lado_menor, int lado_mayor);
~Rectangulo();
int lado_menor;
int lado_mayor;

void imprimir_rectangulo(); //nombre, color, centro y lado
void calcular_area(); //lado menor por laod mayor
void calcular_perimetro(); //2* menor+ 2* mayor
};

//Clase elipse
class elipse :public forma{
public:
elipse(int radio_R, int radio_r);
~elipse();
int radio_R;
int radio_r;
};

//Clase cuadrado
class cuadrado :public Rectangulo{
public:
cuadrado(Rectangulo);
};

//Clase circulo
class Circulo :public elipse{
public:
Circulo(elipse);
};

