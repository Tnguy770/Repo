
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot (Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}

	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps(Plot p)
	{
		boolean aOverlapsXY1 = (p.x >= x && p.x < (x + width)) && (p.y >= y && p.y < (y + depth));
		boolean aOverlapsXY2 = (x >= p.x && x < (p.x + width)) && (y >= p.y && y < (p.y + p.depth));
		boolean bOverlapsXY1 = (p.x + p.width) > x && (p.x + p.width) < (x+width) && p.y >= y && p.y <= (y+depth);
		boolean bOverlapsXY2 = (x + width) > p.x && (x + width) < (p.x +p.width) && y >= p.y && y <= (p.y + p.depth);
		boolean cOverlapsXY1 = p.x >= x && p.x < (x + width) && (p.y +p.depth) > y && (p.y + p.depth) <= (y + depth);
		boolean cOverlapsXY2 = x >= p.x && x < (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
		boolean dOverlapsXY1 = (p.x + p.width) > x && (p.x + p.width) <= (x + width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
		boolean dOverlapsXY2 = (x + width) > p.x && (x + width) <= (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y +p.depth);
		
		return aOverlapsXY1 || aOverlapsXY2 || bOverlapsXY1 || bOverlapsXY2 || cOverlapsXY1 || cOverlapsXY2 || dOverlapsXY1 || dOverlapsXY2;

	}

	public boolean encompasses(Plot p)
	{
		boolean insideX = p.x >= x;
		boolean insideY = p.y >= y;
		boolean insideWidth = p.x + p.width <= x + width;
		boolean insideDepth = p.y + p.depth <= y + depth;
		
		return insideX && insideY && insideWidth && insideDepth;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth()
	{
		this.width = width;
	}

	public int getDepth()
	{
		return depth;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public String toString()
	{
		return "Upper left: ("+ x + "," + y +"); width: " + width + " Depth:" + depth;
	}
}
