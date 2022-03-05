package extra;

public class Box {
    
	double h,w,d;

    Box(double width, double height, double depth){
        h = height;
        w = width;
        d = depth;
    }
     
    double volume(){ 
    	double vol;
	    vol = h*w*d;
	    return vol;
    }
   
    public static void main(String[] args) {
       
    Box box = new Box(10,15.7,21);
    System.out.println("Volume is: "+box.volume());

    }

}
