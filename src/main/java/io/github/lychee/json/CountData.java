package io.github.lychee.json;

import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface CountData {
	int all();

	int rated();

	int ai();

	int draw();

	int drawH();

	int loss();

	int lossH();

	int win();

	int winH();

	int bookmark();

	int playing();

	int _import();

	int me();
}
