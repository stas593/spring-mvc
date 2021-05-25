package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;

    public List<Car> getCars(int count){
        return count < 5 ? carDao.getCars(count) : carDao.getCars(carDao.getAllCars().size());
    }

    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

}
