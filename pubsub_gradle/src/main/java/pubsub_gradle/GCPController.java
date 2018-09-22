package pubsub_gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCPController {

	@Autowired
	PubsubOutboundGateway messageGatewuy;

	@RequestMapping(value = "/publish", method = RequestMethod.POST)
	public String publishMessage(@RequestBody GCPMessageModel message) {
		messageGatewuy.sendToPubsub(message.toString());
		return "Message published to Google Pub/Sub successfully";
	}
}
