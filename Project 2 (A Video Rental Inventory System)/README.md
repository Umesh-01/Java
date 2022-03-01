## Project 2

The goal of this project is to design and implement a simple inventory control system for a small video rental store. Define least two classes: a class Video to model a video and a class VideoStore to model the actual store.

Assume that an object of class Video has the following attributes:
1. A title;
2. a flag to say whether it is checked out or not; and 3. An average user rating.

Add instance variables for each of these attributes to the Video class.

In addition, you will need to add methods corresponding to the following:
1. being checked out;
2. being returned; and 
3. receiving a rating.

The VideoStore class will contain at least an instance variable that references an array of videos (say of length 10). The VideoStore will contain the following methods:
1. addVideo(String): add a new video (by title) to the inventory;
2. checkOut(String): check out a video (by title);
3. returnVideo(String): return a video to the store;
4. receiveRating(String, int) : take a user's rating for a video; and 
5. listInventory(): list the whole inventory of videos in the store.

Finally, create a VideoStoreLauncher class with a main() method which will test the functionality of your other two classes. It should allow the following.
1. Add 3 videos: "The Matrix", "Godfather II", "Star Wars Episode IV: A New Hope".
2. Give several ratings to each video.
3. Rent each video out once and return it.

List the inventory after "Godfather II" has been rented out
