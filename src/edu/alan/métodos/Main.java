package edu.alan.métodos;

public class Main {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.desligar();

        System.out.println("ligada? " + smartTv.ligada);
        System.out.println("canal? " + smartTv.canal);
        System.out.println("volume? " + smartTv.volume);
    }
}
