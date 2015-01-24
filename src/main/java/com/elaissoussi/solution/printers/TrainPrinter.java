package com.elaissoussi.solution.printers;

import java.util.List;

import com.elaissoussi.solution.models.TrainComponent;


public class TrainPrinter
{
	private static final String SEPARATOR = "::";

	public static String print(final List<TrainComponent> trainComponents)
	{
		final StringBuilder builder = new StringBuilder();

		for (final TrainComponent trainComponent : trainComponents)
		{
			builder.append(trainComponent);
			builder.append(SEPARATOR);
		}
		//delete last SEPARATOR
		final String printedTrain = builder.toString();
		final int endIndexOfPrintedTrain = printedTrain.length();

		return printedTrain.substring(0, endIndexOfPrintedTrain - SEPARATOR.length());
	}
}
