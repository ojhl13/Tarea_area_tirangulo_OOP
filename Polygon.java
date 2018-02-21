public clas Polygon extends Figure
{
	private Vertex mvertex [];
	private int index;
	public Polygon(int numVertex){
		mvertex [] = new Vertex [numvertex];
	}
	public Vertex getVertex ()
	{

		return mvertex[indexx++];
	}
    public void setVertex ( Vertex val)
	{
		this.mvertex[index] = val;
	}


}
