package example.controller;

import example.model.Food;
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
@RequestMapping("/foods")
public class FoodController {

  @Autowired
  private GenericService<Food> itemService;

  @GetMapping(value = "/name/{val}")
  public String getByName(@PathVariable("val") String val) {
      return itemService.findByField(Food.class, "name", val).toString();
  }

  @GetMapping("/")
  public String getAllFoods()
  {
    StringBuilder sb = new StringBuilder();
    for ( Food w : itemService.findAll(Food.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
