package com.mycompany.InterviewQuestion;

import java.util.Comparator;

public class EngineerUniqueIDFilterComparator implements Comparator<Engineer>{

	@Override
	public int compare(Engineer o1, Engineer o2) {
		 int comp = o1.getEnggID().compareTo(o2.getEnggID());
	        if (comp !=0 )
	        	{return comp;}
	        else
	        return o1.getEnggID().compareTo(o2.getEnggID());
	}

}
