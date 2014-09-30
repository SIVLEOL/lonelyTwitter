package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel t) {
		tweets.add(t);
	}

	public boolean hasTweet(LonelyTweetModel t) {
		return tweets.contains(t);
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweets;
	}

	public void remove(LonelyTweetModel t) {
		tweets.remove(t);
	}

	public int getCount() {
		return tweets.size();
	}

	public void addTweet(LonelyTweetModel t) {
		if (tweets.contains(t)){
			throw new IllegalArgumentException();
		}
		add(t);
	}
	

}
