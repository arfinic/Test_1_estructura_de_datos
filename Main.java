import java.util.*;

public class Main {
  public static void main(String[] args) {
    ColaOrden cola = new ColaOrden("Pedidos");
    cola.ingresar("Teléfono");
    cola.ingresar("Audifonos");
    cola.ingresar("Cable");
    cola.ingresar("Teclado");
    cola.mostrarPendiente();
    cola.eliminarCola();
    }
}
