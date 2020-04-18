package builder;

public class BuilderTest {
	public static void main(String[] args) {
	    User user1 = new User.UserBuilder("ss", "yy")
	    .age(33)
	    .phone("86546976")
	    .address("305 bedok road")
	    .build();
	 
	    System.out.println(user1);
	 
	    User user2 = new User.UserBuilder("rr", "yy")
	    .age(30)
	    .phone("984976568")
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("mm", "yy")
	    .build();
	 
	    System.out.println(user3);
	}
}
