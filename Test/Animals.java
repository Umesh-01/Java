package extra;

class Aniimal{

  public void eat()  {

    System.out.println("This is eat method");

  }

  public void sleep()  {

    System.out.println("This is sleep method");

  }

}

class Bird extends Aniimal{


  public void eat() {

    super.eat();

    System.out.println("This is overriden eat method");

  }

  public void sleep() {

    super.sleep();

    System.out.println("This is overriden sleep method");

  }

  public void fly()

  {

    System.out.println("This is fly method");

  }

}

public class Animals{

  public static void main(String[] args) {

    Aniimal a = new Aniimal();

    a.eat();

    a.sleep();

    Bird b = new Bird();

    b.eat();

    b.sleep();

    b.fly();

  }

}
