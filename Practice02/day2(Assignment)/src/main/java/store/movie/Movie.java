package store.movie;

import java.time.LocalDate;

public class Movie {
   private String movieName;
   private String date;
   private String ratings;
   private String votes;
   
   
   
   
   

public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
public Movie(String movieName, String date, String ratings, String votes) {
	super();
	this.movieName = movieName;
	this.date = date;
	this.ratings = ratings;
	this.votes = votes;
}


public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getRatings() {
	return ratings;
}
public void setRatings(String ratings) {
	this.ratings = ratings;
}
public String getVotes() {
	return votes;
}
public void setVotes(String votes) {
	this.votes = votes;
}
@Override
public String toString() {
	return "Movie [movieName=" + movieName + ", date=" + date + ", ratings=" + ratings + ", votes=" + votes + "]";
}
   
   
  


	
}
