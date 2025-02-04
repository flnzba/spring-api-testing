package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
	public String getWelcomeMessage() {
		return "Hi first String Message";
	}
}
