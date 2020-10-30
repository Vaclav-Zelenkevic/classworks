package lt.vtmc.questack;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Stack<People> peoplesStack = new Stack<>(); // LIFO
		peoplesStack.push(new People(1));
		peoplesStack.push(new People(5));
		peoplesStack.push(new People(3));
		peoplesStack.push(new People(4));
		peoplesStack.push(new People(2));

		System.out.println(peoplesStack);
		peoplesStack.pop();
		System.out.println(peoplesStack);
		System.out.println(peoplesStack.peek());
		System.out.println(peoplesStack);
		peoplesStack.clear();
		System.out.println(peoplesStack);
	}

}
