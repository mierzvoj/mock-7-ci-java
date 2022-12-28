package org.example;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.createMock;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingEasyMock {
    Client client1 = new Client("client1");
    Message message1 = new Message("this is test");
    RaceResultService raceResultService = createMock(RaceResultService.class);

    @Test
    public void testingServiceAddClient() {
        raceResultService.addSubscriber(client1);

    }

    @Test
    public void testMessageService() {
        client1.receive(message1);
        assertTrue(client1.receive(message1));
    }

}
