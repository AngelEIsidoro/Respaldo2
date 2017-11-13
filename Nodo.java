//Clase Nodo
public class Nodo
{
    //Variable valor tipo entero y es privada
    private int valor;
    //Objeto prox de la Clase Nodo y es privada
    private Nodo prox;
    //Método Nodo que nos servira para tener los atributos en valor iniciales
    //como podemos la variable valor=0 y el objeto prox=null(vacio);
    public Nodo() {
        this.valor = 0;
        this.prox = null;
    }
    //Métod Nodo que nos servira para poder usar las variables, como podemos
    //ver tiene un parametro eso nos indica que pasaran valores dentro del método,
    //adentro la variable "v" le pasara los valores a la variable local "valor"
    //Y anteriormente estaba en cero pero despues que inserte alguien un número
    //ya no lo sera.
    public Nodo(int v) {
        this.valor = v;
        this.prox = null;
    }
    //Método setValor tipo void no nos regresa nada con un parametro tipo entero,
    //la variable valor  es igual al valor que reciba del parametro de la variable "v".
    public void setValor(int v) {
        valor = v;
    }
    //Método setProx tipo void con un parametro objeto de la Clase Nodo
    //Como podemos observar el objeto "prox" de la Clase Nodo es igual al valor obtenido,
    //el objeto p le asignara el valor obtenido al objeto prox.
    public void setProx(Nodo p) {
        prox = p;
    }
    //Método getValor tipo entero, como podemos observar nos devolvera un valor que contiene
    //la varible "valor".
    public int getValor() {
        return valor;
    }
    //Método getProx de la clase Nodo, nos devolvera lo que contenga el objeto "prox".
    public Nodo getProx() {
        return prox;
    }
}