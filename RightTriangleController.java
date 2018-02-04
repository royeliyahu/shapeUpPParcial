package com.royE.ShapeUp.Shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RightTriangleController {

    @Autowired
    private RightTriangleService rightTriangleService;

    @RequestMapping(method = RequestMethod.POST, value = "/rightTriangle")
    public void addRightTriangle(@RequestBody RightTriangle rightTriangle){
        rightTriangleService.addRightTriangle(rightTriangle);
    }

    @RequestMapping("/rightTriangle")
    public List<RightTriangle> getAllRightTriangles(){
        return rightTriangleService.getAllRightTriangles();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rightTriangle/{id}")
    public RightTriangle getRightTriangle( @PathVariable Integer id){
        return rightTriangleService.getRightTrianglesById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/rightTriangle/{id}")
    public void updateRightTriangle(@RequestBody RightTriangle rightTriangle, @PathVariable Integer id){
        rightTriangleService.updateRightTriangle(id, rightTriangle);
    }

}
