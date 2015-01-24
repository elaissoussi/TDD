package com.elaissoussi.solution.creatures;

import com.elaissoussi.solution.models.TrainCargo;
import com.elaissoussi.solution.models.TrainComponent;
import com.elaissoussi.solution.models.TrainEnd;
import com.elaissoussi.solution.models.TrainHead;
import com.elaissoussi.solution.models.TrainPassenger;
import com.elaissoussi.solution.models.TrainRestaurant;


public class TrainComponentFactory
{

	public static TrainComponent getTrainComponent(final char c)
	{
		TrainComponent component = null;

		switch (c)
		{
			case 'H':
				component = new TrainHead();
				break;

			case 'P':
				component = new TrainPassenger();
				break;

			case 'R':
				component = new TrainRestaurant();
				break;

			case 'C':
				component = new TrainCargo();
				break;

			case 'E':
				component = new TrainEnd();
				break;
		}

		return component;
	}
}
