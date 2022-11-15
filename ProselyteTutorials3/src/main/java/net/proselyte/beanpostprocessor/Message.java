package net.proselyte.beanpostprocessor;

public class Message {
    private String message;
    private String test;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void init() {
        System.out.println("Bean is in init phase.");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }
}
