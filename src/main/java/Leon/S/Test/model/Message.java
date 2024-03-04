package Leon.S.Test.model;


import jakarta.persistence.*;
import java.sql.Date;

/*
    the model for the class Message
        id = id in database with automatic increment
        text = the message that should be stored in the database
        timestamp = the date of this message
 */
@Entity
@Table(name = "messages")
public class Message{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="text")
    private String text;


    @Column(name = "timestamp")
    private Date timestamp;

    // default constructor
    public Message(){}

    // constructor with text and timestamp (id will be set automatically)
    public Message(String text, Date timestamp){
        this.text = text;
        this.timestamp = timestamp;
    }

    // getter and setter
    public long getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public Date getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }

}
