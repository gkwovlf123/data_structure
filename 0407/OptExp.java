package dataStructure;

class OptExp {
	private String exp;
	private int expsize;
	private char testCh, openPair;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		Linkedstack s = new Linkedstack();
		expsize = this.exp.length();
		for(int i=0;i<expsize;i++)
		{
			testCh = this.exp.charAt(i);
			switch (testCh) {
			case '(':
			case '{':
			case '[':
				s.push(testCh);
				break;
			case ')':
			case ']':
			case '}':
					if(s.isEmpty())
						return false;
					else {
						openPair = s.pop();
						if((openPair=='(' && testCh != ')') ||
							(openPair=='{' && testCh != '}') ||
							(openPair=='[' && testCh != ']'))
							return false;
						else
							break;
					}
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;
	}
}
