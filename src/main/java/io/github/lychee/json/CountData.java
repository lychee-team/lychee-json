package io.github.lychee.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutableCountData.class)
@JsonDeserialize(as = ImmutableCountData.class)
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

	@JsonProperty("import")
	int _import();

	int me();
}
