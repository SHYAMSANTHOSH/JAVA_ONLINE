package com.commandlinearguments;

import java.util.Arrays;

public class CommandValue {

	public static void main(String[] args) {
		int num = 10; // int - Datatype num - Variablename 10 - Value
		System.out.println(num);
		System.out.println(args[0]);//Scenario 1
		System.out.println(Arrays.toString(args)); // Scenario 2
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		} // Scenario 3
	}

}
