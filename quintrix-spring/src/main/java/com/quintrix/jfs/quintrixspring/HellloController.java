package com.quintrix.jfs.quintrixspring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quintrix.jfs.quintrixspring.models.Car;
@RestController
public class HellloController {
	
	//List<Car> carsList =  new ArrayList<>(Arrays.asList)(new Car(1, "Ford", "SUV", 2011), new Car(2L, "Honda", "SUV", 2005), new Car(3L, "Volvo", "Truck", 2015)));
	
	@RequestMapping("/")
	String Hello() {
		//Car car = new Car(1L, "Ford", "SUV", 2011);
		return "Hello World, SpringBoot";
	}
}
