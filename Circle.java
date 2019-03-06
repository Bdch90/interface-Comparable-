package ComparableCircle;

public class Circle {
	private int radius = 2;
	private String color = "blue";
	public Circle(){}
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public Circle(int radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public int getRadius()
	{
		return this.radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String toString()
	{
		return "this Circle radius: " + this.getRadius();
	}
}
