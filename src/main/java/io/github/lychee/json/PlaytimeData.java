package io.github.lychee.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutablePlaytimeData.class)
@JsonDeserialize(as = ImmutablePlaytimeData.class)
public interface PlaytimeData {
	int total();

	int tv();
}
