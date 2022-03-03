package cse_pblj;

public class Video {

	String videoName;
	boolean checked;
	int rating;	
	
	public Video(String name) {
		videoName = name;
	}
	
	public String getName() {
		return videoName;
	}
	
	public void doCheckout() {
		checked = true;
		System.out.println("Video '"+getName()+"'"+" checked out.");
	}
	
	public void doReturn() {
		checked = false;
		System.out.println("Video '"+getName()+"'"+" returned.");
		
	}
	
	public void setRating(int rate){
		rating = rate;
	}
	
	public int getRating(){
		return rating;
	}
	
	public boolean getCheckout(){
		return checked;
	}
	
}
