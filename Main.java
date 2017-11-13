import java.util.Scanner;
//Clase Main
public class Main {
    //Método Main tipo publico
    public static void main(String[] args) {
        //El scanner nos servira para obtener datos del teclado
        Scanner sc = new Scanner(System.in);
        //La variable opcion tipo entero
        int opcion;
        //Variables tipo entero
        int numero,buscarnumero;
        //Creamos una instancia de la Clase Pila, con el objetivo 
        //de hacer uso de los atributos con sus métodos correspondientes.
        Pila p = new Pila();
        //Creamos el do while para recorrer las veces necesarias todo lo
        //que este entre el do y el while(Nota: Este ciclo primero ejecuta
        // y despues evalua si se seguira repitiendo). 
        do{
         //Menú 
         System.out.println("Elige una opción");
         System.out.println("1. Insertar");
         System.out.println("2. Mostrar");
         System.out.println("3. Buscar");
         System.out.println("4. Eliminar");
         System.out.println("5. Tamaño");
         System.out.println("6. Máximo");
         System.out.println("7. Mínimo");
         System.out.println("8. Terminar");
         //Variable opcion que nos ayudara a guardar el número introducido, de acuerdo
          //con la opcion deseada que esta en el menú.
          opcion = sc.nextInt();//Utilizaremos el método nextInt(); tipo entero.
          //Un switch para poder ejecutar por turno el número correspondiente
            switch (opcion) {
              //Los cases corresponden a un solo número sin excepción(es único).
              case 1:
              //Cada número tiene instrucciones de ejecucuón de acuerdo a lo que solicito 
              //el usuario en el menú.
                  System.out.println("Inserte el valor");
                  numero =sc.nextInt();
              //Método que nos ayudara a insertar los números en la pila y lo recibiremos
              //como parametro la variable numero es decir: (numero = ?), (?=1,2 etc.);
              //(Nota: hacemos uso del objeto "p" para poder invocar los métodos de la clase Pila)
                  p.push(numero);
              //El break nos ayudara a parar el flujo de ejecución y no lo dejara pasar 
              //al siguiente método u opción.
                  break;
              case 2:
              //Método que nos servira para mostrar todos los números que estan en la pila.
                  p.peek();
                  break;
              case 3: 
              //Usaremos una condición para verificar primeramente si la pila esta vacia,
              //si es ese es el caso, nos mandara un mensaje: "La pila esta vacía".
              //Sino nos permitira introducir el número que deseamos buscar. 
                  if(!p.vacia()) {
                      //Preguntamos que valor desea buscar
                      System.out.println("¿Que numero desea buscar?");
                      //Utilizaremos la varibale buscarnumero como contenedor del número insertado,
                      //con la ayuda del scanner y con su método nextInt();
                      buscarnumero = sc.nextInt();
                      //La variable anterior la pasamos como parametro al método Buscar
                      p.Buscar(buscarnumero);
                  }else{
                      System.out.println("La pila esta vacía");
                      System.out.println("\n");
                  }
                  break;
              case 4:
              //Método que nos sevira para sacar un valor de la pila.
              //(Nota: El ultimo que entra es el primero en salir);
                  p.pop();
                  break;
              case 5:
              //Método que nos servira para saber de cuantos elementos esta conformada nuestra pila.
                  //p.tamaño();
                  break;
              case 6:
              //Método que nos servira para saber cual es el elemento maximo o mayor de la pila.
                  //p.maximo();
                  break;
              case 7:
              //Método que nos servira para saber cual es el elemento minimo o menor de la pila.
                  //p.minimo();
                  break;
              case 8:
              //Esta opción es la terminación de la ejecución
                  System.out.println("¡Adios!");
                  break;
              default:
              //El default del switch solamente se ejecutara cuando no se encuentre ninguna opción
              //disponible.
                  System.out.println("Opción incorrecta");
                  break;
          }
          //El while evaluara si nuestra opcion es igual al 8, si ese es el caso lo negamos para que 
          //no se repita nuevamente y se pare el proceso de ejecución.
        }while(!(opcion ==8));
    }
}

