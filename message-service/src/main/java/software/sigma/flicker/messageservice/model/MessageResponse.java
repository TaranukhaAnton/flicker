package software.sigma.flicker.messageservice.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Anton Taranukha
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class MessageResponse {

    private List<MessageDTO> content;
    private boolean first;
    private boolean last;
    private int numberOfElements;
    private int totalPages;
    private long totalElements;
    private int size;
    private int number;

}
