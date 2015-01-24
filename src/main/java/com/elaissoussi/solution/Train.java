package com.elaissoussi.solution;

import java.util.List;

import com.elaissoussi.solution.creatures.TrainBuilder;
import com.elaissoussi.solution.models.TrainComponent;
import com.elaissoussi.solution.printers.TrainPrinter;


public class Train
{
	List<TrainComponent> trainComponents;

	public Train(final String trainComponentsDescription)
	{
		trainComponents = TrainBuilder.compose(trainComponentsDescription);
	}

	public String print()
	{
		return TrainPrinter.print(trainComponents);
	}

	public void detachEnd()
	{
		trainComponents.remove(trainComponents.size() - 1);
	}

	public void detachHead()
	{
		trainComponents.remove(0);
	}

	public boolean fill()
	{
		return TrainBuilder.fill(trainComponents);
	}

}
