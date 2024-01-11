package org.example;

import org.example.design.singleton.AClazz;
import org.example.design.singleton.BClazz;
import org.example.design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}