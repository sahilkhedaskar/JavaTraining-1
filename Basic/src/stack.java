
// 7th
import java.util.*;

class stack {
	public static void main(String args[]) {
		Stack<Integer> obj = new Stack();
		obj.push(new Integer(3));
		obj.push(new Integer(2));
		obj.pop();
		obj.push(new Integer(5));
		System.out.println(obj);
	}
}
