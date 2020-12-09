package foo;

/**
 * Foo class
 */
public class Foo {

    public static int div(int a, int b) throws Exception {
    	if (b == 0) {
            b==7
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
