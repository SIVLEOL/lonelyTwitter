package ca.ualberta.cs.lonelytwittertest;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest(){
		super(LonelyTwitterActivity.class);
	}
	
	public void testFiveIsFive(){
		assertEquals(5, 5);
	}
	
	public void testTweetListModel(){
		TweetListModel tlm = new TweetListModel();
	}
	
	public void testAdd(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(t));
	}
	
	public void testAddTweet(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t);
		try {
			tlm.addTweet(t);
			fail("addin duplicate tweet succeeded");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testGetTweets(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Bye");
		TweetListModel tlm = new TweetListModel();
		ArrayList<LonelyTweetModel> list1 = new ArrayList<LonelyTweetModel>();
		tlm.add(t);
		tlm.add(t2);
		list1 = tlm.getTweets();
		assertTrue(list1.get(0) == t);
		assertTrue(list1.get(1) == t2);
	}
	
	public void testHasTweet(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		assertFalse(tlm.hasTweet(t));
		tlm.add(t2);
		assertTrue(tlm.hasTweet(t));
	}
	
	public void testRemoveTweet(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		tlm.remove(t);
		assertFalse(tlm.hasTweet(t));
	}
	
	public void testGetCount(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Bye");
		LonelyTweetModel t3 = new LonelyTweetModel("Sigh");
		LonelyTweetModel t4 = new LonelyTweetModel("Try");
		LonelyTweetModel t5 = new LonelyTweetModel("Fly");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		tlm.add(t2);
		tlm.add(t3);
		tlm.add(t4);
		tlm.add(t5);
		assertTrue(tlm.getCount() == 5);
	}
	
}
