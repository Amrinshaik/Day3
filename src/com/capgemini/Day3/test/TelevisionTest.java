package com.capgemini.Day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day3.Television;

class TelevisionTest {
	Television television;

	@BeforeEach
	void setUp() {
		television = new Television(true, 20, 26, 39);
	}

	@Test
	void testState() {
		assertEquals(true, television.state());
	}

	@Test
	void testIncreaseVolume() {
		assertEquals(27, television.increaseVolume());
	}

	@Test
	void testDecreaseVolume() {
		assertEquals(25, television.decreaseVolume());
	}

	@Test
	void testChangeChannel() {
		assertEquals(39, television.changeChannel());
	}

//	@Test
//	void testStateOff() {
//		assertEquals(false,television.state());
//	}
	@AfterEach
	void tearDown() {
		television = null;
	}
}