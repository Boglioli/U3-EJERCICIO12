public class CajaFuerte {
    private String combinacion;
    private boolean bloqueada;
    private int intentosFallidos;
    public CajaFuerte(String combinacion) {
        this.combinacion = combinacion;
        this.bloqueada = false;
        this.intentosFallidos = 0;
    }

    public CajaFuerte(String combinacion, boolean bloqueada, int intentosFallidos) {
        this.combinacion = combinacion;
        this.bloqueada = bloqueada;
        this.intentosFallidos = intentosFallidos;
    }
    public boolean abrir(String intentoClave) {
        if (bloqueada) {
            System.out.println("la caja fuerte esta bloqueada");
            return false;
        }
        if (combinacion.equals(intentoClave)) {
            intentosFallidos = 0;
            System.out.println("caja fuerte abierta correctamente");
            return true;
        }  else {
             intentosFallidos++;
             System.out.println("clave incorrecta");
             if(intentosFallidos == 3) {
                 bloqueada = true;
                 System.out.println("la caja fuerte ha sido bloqueada");
             }
             return false;
            }
    }
    public void cambiarCombinacion(String claveActual, String nuevaCombinacion) {
        if (bloqueada) {
            System.out.println("no se puede cambiar la contraseña");
        } else if (combinacion.equals(claveActual)) {
            combinacion = nuevaCombinacion;
            intentosFallidos = 0;
            System.out.println("combinacion cambiada corectamente");
        } else {
            System.out.println("la clave actual es incorrecta");
        }
    }
    public boolean estaBloqueada() {
        return bloqueada;
    }
}
