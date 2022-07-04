package com.blz;
import java.util.*;

public class Stock {

	static ArrayList<String> shareNames = new ArrayList<>();
	static ArrayList<Double> sharePrices = new ArrayList<>();
	static ArrayList<Integer> stocksSizes = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of stocks");
		Scanner sc = new Scanner(System.in);

		int numberOfTotalShares = 0;
		System.out.println("Enter number of stocks");
		int numberOfStocks = sc.nextInt();
		int tempCounter = 0;
		for (int i = 0; i < numberOfStocks; i++) {
			System.out.println("Enter number of shares in stock " + i);
			int numberOfShares = sc.nextInt();
			stocksSizes.add(numberOfShares);
			for (int j = 0; j < numberOfShares; j++) {
				numberOfTotalShares += 1;
				System.out.println("Enter names of share for stock" + i);
				String nameOfShare = sc.next();
				shareNames.add(nameOfShare);
				System.out.println("Enter price of" + nameOfShare);
				double sharePrice = sc.nextDouble();
				sharePrices.add(sharePrice);
				System.out.println(shareNames);
				System.out.println(sharePrices);
			}
		}
		StockPortfolio.calculateValueOfStock();

	}

	class StockPortfolio extends Stock {

		static void calculateValueOfStock() {
			int counter = 0;
			int i = 0;
			while (i <= stocksSizes.size()) {

				List<Double> newArr = sharePrices.subList(i, stocksSizes.get(counter) + i);
				double sum = newArr.stream().reduce((x, y) -> x + y).get();
				System.out.println(counter + " stocks price : " + sum);
				i = i + stocksSizes.get(counter);
				counter += 1;
			}
		}
	}
}