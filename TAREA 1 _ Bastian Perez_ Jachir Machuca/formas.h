#ifndef FORMAS_H_INCLUDED
#define FORMAS_H_INCLUDED

/*********
* CLASES *
*********/
class PUNTO{
public:
    PUNTO();
    ~PUNTO();

    float x, y;

    void ingresarPunto();
};

class FORMA{
public:
    FORMA();
    virtual ~FORMA() = default;

    std::string nombre; int COLOR;
    PUNTO coordenada;

    void FORMA_ingresar();
    void FORMA_imprimir();
    void FORMA_cambiarColor(int);
    void FORMA_mover(float, float);

    virtual void obtener() = 0;
    virtual void imprimir() = 0;
    virtual float calcularArea() = 0;
    virtual float calcularPerimetro() = 0;
    virtual void cambiarTamano() = 0;
};



class RECTANGULO: public FORMA{
public:
    RECTANGULO();
    ~RECTANGULO();

    float ladoMenor, ladoMayor;

    void ingresarRectangulo();
    void imprimir()override;
    float calcularArea()override;
    float calcularPerimetro()override;
    void cambiarTamano()override;
    void obtener()override;
};

class ELIPSE: public FORMA{
public:
    ELIPSE();
    ~ELIPSE();

    float radioMenor, radioMayor;

    void ingresarElipse();
    void imprimir()override;
    float calcularArea()override;
    float calcularPerimetro() override;
    void cambiarTamano()override;
    void obtener()override;
};



class CUADRADO: public RECTANGULO{
public:
    CUADRADO();
    ~CUADRADO();

    float lado;

    void ingresarCuadrado();
};

class CIRCULO: public ELIPSE{
public:
    CIRCULO();
    ~CIRCULO();

    float radio;

    void ingresarCirculo();
};

/************
* FUNCIONES *
************/
int menu();
void PAUSE();
int ingresarOpcion(int, int);
int mostrarNombres();
int elegirColor();
void actualizar();
void eliminarTodo();

#endif // FORMAS_H_INCLUDED
