package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(sdf.parse("05/12/2021 16:40:45"),"Traveling to Ireland",
				"I'm going to visit this wonderfull country!",12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good luck man!");
		Comment c4= new Comment("Keep improving my friend!");
		
		Post p2 = new Post(sdf.parse("05/12/2021 17:00:45"),"Java Course",
				"You can do it. Believe in yourself!",25);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
