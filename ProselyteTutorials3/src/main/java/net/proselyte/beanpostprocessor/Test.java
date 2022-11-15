package net.proselyte.beanpostprocessor;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Test {

    public Test(){}
    public final static String TEST_1 = "TEST_1";

    private Set<Message> messageSet;
    private Map<String, Message> messageMap;

    private Date date;

    public Test(Set<Message> messageSet, Map<String, Message> messageMap) {
        this.messageSet = messageSet;
        this.messageMap = messageMap;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Message> getMessageSet() {
        return messageSet;
    }

    public void setMessageSet(Set<Message> messageSet) {
        this.messageSet = messageSet;
    }

    public Map<String, Message> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(Map<String, Message> messageMap) {
        this.messageMap = messageMap;
    }

    public void init() {
        System.out.println("Test Bean is in init phase.");
    }

    public void destroy() {
        System.out.println("Test Bean will be destroyed now");
    }

}
