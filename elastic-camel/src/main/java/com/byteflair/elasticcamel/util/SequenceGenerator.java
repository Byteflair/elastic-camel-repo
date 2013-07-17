package com.byteflair.elasticcamel.util;

import java.util.concurrent.atomic.AtomicLong;

public final class SequenceGenerator {
	private static final AtomicLong sequence = new AtomicLong();

	private SequenceGenerator() {
	}

	public static long next() {
		return sequence.incrementAndGet();
	}
}