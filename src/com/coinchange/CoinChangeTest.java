package com.coinchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void testCoinChange18() {
		CoinChange coinChange = new CoinChange();
		int actual = coinChange.minCoin(18);
		
		assertEquals(4, actual);
	}

	/*
	 * @Test public void testCoinChange17() { CoinChange coinChange = new
	 * CoinChange(); int actual = coinChange.minCoin(17);
	 * 
	 * assertEquals(3, actual); }
	 * 
	 * @Test public void testCoinChange0() { CoinChange coinChange = new
	 * CoinChange(); int actual = coinChange.minCoin(0);
	 * 
	 * assertEquals(0, actual); }
	 */
}
