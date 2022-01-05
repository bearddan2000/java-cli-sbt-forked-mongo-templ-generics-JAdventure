package example.controller;

import example.model.Weapon;
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
@RequestMapping("/weapons")
public class WeaponController {

  @Autowired
  private GenericService<Weapon> itemService;

  @GetMapping(value = "/name/{val}")
  public String getByName(@PathVariable("val") String val) {
      return itemService.findByField(Weapon.class, "name", val).toString();
  }

  @GetMapping("/")
  public String getAllWeapons()
  {
    StringBuilder sb = new StringBuilder();
    for ( Weapon w : itemService.findAll(Weapon.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
