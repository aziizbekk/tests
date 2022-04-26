package uz.pdp.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.payload.ReqUser;
import uz.pdp.payload.ResUser;

import javax.websocket.server.PathParam;
import java.util.HashMap;

@RestController
public class RestControllerExample {
    @GetMapping("rest")
    public String getRest(){
        return "hello";
    }
    @GetMapping("rest/object/{name}")
    public ResUser getRestObject(@PathVariable (value = "name") String name,
                                 @PathParam(value = "firstName ") String firstName,
                                 @PathParam(value = "surName ") String surName
    ){
        ResUser resUser  = new ResUser();
        resUser.setFirstName(firstName);
        resUser.setLastName(surName);
        resUser.setFullName(firstName+ " "+ surName);
        return resUser;
   // HashMap<String,String> stringStringHashMap = new HashMap<String,String>(){{
     //   put ("name",name);
    //}};
      //  stringStringHashMap.put("fulName",firstName + " "+surName );
   // return resUser;
}
    @PostMapping("post")
    public String saveUser(@RequestBody ReqUser reqUser){
        return reqUser.toString();
    }
    @PutMapping("put")
    public String editUser(@RequestBody  ReqUser reqUser){
        return reqUser.toString();
    }
    @PatchMapping("patch/{id})
}
