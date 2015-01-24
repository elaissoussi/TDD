package com.elaissoussi.solution.models;

public class TrainCargo extends TrainComponent
{
	private boolean fill;

	@Override
	public String toString()
	{
		if (!isFill())
		{
			return "|____|";
		}
		else
		{
			return "|^^^^|";
		}
	}

	public boolean isFill()
	{
		return fill;
	}

	public void setFill(final boolean fill)
	{
		this.fill = fill;
	}


}
