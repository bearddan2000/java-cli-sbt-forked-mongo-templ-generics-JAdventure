package example.controller;

import example.model.Location;
import example.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ragcrix
 */
@RestController
@RequestMapping("/locations")
public class LocationController {

  @Autowired
  private GenericService<Location> itemService;

  @GetMapping(value = "/coor/{val}")
  public String getByCoordinate(@PathVariable("val") String val) {
      return itemService.findByField(Location.class, "coordinate", val).toString();
  }

  @GetMapping("/")
  public String getAllLocations()
  {
    StringBuilder sb = new StringBuilder();
    for ( Location w : itemService.findAll(Location.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
