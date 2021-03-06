package by.ushau.Service.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PartResponse {
    private String partNumber;
    private String title;
    private Double price;
}
