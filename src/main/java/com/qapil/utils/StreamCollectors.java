package com.qapil.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.util.MultiValueMap;

public class StreamCollectors {

	public static <T, K, V> Collector<T, ?, ? extends MultiValueMap<K,V>> toMultiValueMap(
			Function<? super T, ? extends K> keyMapper,
			Function<? super T, ? extends V> valueMapper,
			Supplier<? extends MultiValueMap<K, V>> supplier) {
		return Collectors.toMap(
				keyMapper,
				item -> {
					V value = valueMapper.apply(item);
					List<V> l = new ArrayList<>();
					l.add(value);
					return l;
				},
				(left, right) -> {
					left.addAll(right);
					return left;
				},
				supplier);
	}
}
