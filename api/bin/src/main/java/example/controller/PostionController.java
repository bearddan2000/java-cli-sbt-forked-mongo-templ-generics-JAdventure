package example.controller;

import example.model.Postion;
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
@RequestMapping("/postions")
public class PostionController {

  @Autowired
  private GenericService<Postion> itemService;

  @GetMapping(value = "/name/{val}")
  public String getByName(@PathVariable("val") String val) {
      return itemService.findByField(Postion.class, "name", val).toString();
  }

  @GetMapping("/")
  public String getAllPotions()
  {
    StringBuilder sb = new StringBuilder();
    for ( Postion w : itemService.findAll(Postion.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
