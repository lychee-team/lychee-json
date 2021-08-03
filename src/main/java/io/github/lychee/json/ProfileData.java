package io.github.lychee.json;

import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public interface ProfileData {
	String country();

	String location();

	String bio();

	String firstName();

	String lastName();

	int fideRating();

	int uscfRating();

	int ecfRating();

	String links();
}
