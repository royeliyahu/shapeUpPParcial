package com.royE.ShapeUp.Algo;

import com.royE.ShapeUp.Shapes.RightTriangle;
import com.royE.ShapeUp.Shapes.RightTriangleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgoService{

    @Autowired
    private RightTriangleService rightTriangleService;

    private static final Logger logger = LoggerFactory.getLogger(RightTriangleService.class);

    @Scheduled(fixedRate = 5000)
    public void updateHypotenuse() {
        logger.info("updateHypotenuse");
        System.err.println("updateHypotenuse");
        List<RightTriangle> hypotenuseLessTriangles = rightTriangleService.getRightTrianglesByState(false);
        if (hypotenuseLessTriangles.size() > 0) {
            hypotenuseLessTriangles.stream().forEach(rightTriangle -> {
                double hypotenuse = Math.hypot(rightTriangle.getFirstEdge(), rightTriangle.getSecondEdge());
                rightTriangle.setHypotenuse(hypotenuse);
                rightTriangle.setHypotenuseCalculationState(true);
                rightTriangleService.updateRightTriangle(rightTriangle.getId(),rightTriangle);
            });
        }
        else {
            logger.error("no triangles to updateHypotenuse");
            System.err.println("no triangles to updateHypotenuse");

        }
    }
}
