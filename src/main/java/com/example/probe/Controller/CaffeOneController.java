package com.example.probe.Controller;


import com.example.probe.Entity.Caffe;
import com.example.probe.Service.CaffeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/api/caffe")
@RestController
public class CaffeOneController {
private  final CaffeService caffeService;

    @GetMapping("/all")
        public  java.util.List<Caffe> getAllCaffe1(){return caffeService.getAllCaffe();}
    @GetMapping ("/caffe{id}")
    public Caffe getCaffeById(@PathVariable Long id){return caffeService.getCaffeById(id);}
    @PostMapping ("/new-caffe")
    public Caffe createCaffe(@RequestBody Caffe caffe){return caffeService.createCaffe(caffe);}
    @PutMapping("/update{id}")
    public Caffe updateCaffe(@PathVariable Long id, @RequestBody Caffe updateCaffe){return caffeService.updateCaffe(id, updateCaffe);}
    @DeleteMapping("/delete{id}")
    public void deleteCaffe(@PathVariable Long id){
        caffeService.deleteCaffe(id);}

}
