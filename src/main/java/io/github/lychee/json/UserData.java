package io.github.lychee.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.lychee.json.value.Title;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Immutable
@Value.Style(visibility = ImplementationVisibility.PACKAGE, overshadowImplementation = true)
@JsonSerialize(as = ImmutableUserData.class)
@JsonDeserialize(as = ImmutableUserData.class)
public interface UserData {
	String id();

	String username();

	boolean online();

	PerfsData perfs();

	int createdAt();

	boolean disabled();

	boolean tosViolation();

	ProfileData profile();

	int seenAt();

	boolean isPatron();

	PlaytimeData playTime();

	String language();

	Title title();

	String url();

	String playing();

	/**
	 * Number of following users.
	 */
	int nbFollowing();

	/**
	 * Number of followers.
	 */
	int nbFollowers();

	int completionRate();

	CountData data();

	boolean streaming();

	boolean followable();

	boolean following();

	boolean blocking();

	boolean followsYou();
}
