package org.example;

import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class TestingMockito {

    Client client1 = new Client("client1");
    Message message1 = new Message("this is test");
    @Mock
    RaceResultService raceResultService = mock(RaceResultService.class);


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
