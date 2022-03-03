package cse_pblj;

import java.util.ArrayList;

public class VideoStore{
	
	Video[] video;
	
	public VideoStore(){
		video = new Video[3];
	}
	
	public void addVideo(String name1, String name2, String name3){
		video[0] = new Video(name1);
		video[1] = new Video(name2);
		video[2] = new Video(name3);
		System.out.println("Video '"+video[0].getName()+"' '"+video[1].getName()+"'  '"+video[2].getName()+"' added successfully.");
	}
	
	public void doCheckout(String name){
		for(int i = 0; i<video.length; i++) {	
			if(video[i].videoName.equals(name)){
				video[i].doCheckout();
			}
		}
	}
	
	public void doReturn(String name){
		for(int i = 0; i<video.length; i++) {
			if(video[i].videoName.equals(name)){
				video[i].doReturn();
			}
		}
	}
	
	public void receiveRating(String name, int rating) {
		for(int i = 0; i<video.length; i++) {
			if(video[i].videoName.equals(name)){
				video[i].setRating(rating);
				System.out.println("Rating '"+video[i].getRating()+"' has been added to the video '"+video[i].getName()+"'");
			}
		}
		

	}
	
	public void listInventory() {
		System.out.println("Video Title\t\t Checked Status\t\t Rating");
		for(int i = 0; i<video.length; i++) { 
			System.out.println(video[i].getName()+"\t\t" +video[i].getCheckout()+ "\t\t"+ video[i].getRating());
		}
	}
	
}
