package Handson;

		// TODO Auto-generated method stub

		import java.util.List;
		import java.util.ArrayList;
		import java.util.Arrays;

		public class FinancialForecast {

		    public static List<Double> forecastRevenue(List<Double> revenues, int windowSize, int forecastMonths) {
		        List<Double> forecast = new ArrayList<>();
		        int n = revenues.size();

		        // Weighted moving average logic
		        double[] weights = new double[windowSize];
		        double totalWeight = 0;
		        for (int i = 0; i < windowSize; i++) {
		            weights[i] = windowSize - i;
		            totalWeight += weights[i];
		        }

		        for (int f = 0; f < forecastMonths; f++) {
		            double weightedSum = 0;

		            for (int i = 0; i < windowSize; i++) {
		                int idx = n - windowSize + i;
		                double value = idx >= 0 ? revenues.get(idx) : forecast.get(idx + windowSize);
		                weightedSum += value * weights[i];
		            }

		            double predicted = weightedSum / totalWeight;
		            forecast.add(predicted);
		            revenues.add(predicted);
		            n++;
		        }

		        return forecast;
		    }

		    public static void main(String[] args) {
		        List<Double> revenueData = new ArrayList<>(Arrays.asList(
		            10000.0, 12000.0, 13000.0, 12500.0, 14000.0, 13500.0
		        ));

		        int windowSize = 3;
		        int forecastMonths = 3;

		        List<Double> result = forecastRevenue(revenueData, windowSize, forecastMonths);

		        System.out.println("Forecasted revenue for next " + forecastMonths + " months:");
		        for (int i = 0; i < result.size(); i++) {
		            System.out.printf("Month %d: ₹%.2f\n", i + 1, result.get(i));
		        }
		    }


	}

