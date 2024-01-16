package org.example;

import org.example.design.adapter.*;
import org.example.design.aop.AopBrowser;
import org.example.design.decorator.*;
import org.example.design.facade.Ftp;
import org.example.design.facade.Reader;
import org.example.design.facade.SftpClient;
import org.example.design.facade.Writer;
import org.example.design.observer.Button;
import org.example.design.observer.IButtonListener;
import org.example.design.proxy.Browser;
import org.example.design.proxy.BrowserProxy;
import org.example.design.proxy.IBrowser;
import org.example.design.singleton.AClazz;
import org.example.design.singleton.BClazz;
import org.example.design.singleton.SocketClient;
import org.example.design.strategy.*;

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

//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//        IBrowser aop = new AopBrowser("www.naver.com",
//                () -> {
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                () -> {
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//                });
//
//        aop.show();
//        System.out.println("loading time : " + end.get());
//
//        aop.show();
//        System.out.println("loading time : " + end.get());

//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//
//        // a4
//        ICar audi4 = new A4(audi, "A4");
//        audi4.showPrice();
//
//        // a5
//        ICar audi5 = new A5(audi, "A5");
//        audi5.showPrice();

//        Button button = new Button("버튼");
//
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//        button.click("메시지 전달 : click1");
//        button.click("메시지 전달 : click2");
//        button.click("메시지 전달 : click3");
//        button.click("메시지 전달 : click4");

//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disconnect();

//        SftpClient sftpClient = new SftpClient("foo.co.kr", 22, "/home/etc", "text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disconnect();

        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        // append
        AppendStrategy append = new AppendStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println("base64Result = " + base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println("normalResult = " + normalResult);

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println("appendResult = " + appendResult);
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}