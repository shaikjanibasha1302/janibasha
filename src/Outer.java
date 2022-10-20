
public class Outer {
		private int a = 10;
			
			class inner
			{
			
				void innermethod()
				{
					System.out.println("Inner Class of Outer class is: "+a); 
				}
			} 
			
			void function(int i ,int j)
			{
				System.out.println("Outer class of inner class : "+(i+j));
			}

			public static void main(String[] args) {
				Outer o = new Outer();
				o.function(15,10);
				
				Outer.inner i = new Outer(). new inner();
				i.innermethod();
				

			}

		}


