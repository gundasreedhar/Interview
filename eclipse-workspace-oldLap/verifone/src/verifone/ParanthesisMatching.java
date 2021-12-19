package verifone;

import java.util.Stack;
// {}
public class ParanthesisMatching {
	
	static void paranthesisMatching(String[] arr)
	{
		System.out.println("valid expressions are : ");
		Stack<Character> stack = new Stack();
		boolean notFlag;
		for(String exp : arr)
		{
			char[] charArray = exp.toCharArray();
			notFlag = false;
			stack.clear();
			
			for(char c : charArray)
			{
				if(c == '{' || c == '(')
				{
					stack.push(c);
				}
				else if(c == '}' )
				{
					if(stack.isEmpty()!=true)
					{	if(stack.pop() == '{')
						{
							continue;
						}
						else {
							notFlag = true;
							break;
						}
					}
					else {
						notFlag = true;
					}
				}
				else if( c == ')')
				{
					if(stack.isEmpty()!=true)
					{
						if(stack.pop() == '(')
						{
							continue;
						}
						else {
							notFlag = true;
							break;
						}
					}
					else {
						notFlag = true;
					}
				}
			}
			
			if (notFlag != true  && stack.isEmpty() == true )
				System.out.println(exp);
			
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"{}","{(})","{()}","{{","))"};
		paranthesisMatching(arr);
	}

}
