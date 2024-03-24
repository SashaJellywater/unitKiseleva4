package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {
    @Test
    public void testProcessData(){
        Database database = mock(Database.class);

        when(database.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));
        DataProcessor dataProcessor = new DataProcessor(database);
        List<String> resultSize = dataProcessor.processData("SELECT * FROM table");
        assertEquals(3, resultSize.size());
    }






}