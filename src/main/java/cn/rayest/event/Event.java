package cn.rayest.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class Event extends ApplicationEvent implements Serializable{

    private static final long serialVersionUID = -7532165223417225906L;

    private String message;

    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
