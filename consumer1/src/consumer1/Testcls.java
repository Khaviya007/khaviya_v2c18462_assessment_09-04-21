package consumer1;

import java.util.function.Consumer;

public class Testcls {
	public static void main(String[] args) {
	     Consumer<String> c=(print)->System.out.println(print);
          c.accept("hello");
	}

}
