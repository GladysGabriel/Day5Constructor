package com.abcd;

public class Day5Constructor {
	public Day5Constructor() {
	    this("JAVA");
	    System.out.println("Default const...");
	  }

	  public Day5Constructor(int id) {
	    this(3456.5678f);
	    System.out.println(id);
	  }

	  public Day5Constructor(String name) {
	    this(12);
	    System.out.println(name);
	  }

	  public Day5Constructor(float sal) {
	    System.out.println(sal);
	  }

	  public static void main(String[] args) {
		  Day5Constructor a = new Day5Constructor();
	  }

	}


