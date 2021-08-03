package io.github.lychee.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutablePerfsData.class)
@JsonDeserialize(as = ImmutablePerfsData.class)
public interface PerfsData {
	PerfData chess960();

	PerfData atomic();

	PerfData racingKings();

	PerfData ultraBullet();

	PerfData blitz();

	PerfData kingOfTheHill();

	PerfData correspondence();

	PerfData horde();

	PerfData puzzle();

	PerfData classical();

	StormPerfData storm();
}
