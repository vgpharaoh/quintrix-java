package com.quintrix.jfs;
import java.util.*;

public class TestfPimpl implements TestFP{

	@Override
	public int findCount(String a, int b) {
		int i = 5;
		return i++;
	}
	
	TestFP testFP = (a,b) -> 1;

}
