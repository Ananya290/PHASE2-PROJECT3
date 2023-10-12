package com.Phase2Project3;

import java.util.HashMap;
import java.util.Map;

public class PracticeSearch {

	
		private Map<String, Integer> getPractice() {
			
			Map<String, Integer> practiceMap = new HashMap<String, Integer>();
			practiceMap.put("Selenium", 37);
			practiceMap.put("Java", 25);
			practiceMap.put("TestNG", 20);
			practiceMap.put("Jenkins", 23);
			

			return practiceMap;
		}
		
		public int getPractice(String course) {
			
			Map<String, Integer> practiceMap = null ;
			int count =0;
			
			if(course.isEmpty())
			{
				throw new NullPointerException("Course name cannot be empty");
			}
			practiceMap = getPractice();
			
			if(!practiceMap.containsKey(course))
			{
				throw new NullPointerException("Course name doesnot exist");
			}
			else {
			count = practiceMap.get(course);
			}
			return count;
			
		}

	}
	
	


