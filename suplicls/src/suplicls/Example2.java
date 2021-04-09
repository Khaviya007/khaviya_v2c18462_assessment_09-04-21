package suplicls;
import java.util.function.Supplier;
public class Example2 {
	public static void main(String[] args) {
		Supplier<Integer> sup=()->{
			 int id=0;
			for(int i=1;i<=6;i++) {
				id=id+(int)(Math.random()*100000);
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
