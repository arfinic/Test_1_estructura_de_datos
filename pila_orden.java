class pila_orden{
    private Nodo primero;
    private Nodo ultimo;

    public pila_orden() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void agregar_pedido(String nombre_pedido, double valor_total) {
        Nodo nuevo = new Nodo(nombre_pedido, valor_total);
        if (esVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.enlazar(nuevo);
            this.ultimo = nuevo;
        }
    }

    public Nodo procesar_pedido() {
        if (esVacia()) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            Nodo pedido_procesado = this.ultimo;
            this.ultimo = this.ultimo.anterior();
            return pedido_procesado;
        }
    }

    public Nodo ultimo_procesado() {
        if (esVacia()) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            return this.ultimo;
        }
    }

    public double ganado_pedidos() {
        double total_ganado = 0;
        Nodo actual = this.primero;
        while (actual != null) {
            total_ganado += actual.getValorTotal();
            actual = actual.siguiente();
        }
        return total_ganado;
    }
}
