package funciones;

/**
 * La clase Calculos define constantes del precio y comisión de cada producto,
 * contiene metodos necesarios para calcular el valor vendido y comisión obtenida
 * por cada vendedor.
 * @author Bastian Perez
 * @author Jahir Machuca
 */
public class Calculos {
    private final int precioCallOfDuty = 34500;
    private final int precioMinecraft = 8800;
    private final int precioFortnite = 58200;
    private final int comisionCallOfDuty = 6; //6%
    private final int comisionMinecraft = 4;  //4%
    private final int comisionFortnite = 9;   //9%
    
    /**
     * Método que calcula el monto vendido de acuerdo al juego y la cantidad,
     * luego lo retorna.
     * @param cantidad: cantidad de juegos vendidos.
     * @param juego: nombre de los juegos vendidos.
     * @return: Valor vendido de acuerdo del juego y la cantidad.
     */
    public int Vendido(int cantidad, String juego){
        int vendido = 0; 
        if(null != juego)switch (juego) {
            case "CallOfDuty": 
                vendido = cantidad*precioCallOfDuty;
                break;
            case "Minecraft": 
                vendido = cantidad*precioMinecraft;
                break;
            case "Fortnite":
                vendido = cantidad*precioFortnite;
                break;
            default:
                break;
        }
        return vendido;
    }
    
    /**
     * Método que calcula la comisión de acuerdo al juego y la cantidad,
     * luego lo retorna.
     * @param cantidad: cantidad de juegos vendidos.
     * @param juego: nombre de los juegos vendidos. 
     * @return: Comisión de acuerdo del juego y la cantidad.
     */
    public int Comision(int cantidad, String juego){
        int comision = 0; 
        if(null != juego)switch (juego) {
            case "CallOfDuty": 
                comision = ((cantidad*precioCallOfDuty)/100)*comisionCallOfDuty;
                break;
            case "Minecraft": 
                comision = ((cantidad*precioMinecraft)/100)*comisionMinecraft;
                break;
            case "Fortnite": 
                comision = ((cantidad*precioFortnite)/100)*comisionFortnite;
                break;
            default:
                break;
        }
        return comision;
    }
}
