/*
 *    Copyright 2021 Lychee-Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.lychee.json;

import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutablePerfsData.class)
@JsonDeserialize(as = ImmutablePerfsData.class)
public interface PerfsData {
	Optional<PerfData> chess960();

	Optional<PerfData> atomic();

	Optional<PerfData> racingKings();

	Optional<PerfData> ultraBullet();

	Optional<PerfData> blitz();

	Optional<PerfData> kingOfTheHill();

	Optional<PerfData> correspondence();

	Optional<PerfData> horde();

	Optional<PerfData> puzzle();

	Optional<PerfData> classical();

	Optional<PerfData> bullet();

	Optional<PerfData> rapid();

	Optional<StormPerfData> storm();
}
