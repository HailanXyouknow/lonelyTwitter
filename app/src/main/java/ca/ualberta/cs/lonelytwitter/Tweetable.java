package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

/**
 *  @author hailan (original owner sajediba)
 *  @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
