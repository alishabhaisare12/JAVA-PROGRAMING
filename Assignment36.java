class MusicPlayer extends Thread {
    public void run() {
        try {
            System.out.println("Playing song...");
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000);
                System.out.println("Progress " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        m.start();
    }
}
