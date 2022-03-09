package abstarcat;

public class abstract1 {
	abstract void speed();
    abstract void cost();
    void car()
{
	System.out.println("This is not an abstract method");
}
}

public class Abs1 extends Pra2 {
void speed()
{
	System.out.println("Speed is an abstract method");
}

void cost()
{
	System.out.println("Cost is an abstract method");
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Pra2 o=new Abs1();
	o.speed();
	o.cost();

}


}
