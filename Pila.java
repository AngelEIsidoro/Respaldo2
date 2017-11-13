//Clase Pila
public class Pila
{
    //Objeto top de la Clase Nodo tipo privado, este objeto contiene 
    //los valores de la pila
    private Nodo top;
    //Método Pila, verifica si la pila contiene valores para esto
    //necesitaremos utiliar el objeto top que contiene los calores
    // o no tiene es decir; sí hay un nodo creado a partir de una inserción
    //o no.
    public Pila() {
        top = null;
    }
    //Método vacia tipo boolean que nos devolvera un tru o false
    //dependiendo si la pila esta vacia o no e igualmente utilizaremos
    //el objeto top que contiene o no nodos.
    public boolean vacia() {
        return (top==null);
    }
    //Método push tipo void que servira para recibir valores
    //tipo entro como lo indica el parametro con la variable valor
    //Invocamos un objeto de la Clase Nodo recorredemos que un objeto
    //de la clase Nodo contiene los nodos si es que hay o no. 
    public void push(int valor) { //Insertar
        Nodo nuevoNodo;
        //Condición si la pila esta vacia, es decir: si el método vacia me devuelve
        //un true se creara un nuevo nodo conteniendo el valor insertado sino 
        //se creara un nuevo nodo con diferente nombre del objeto anterior(Nota: 2 nodos: nuevoNodo, top)
        if(vacia())
            top = new Nodo(valor);
        else{
            //Se le asigna el valor
            nuevoNodo = new Nodo (valor);
            //Utilizamos el método setProx recordemos que este nuevo valor de este nodo
            //se lo pasamos al objeto "p" de la Clase Nodo y despues
            //se la asignamos al objeto prox, una vez que la contiene
            //ya podemos utilizarla en el método getProx porque ya contiene ese valor
            //como podemos ver nos devolvera ese valor (contiene un retur).
            nuevoNodo.setProx(top);
            //Por ultimo mi objeto top se vuelve al número nuevo,
            //creado del nodo nuevoNodo
            top = nuevoNodo;
        }
    }
    //Método cima tipo void nos servira para sacar un valor de la pila, pero primero
    //verificamos si la pila esta vacía o no.
    public void cima() {//Buscar
        if(!vacia() )
            System.out.println("Cima: " + top.getValor());
        else
            System.out.println("La pila esta vacia");
    }
    //Método pop tipo void nos servira para sacar un valor de la pila, pero primero
    //verificamos si la pila esta vacía o no.
    //Nota(Si nos damos cuenta el método cima es igual utilizamos el método:
    //getValor()  entonces ¿Cúal es la diferencia? como podemos ver en el métod pop
    //asignamos al siguiente valor al objeto top es decir que se estan recorriendo 
    //los valores de la pila hasta llegar al ultimo número de la pila o sea la que esta al fondo.)
    public void pop() {//Extraer o Borrar
        if(!vacia()) {
            System.out.println("Dato extraido: " + top.getValor());
            top = top.getProx();
        }else
            System.out.println("La pila esta vacia");
    }
    //Método peek tipo void, nos servira para mostrar todos los números de la pila
    //Como podemos ver nuevamente creamos un objeto de la Clase Nodo y este objeto}
    //le asignamos los valores que contenga el objeto top.
    public void peek() {//Mostrar
        Nodo temp = top;
        //Una condión primeramente para saber si la pila esta vacía, recordemos que
        //si hay un valor en la objeto temp que le paso el objeto top entonces ya sería diferemte 
        //al null y se ejecutaria el codigo de adentro.
        if( temp!=null) {
            System.out.println("La pila es: ");
            //El while nos ayudara a recorrer todos los números que contiene el objeto
            //temp y terminara hasta que verifique que ya no hay números.
            while(temp!=null) {
                //Cada número concontrado sera impreso 
                System.out.println(temp.getValor());
                //el objeto temp se convierte en el proximo así que el while volvera a evaluar.
                //Ejemplo: temp =1,2; entonces imprimimos=1 despues temp ya no seguira siendo 1,
                //sino que le estamos diciedo que 1 = 2; lo estamos sobrescribiendo con un nuevo 
                //valor y asi el while que aún hay números y volvera a imprimir=2;
                temp=temp.getProx();
            }
        }else{
            System.out.println("PILA VACÍA.");
        }
    }

    //Creamos un metodo que determine el numero de elementos que hay en la pila
    public void tamaño(){
        //verificamos si la pila esta vacia con el metodo vacia
        if(!vacia()) {
            //insertamos una variable tipo int con el nombre de 
            //numerostamaño que es igual a 0. 
            int numerostamaño = 0;
            //de igual manera el objeto Nodo.
            Nodo temp = top;
            //insertamos un while para verificar si temp es igual o diferente a null,
            //si se cumple esto se comparan los valores
            while (temp != null) {
                //La siguiente variable nos sirve para contar los elementos aregados
                numerostamaño++;
                //Este sirve para recorrerlos y esperar al siguiente numero insertado
                temp = temp.getProx();
            }
            //Insertamos un System.out.println para imprimir,
            //el numero de elementos que hay en la pila.
            System.out.println("El tamaño de la pila es: " + numerostamaño);
        }else{
            //Pero la pila esta vacia imprimira vacia...
            System.out.println("La pila esta vacía");
        }
    }

    //Método Buscar tipo void con un parametro tipo entero.
    public void Buscar(int referencia){
        //Nuevamente le pasamos los valores al objeto temp.
        Nodo temp = top;
        //Creamos un contador solamente para saber en que pocisión esta cada número, dependiendo 
        //de cuantos número haya en la pila se haran los recorridos y sino hay ninguno, nos damos
        //cuenta que el while respondera hasta que verifique que no hay ningun número, pero 
        //sino hay ningun número y nuestro contador esta inicializado con un cero no deberia imprimirse
        //cuando no hay nada, en teoria es cierto pero si nos damos cuenta antes verificamos 
        //si hay números en la pila así que invocaremos un método que nos ayude a verificar si el 
        //número a buscar esta en la pila también podriamos usar el métod vacia(); pero lo haremos
        //así para tener un poco más de logica en la solución del problema:).
        int contador = 0;
        //Si el numero esta en la pila, entoces recorreremos toda la pila y si lo encuentra
        //lo mandamos a imprimir y la pocisión en que se encuentra.
        //sino lo encuentra mandamos un mensaje("No encontrado"). 
        // Y si preguntaran porque no poner el else adentro del while en la condición donde 
        //se esta comparando el número, muy simple si estuviera hay todas las veces del recorrido
        //lo que contenga el else se imprimiria ya que la condición no se cumpliria a la primera.
        if (buscar(referencia)) {
            while (temp != null) {
                if (referencia == temp.getValor()) {
                    System.out.println("El numero: " + temp.getValor() + " esta en la posición " + contador);
                }

                temp = temp.getProx();
                contador++;
            }
            System.out.println("\n");
        }else{
            System.out.println("El número no esta en la pila");
            System.out.println("\n");
        }
    }

    //Método que no ayudara a verificar si el elemento se encuentra devolviendonos un true
    public boolean buscar(int numero){
        // Crea una copia de la lista.
        Nodo temp = top;;
        // Indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al final de la lista.
        while(temp != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (numero == temp.getValor()){
                // Canbia el valor booleano.
                encontrado = true;
            }
            // Avanza al siguiente nodo.
            temp = temp.getProx();
        }
        // Retorna el resultado.
        return encontrado;
    }
    //Cual es el valor minimo
    public void minimo(){
        Nodo temp = top;
        int min=10000000;// se declara una variable con un valor maximo
        if(temp!= null){//si el objeto temp es igual o diferente a null, si esto se cumple entra en la condicion while

            while(temp!=null){//si temp es diferente a null, si esto se cumple entra a la condicion If

                if(temp.getValor() < min){//compara los valores del temp con la variable min  
                    min = temp.getValor();// se le asigna el nuevo valor a la variable min 
                }
                temp = temp.getProx();//el valor siguiente lo volvemos nuestro nuevo temp 
            }
            System.out.println("El valor minimo es: " + min);//se imprime el valor minimo
            System.out.println("\n");//se imprime un salto de linea 
        }else{
            System.out.println("Pila vacia.");//se imprime un mensaje en caso de que no se cumpliera la condicion 
            System.out.println("\n");//se imprime un salto de linea 
        }
    }
} 

