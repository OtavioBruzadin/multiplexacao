package org.example;

import static org.example.PopulateQueue.PopulateFluxDataQueue;

public class Main {




    public static void main(String[] args)
    {
        System.out.println("Iniciando criacao do Flux 1");
        FluxDataQueue flux1 = PopulateFluxDataQueue(5);
        System.out.println("Iniciando criacao do Flux 2");
        FluxDataQueue flux2 = PopulateFluxDataQueue(5);
        System.out.println("Iniciando criacao do Flux 3");
        FluxDataQueue flux3 = PopulateFluxDataQueue(5);

        SharedQueue Queue = new SharedQueue(20);

        while (!flux1.isEmpty() && !flux2.isEmpty() && flux3.isEmpty()) {
            if (!flux1.isEmpty()) Queue.enqueue(new FluxData(1, flux1.dequeue()));
            if (!flux2.isEmpty()) Queue.enqueue(new FluxData(2, flux2.dequeue()));
            if (!flux3.isEmpty()) Queue.enqueue(new FluxData(3, flux3.dequeue()));
        }

    }


}