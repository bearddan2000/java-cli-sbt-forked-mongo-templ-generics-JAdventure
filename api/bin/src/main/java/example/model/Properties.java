package example.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Properties {
  private Integer armor;
    private Integer damage;
    private Integer health;
    private Integer maxHealth;
    private Integer weight;
    private Integer value;

}
