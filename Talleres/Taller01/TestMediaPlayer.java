public class TestMediaPlayer {

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        System.out.println("Volumen inicial: " + player.getVolume()
                + " | Reproduciendo: " + player.isPlaying());

        boolean p1 = player.play();
        System.out.println("Iniciar reproducción -> " + (p1 ? "Aceptado" : "Rechazado"));

        boolean p2 = player.play();
        System.out.println("Iniciar reproducción de nuevo -> " + (p2 ? "Aceptado" : "Rechazado"));

        for (int i = 0; i < 12; i++) {
            player.increaseVolume();
        }
        System.out.println("Volumen tras subir varias veces: " + player.getVolume());

        boolean v1 = player.increaseVolume();
        System.out.println("Subir volumen en el máximo -> " + (v1 ? "Aceptado" : "Rechazado"));

        for (int i = 0; i < 25; i++) {
            player.decreaseVolume();
        }
        System.out.println("Volumen tras bajar varias veces: " + player.getVolume());

        boolean v2 = player.decreaseVolume();
        System.out.println("Bajar volumen en el mínimo -> " + (v2 ? "Aceptado" : "Rechazado"));

        boolean s1 = player.stop();
        System.out.println("Detener reproducción -> " + (s1 ? "Aceptado" : "Rechazado"));
    }
}