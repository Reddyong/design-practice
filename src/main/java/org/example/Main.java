package org.example;

import org.example.design.adapter.*;
import org.example.design.aop.AopBrowser;
import org.example.design.proxy.Browser;
import org.example.design.proxy.BrowserProxy;
import org.example.design.proxy.IBrowser;
import org.example.design.singleton.AClazz;
import org.example.design.singleton.BClazz;
import org.example.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient aClient = aClazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("두 개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));

//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
//        Electronic110V adapter = new SocketAdapter(cleaner);
//        connect(adapter);
//
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V airAdapter = new SocketAdapter(airConditioner);
//        connect(airAdapter);

//        Browser browser = new Browser("www.naver.com");
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aop = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aop.show();
        System.out.println("loading time : " + end.get());

        aop.show();
        System.out.println("loading time : " + end.get());
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}