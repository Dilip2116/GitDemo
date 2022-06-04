class Circle
{
	int centerX;
	int centerY;
	int radius;
	
	void init()
	{
		centerX=0;
		centerY=0;
		radius=1;
	}
	
	void init(int x,int y)
	{
		centerX=x;
		centerY=y;
		radius=1;
	}


	void init(int x,int y,int z)
	{
		centerX=x;
		centerY=y;
		radius=z;
	}
	
	void show(){}
	
	void print()
	{
		System.out.println("Center :(" + centerX + "," + centerY + ") Radius : "+radius);
	} 
	
}