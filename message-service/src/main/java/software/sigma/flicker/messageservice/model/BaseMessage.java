package software.sigma.flicker.messageservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * Base Message entity.
 *
 * @author Anton Taranukha
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseMessage {

    @Id
    private String id;

    @Size(min = 3, max = 280)
    private String text;

    @Size(min = 3, max = 64)
    private String username;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime createdAt;

}
