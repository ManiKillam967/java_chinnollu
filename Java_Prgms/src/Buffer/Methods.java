package Buffer;

public class Methods 
{
public static void main(String[] args) 
{
    System.out.println("main starts");
    move();
    Methods m1 = new Methods();
    m1.run();
    System.out.println("main ends");
}
public static void move()
{
	System.out.println("move me");
}
public void run()
{
	System.out.println("run along");
	max();
}
public void max()
{
	System.out.println("maxi");
}

}
