package seedu.divelog.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateTimeBox extends UiPart<Region> {
    private static final String FXML = "dateTimeBox.fxml";

    @FXML
    private Label timeNow;



    public dateTimeBox() {
        super(FXML);
        loadTime();
        registerAsAnEventHandler(this);
    }

    private void loadTime(){
        /*ZonedDateTime utcZone = ZonedDateTime.now( ZoneOffset.UTC );
        ZoneId sgTime = ZoneId.of("Asia/Singapore");
        ZonedDateTime sgZone = utcZone.withZoneSameInstant(sgTime);
        LocalDateTime sgTimeNow = sgZone.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
        String finTime = sgTimeNow.format(formatter);*/
        String finTime = ZonedDateTime.now().toString();

        timeNow.setText("ABC");
    }

}
