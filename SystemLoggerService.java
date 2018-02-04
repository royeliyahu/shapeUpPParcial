package com.royE.ShapeUp.SystemLogger;

import com.royE.ShapeUp.Shapes.RightTriangle;
import com.royE.ShapeUp.Shapes.RightTriangleService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SystemLoggerService{

    @Autowired
    private RightTriangleService rightTriangleService;

    private static final Logger logger = LoggerFactory.getLogger(SystemLoggerService.class);

    public void addTrianle(RightTriangle rightTriangle){
        logger.info("adding new right triangle: " + rightTriangle.toString());

    }

    public void updateTriangle(RightTriangle rightTriangle){
        logger.info("updating  right triangle with ID: " + rightTriangle.getId() + ".\nnew data: " + rightTriangle.toString());

    }

    @Scheduled(fixedRate = 5000)
    public void updateEntityCount(){
        long count = rightTriangleService.countAllRightTriangles();
        logger.info("total right triangle count: " + count);
        System.err.println("total right triangle count: " + count);
    }
}
