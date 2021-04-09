package suplicls;
import java.util.function.Supplier;
public class Example {
	public static void main(String[] args) {
		Supplier<String> sup=()->{
			 String id="";
			for(int i=0;i<6;i++) {
				id=id+(int)(Math.random()*10);
			}
			return id;
		};
       System.out.println(sup.get());
       System.out.println(sup.get());
       System.out.println(sup.get());
       System.out.println(sup.get());
       System.out.println(sup.get());
       System.out.println(sup.get());
	}

}
