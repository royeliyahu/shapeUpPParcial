package com.royE.ShapeUp.Shapes;

import com.royE.ShapeUp.SystemLogger.SystemLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RightTriangleService {


    //TODO:add the right repository  inMemeroy or DB

    @Autowired
    private RightTriangleRepository rightTriangleRepository;
    @Autowired
    private SystemLoggerService systemLoggerService;

    public void updateRightTriangle(int triangleId , RightTriangle rightTriangle) {
        rightTriangleRepository.save(rightTriangle);
        systemLoggerService.updateTriangle(rightTriangle);
    }


    public void addRightTriangle(RightTriangle newRightTriangle) {

        rightTriangleRepository.save(newRightTriangle);
        systemLoggerService.addTrianle(newRightTriangle);
    }

    public List<RightTriangle> getAllRightTriangles() {

        systemLoggerService.updateEntityCount();
        List<RightTriangle> rightTriangles = new ArrayList<>();
        rightTriangleRepository.findAll().forEach(rightTriangles::add);
        return rightTriangles;
    }

    public RightTriangle getRightTrianglesById(Integer id) {
        return rightTriangleRepository.findOne(id);
    }

    public List<RightTriangle> getRightTrianglesByState(boolean state) {
        List<RightTriangle> rightTriangles = new ArrayList<>();
        rightTriangleRepository.findAll().forEach(rightTriangle1 -> {
            if(rightTriangle1.getHypotenuseCalculationState().equals(state)){
                rightTriangles.add(rightTriangle1);
            }
        });
        return rightTriangles;
    }

    public long countAllRightTriangles() {

        List<RightTriangle> rightTriangles = new ArrayList<>();
        rightTriangleRepository.findAll().forEach(rightTriangles::add);
        return rightTriangles.stream().count();
    }

    public int countRightTrianglesById(Integer id) {
        RightTriangle rightTriangle = rightTriangleRepository.findOne(id);
        if(rightTriangle != null){
            return 1;
        }
        return 0;
    }

    public long countRightTrianglesByState(boolean state) {
        List<RightTriangle> rightTriangles = new ArrayList<>();
        rightTriangleRepository.findAll().forEach(rightTriangle1 -> {
            if(rightTriangle1.getHypotenuseCalculationState().equals(state)){
                rightTriangles.add(rightTriangle1);
            }
        });
        return rightTriangles.stream().count();
    }
}
