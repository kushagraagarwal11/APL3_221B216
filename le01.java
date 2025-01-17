/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int age;
    String name;
    
    void setAge(int age)
    {
        this.age=age;
    }
    
    void setname(String name)
    {
        this.name=name;
    }
    
    int getAge()
    {
        return this.age;
    }
    
    String getname()
    {
        return this.name;
    }
	public static void main(String[] args) {
	    Main m1=new Main();
	    m1.setname("Kushagra Agarwal");
	    m1.setAge(20);
	    System.out.println(m1.getname()+" "+m1.getAge());
		
	}
}
