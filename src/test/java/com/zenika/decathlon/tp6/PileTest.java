package com.zenika.decathlon.tp6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PileTest {
	 
	private static Stream<Arguments> creerPile() {
		return Stream.of(
//			Arguments.of("PileParComposition", 5),
//			Arguments.of("PileParHeritage", 7)
			);
	}
	
	@ParameterizedTest
	@MethodSource("creerPile")
	void testerPile(String word, Pile instance) {
		assertThat(instance.estVide()).isTrue();
		instance.empiler("Hello");
		assertThat(instance.estVide()).isTrue();
		instance.empiler("World");
		assertThat(instance.estVide()).isFalse();
		assertThat(instance.depiler()).isEqualTo("World");
		assertThat(instance.depiler()).isEqualTo("Hello");
		assertThat(instance.estVide()).isTrue();
	}
}
