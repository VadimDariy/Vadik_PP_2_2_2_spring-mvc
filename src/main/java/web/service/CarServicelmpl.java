package web.service;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServicelmpl implements CarService {

    public static List<Cars> carsList = new ArrayList<>();

    {
        carsList.add(new Cars(111, "V4", "Nissan"));
        carsList.add(new Cars(124, "V6", "Merseder-Benz"));
        carsList.add(new Cars(854, "V4", "Niva"));
        carsList.add(new Cars(547, "V5", "Volvo"));
        carsList.add(new Cars(366, "V8", "Jeep"));
    }

    @Override
    public List<Cars> carsList(int count) {
        if (count == 0 || count > 5) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());

    }
}

/*  carsList.stream().limit(count).collect(Collectors.toList());
     эта строка выполняет операцию ограничения количества элементов в коллекции carsList до count и возвращает список из
     первых count элементов из исходной коллекции.
        - stream() - создаёт из коллекции поток элементов для обработки;
        - limit(count) - возвращает ограниченное колличество элементов в диапозоне от начала потока до "count";
        - collect(Collectors.toList()) - этот метод завершает обработку потока и создает новый список, в который
          собираются элементы из потока. В данном случае, он возвращает список, содержащий элементы из исходного потока,
          и этот список становится результатом выполнения кода.


        */