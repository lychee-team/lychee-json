package io.github.lychee.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutablePerfData.class)
@JsonDeserialize(as = ImmutablePerfData.class)
public interface PerfData {
	int games();

	int rating();

	int rd();

	int prog();

	int prov();
}
