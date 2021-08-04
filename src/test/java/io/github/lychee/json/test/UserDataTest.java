package io.github.lychee.json.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.github.lychee.json.UserData;
import org.junit.jupiter.api.Test;

public class UserDataTest {
	@Test
	public void testUserData() throws IOException {
		String token = Optional.ofNullable(System.getProperty("lichess.token")).orElse(System.getenv("LICHESS_TOKEN"));
		if (token == null) {
			return;
		}
		ObjectMapper mapper = new ObjectMapper()
				.registerModule(new Jdk8Module());
		HttpURLConnection conn = (HttpURLConnection) new URL("https://lichess.org/api/account").openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Bearer " + token);
		conn.connect();
		UserData data = mapper.readValue(conn.getInputStream(), UserData.class);
		System.out.println(data.completionRate());
		System.out.println(data.createdAt());
		System.out.println(data.nbFollowers());
		System.out.println(data.nbFollowing());
		conn.disconnect();
	}
}
