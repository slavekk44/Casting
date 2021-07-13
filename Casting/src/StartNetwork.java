


public class StartNetwork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MessagePost message = new MessagePost("White Rabbit", "Oh dear, oh dear, I shall be late!");
		PhotoPost photo = new PhotoPost("Alice Wonderland", "RabbitHole.jpg", "Down the rabbit hole :)");
		EventPost event = new EventPost("Slawomir Kolodziejczyk", "Today we are in", " Gotham Volcano club at 10pm");

		message.addComment("Your watch is exactly two days slow.");
		message.addComment("YOU ARE NICE");
		message.like();
		message.like();
		message.unlike();
		photo.like();

		NewsFeed news = new NewsFeed();

		news.addPost(event);
		news.addPost(message);
		news.addPost(photo);
		news.addPost(event);

		news.show();
	}

}
