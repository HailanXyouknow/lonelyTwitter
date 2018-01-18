package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Hailan on 2018-01-17.
 */

public class Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;

}
