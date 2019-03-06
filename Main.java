package ComparableCircle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ComparableC[] circles = new ComparableC[3];
		circles[0] = new ComparableC(4);
		circles[1] = new ComparableC(2);
		circles[2] = new ComparableC(7);
		System.out.println("Before");

		for (ComparableC circle : circles)
		{
			System.out.println(circle);
		}
		Arrays.sort(circles);
		System.out.println("After");
		for (ComparableC circle : circles)
		{
			System.out.println(circle);
		}
	}
	// public static void main(String[] args) {
	// 	List<ComparableC> circles = new ArrayList<ComparableC>();
	// 	circles.add(new ComparableC(1,"Blue"));
	// 	circles.add(new ComparableC(7,"Green"));
	// 	circles.add(new ComparableC(11,"Red"));
	// 	circles.add(new ComparableC(4,"Gray"));
	// 	for (ComparableC circle : circles)
	// 	{
	// 		System.out.println(circle);
	// 	}
	// 	System.out.println("After :");
	// 	Collections.sort(circles);
	// 	for (ComparableC circle : circles)
	// 	{
	// 		System.out.println(circle);
	// 	}
	// }
}