class cola_orden {
  private Nodo primero;
  private Nodo ultimo;
  private String nombre;
  public cola_orden(String nombre) {
    this.nombre = nombre;
  }
  public boolean esVacia() {
    return this.primero == null;
  }
  public void ingresar(Object pedido) {
    Nodo nuevo = new Nodo(pedido);
    if (esVacia()) {
      this.primero = nuevo;
      this.ultimo = nuevo;
    } else {
      this.ultimo.enlazar(nuevo);
      this.ultimo = nuevo;
    }
  }
  public void eliminar_cola() {
    if (esVacia()) {
      System.out.println("La cola está vacía");
    } else {
      this.primero = this.primero.siguiente();
    }
  }
  public void mostrar_pendiente() {
    if (esVacia()) {
      System.out.println("La cola está vacía");
    } else {
      System.out.println("Próximo pedido pendiente: " + this.primero.elemento());
    }
  }
  public int cantidad_pedidos() {
    int count = 0;
    Nodo aux = this.primero;
    while (aux != null) {
      count++;
      aux = aux.siguiente();
    }
    return count;
  }
}
