package example.controller;

import example.model.Armor;
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
@RequestMapping("/armors")
public class ArmorController {

  @Autowired
  private GenericService<Armor> itemService;

  @GetMapping(value = "/name/{val}")
  public String getByName(@PathVariable("val") String val) {
      return itemService.findByField(Armor.class, "name", val).toString();
  }

  @GetMapping("/")
  public String getAllArmors()
  {
    StringBuilder sb = new StringBuilder();
    for ( Armor w : itemService.findAll(Armor.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
