public class Main {
    public static void main(String[] args) {
        CajaFuerte caja = new CajaFuerte("12234");
        caja.abrir("1111");
        caja.abrir("2222");
        caja.abrir("12234");
        System.out.println("estado bloqueado:" + caja.estaBloqueada());
        caja.abrir("9999");
        caja.abrir("1010");
        caja.abrir("1212");
        System.out.println("estado bloqueada: " + caja.estaBloqueada());
        caja.abrir("12234");
        caja.cambiarCombinacion("12234", "98876");
    }
}