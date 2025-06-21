package singleton;

public class SingletonProgram {

	    // Inner Singleton class
	    static class Singleton {
	        private static volatile Singleton instance;

	        private Singleton() {
	            System.out.println("Singleton instance created.");
	        }

	        public static Singleton getInstance() {
	            if (instance == null) {
	                synchronized (Singleton.class) {
	                    if (instance == null) {
	                        instance = new Singleton();
	                    }
	                }
	            }
	            return instance;
	        }

	        public void showMessage() {
	            System.out.println("Hello from the Singleton instance!");
	        }
	    }

	    public static void main(String[] args) {
	        Singleton singleton1 = Singleton.getInstance();
	        singleton1.showMessage();

	        Singleton singleton2 = Singleton.getInstance();
	        singleton2.showMessage();

	        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
	    }
	}
