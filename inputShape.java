import java.util.Scanner;
class shapes{
    int a,x;
	void insrec(int l,int b){
		a=l;
		x=b;
		System.out.println("The area of rectangle is"+(a*x));
		}
void instrain(int b,int h){
			a=b;
			x=h;
		System.out.println("The area of triangle is"+(0.5*a*x));
    }
	void inscir(int r){
	a=r;
	System.out.println("The area of circle is"+(3.14*a*a));
	}
}
	public class inputShape{
		public static void main(String [] args) { 
			Scanner sc=new Scanner(System.in);
			shapes s=new shapes();
			System.out.println("1.Rectangle");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			System.out.println("Enter the shape you want to get the area of");
			int a=sc.nextInt();
			if(a==1){
				System.out.println("enter the length of rectangle");
				int b=sc.nextInt();
				System.out.println("Enter the breadth of rectangle");
				int c=sc.nextInt();
				s.insrec(b,c);
				}
				else if(a==2){
					System.out.println("Enter the base of triangle");
					int d=sc.nextInt();
					System.out.println("Enter the height of triangle");
					int e=sc.nextInt();
					
					s.instrain (d,e);
					}
					else if(a==3){
						System.out.println("Enter the radius of circle");
						int f=sc.nextInt();
						s.inscir(f);
						}
						else {
							System.out.println("You entered invalid option");
							 }
					}		
			}