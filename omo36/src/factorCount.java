/*
ID: vxsj.fu1
LANG: JAVA
PROG: factorCount
 */

import java.io.*;
import java.util.*;

public class factorCount {
	
	void run() throws IOException {
		int l = 40320;
		int r = 97341;
		int count = 0;
		for (int i1 = 0; i1 <= 14; i1++)
		{
			for (int i2 = 0; i2 <= 4; i2++)
			{
				for (int i3 = 0; i3 <= 2; i3++)
				{
					for (int i4 = 0; i4 <= 2; i4++)
					{
						int f = (int)(Math.pow(2,i1)+ 0.5)*(int)(Math.pow(3,i2)+ 0.5)*(int)(Math.pow(5,i3)+ 0.5)*(int)(Math.pow(7,i4)+0.5);
						if (f > l && f < r)
						{
							count++;
							System.out.println("count: " + count + " factor: " + f);
						}
					}
				}
			}
		}
		System.out.println(count);
		System.out.close();
		System.exit(0);
	}

	public static void main(String[] args) throws IOException {
		factorCount prog = new factorCount();
		prog.run();
	}
}
