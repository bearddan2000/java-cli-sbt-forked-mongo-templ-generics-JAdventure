package example.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "locations")
public class Location {
    @Id
    private String id;

    private int danger;
    private String title;
    private String description;
    private String locationType;

    @Indexed
    private String coordinate;
    private List<String> items;
    private List<String> npcs;
}
