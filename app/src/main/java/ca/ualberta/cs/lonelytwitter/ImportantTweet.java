package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Hailan on 2018-01-17.
 */

import java.util.Date;

public class ImportantTweet extends Tweet{
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message,date);
    }

    public String getMessage() {
        return "hi";
    }

    public boolean isImportant(){
        return true;
    }
}
