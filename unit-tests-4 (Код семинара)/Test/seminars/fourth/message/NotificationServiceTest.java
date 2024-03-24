package seminars.fourth.message;


import org.junit.jupiter.api.Test;
import org.junit.runner.notification.RunListener;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    public void testNotify(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Привет", "Анна");
        verify(messageService, times(1)).sendMessage("Привет", "Анна");
    }

}