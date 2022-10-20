
public class exampleStringBuffer {
   public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("jani");
	sb.append(" basha");
	System.out.println(sb);
	sb.replace(0, 4,"ianj");
	sb.reverse();
	
	
	System.out.println(sb);
}
}
