package com.coinchange;

import java.util.Scanner;

public class CoinChange {

	int[] denominations;

	public CoinChange() {
		denominations = new int[] { 1, 5, 7 };
	}

	public static void main(String[] args) {
		System.out.println("How much amount of change you want?");

		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		CoinChange coinChange = new CoinChange();
		System.out.println(coinChange.minCoin(amount));

		sc.close();
	}

	public int minCoin(int amount) {
		if (amount == 0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < denominations.length; i++) {
			if (amount - denominations[i] >= 0) {
				int subAnswer = minCoin(amount - denominations[i]);
				if (subAnswer < ans) {
					ans = subAnswer + 1;
				}
			}
		}
		return ans;
	}
}