package thread;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getClass());
	}

}
