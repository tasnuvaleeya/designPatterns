package com.designpatterns;

public class mailService {

    public void sendEmail() {
        connect(1);
        authenticate();
        disConnect();

    }

    private void connect(int timeout){
        System.out.println("Connect");
    }
    private void disConnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }

}
