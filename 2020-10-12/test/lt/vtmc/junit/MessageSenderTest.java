package lt.vtmc.junit;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class MessageSenderTest {

	@Test
	void getConnectionShouldFasterThenOneSecond() {
		assertTimeout(Duration.ofMillis(1000), () -> {
			MessageSender.getConnection();
		});
	}

}
