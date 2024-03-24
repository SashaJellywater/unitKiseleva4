package seminars.fourth.weather;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {
    @Test
    public void testWeatherReporter(){
        WeatherService mockWeatherService = mock(WeatherService.class);

        when(mockWeatherService.getCurrentTemperature()).thenReturn(30);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);

        String report = weatherReporter.generateReport();

        assertEquals("Текущая температура: 30 градусов.", report);
    }
}