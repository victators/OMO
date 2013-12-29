/*
ID: vxsj.fu1
LANG: JAVA
PROG: omo30
 */

import java.io.*;
import java.util.*;

public class omo30 {
	
	void run() throws IOException {
		double[] vX = {-2,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2};
		double[] vY = {2,2,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1,0,1};
		int[]d2 = new int[65536];
		int xComp;
		int yComp;
		String s;
		int count;
		
		for (int i = 0; i < 65536; i++)
		{
			xComp = 0;
			yComp = 0;
			count = 0;
			s = Integer.toBinaryString(i);
			for(int j = s.length()-1; j >= 0; j--)
			{
				if(s.charAt(j) == '0') 
				{
					xComp += vX[count];
					yComp += vY[count];
				}
				else
				{
					if (count >= 8)
					{
						xComp += vX[count-8];
						yComp += vY[count-8];
					}
					else
					{
						xComp += vX[count+8];
						yComp += vY[count+8];
					}
				}
				count++;
			}
			for (int c = s.length(); c < 16; c++)
			{
				xComp += vX[count];
				yComp += vY[count];
				count++;
			}
			d2[i] = xComp*xComp + yComp*yComp;
			System.out.println(xComp + " " + yComp + " " + d2[i]);
		}
		int eV = 0;
		for (int i = 0; i < 65536; i++)
		{
			eV += d2[i];
		}
		System.out.println(eV/65536);
		System.out.close();
		System.exit(0);
	}

	public static void main(String[] args) throws IOException {
		omo30 prog = new omo30();
		prog.run();
	}
}