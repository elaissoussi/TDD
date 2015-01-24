package com.elaissoussi.solution.creatures;

import java.util.ArrayList;
import java.util.List;

import com.elaissoussi.solution.models.TrainCargo;
import com.elaissoussi.solution.models.TrainComponent;


public class TrainBuilder
{
	private static TrainComponentFactory trainComponentFactory = new TrainComponentFactory();
	private static List<TrainComponent> trainComponents;

	public static List<TrainComponent> compose(final String trainComponentsDescription)
	{
		trainComponents = new ArrayList<TrainComponent>();

		final char[] parsedTrainComponents = parseTrainComponents(trainComponentsDescription);

		for (final char c : parsedTrainComponents)
		{
			final TrainComponent trainComponent = trainComponentFactory.getTrainComponent(c);
			trainComponents.add(trainComponent);
		}

		return trainComponents;
	}

	private static char[] parseTrainComponents(final String trainComponents)
	{
		final char[] trainCharArray = trainComponents.toCharArray();
		final int trainLength = trainCharArray.length;

		if (trainLength > 1 && trainCharArray[trainLength - 1] == 'H')
		{
			trainCharArray[trainLength - 1] = 'E';
		}

		return trainCharArray;
	}

	public static boolean fill(final List<TrainComponent> components)
	{
		boolean fill = false;

		for (final TrainComponent trainComponent : components)
		{
			if (trainComponent instanceof TrainCargo)
			{
				if (!((TrainCargo) trainComponent).isFill())
				{
					((TrainCargo) trainComponent).setFill(true);
					fill = true;
					break;
				}
			}
		}
		return fill;
	}
}
