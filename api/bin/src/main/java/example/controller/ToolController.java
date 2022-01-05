package example.controller;

import example.model.Tool;
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
@RequestMapping("/tools")
public class ToolController {

  @Autowired
  private GenericService<Tool> itemService;

  @GetMapping(value = "/name/{val}")
  public String getByName(@PathVariable("val") String val) {
      return itemService.findByField(Tool.class, "name", val).toString();
  }

  @GetMapping("/")
  public String getAllTools()
  {
    StringBuilder sb = new StringBuilder();
    for ( Tool w : itemService.findAll(Tool.class) ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
