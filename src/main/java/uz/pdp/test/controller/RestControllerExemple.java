package uz.pdp.test.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.test.payload.ReqUser;
import uz.pdp.test.payload.ResUser;

import javax.websocket.server.PathParam;
@RestController
public class RestControllerExemple {
    private Object reqUser;

    @GetMapping("rest")
    public String getRest(){
        return "hello";
    }
    @GetMapping("rest/object/{name}")
    public ResUser getRestObject(@PathVariable(value = "name") String name,
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
    @PatchMapping("patch/{id}")
    public String editField(@PathVariable (value = "id") String id,@RequestBody ReqUser reqUser){
        return reqUser.toString()+"id"+id;
    }
    @DeleteMapping("delete/{id}")
    public String deleteElement(@PathVariable(value = "id") String id){
        return id;
    }
}
