

public class EventPost extends Post {
	private String event; // lane event name
	private String place;

	// constructor for objects of class EventPost

	public EventPost(String author, String event, String place) {
		super(author);
		this.event = event;
		this.place = place;
		// TODO Auto-generated constructor stub
	}

	// return the text of the post
	//

	public String getText() {
		return event;
	}

	// display details of this in the post

	public void display() {
		
		System.out.println(event);
		System.out.println("**" + place + " **");
		super.display();
	}
}
