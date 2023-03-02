package bak_lab1_var2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Launch {

    
    public static void main(String[] args) {
        
        Drone4 drone4 = new Drone4("простой",false,"ARF",15);
        System.out.println(drone4);
        Drone4 drone4_1 = new Drone4("профессиональный",true,"RTF",30);
        System.out.println(drone4_1);
        Drone4 drone4_2 = new Drone4("универсальный",true,"BNF",35);
        System.out.println(drone4_2);
        Drone4 drone4_3 = new Drone4("любительский",false,"PNP",20);
        System.out.println(drone4_3);
        Drone4 drone4_4= new Drone4("гоночный",true,"RTF",100);
        System.out.println(drone4_4);
        
        System.out.println("------------------------------");
        
        List<Drone4> droneList = new ArrayList<>();
        HashSet<Drone4> droneSet = new HashSet<>();
        HashMap<Integer, String> droneMap; 
        droneMap = new HashMap<>();
      
        droneList.add(drone4);
        droneList.add(drone4_1);
        droneList.add(drone4_2);
        droneList.add(drone4_3);
        droneList.add(drone4); //список позволяет добавить один и тот же контакт дважды
        
        int droneListLength = droneList.size();
        System.out.println("Количество элементов в списке: " + droneListLength); //запрос количества элементов в списке

        System.out.println("Список после удаления первого элемента:");

        droneList.remove(0); //удаление первого элемента списка (первый и последний элементы - повторяющийся контакт)
        for (Drone4 element : droneList) {
            System.out.println(element.getType()); //вывод списка с учетом удаления первого элемента
        }
        System.out.println(" ");
        System.out.println("Список после изменения последнего элемента:");

        droneList.set(3, drone4_4);

        for (Drone4 element : droneList) {
            System.out.println(element.getType()); //вывод списка с учетом изменения последнего элемента
        }
        
        for (int i = 0; i < droneListLength; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        
        droneSet.add(drone4);
        droneSet.add(drone4_1);
        droneSet.add(drone4_2);
        droneSet.add(drone4_3);
        droneSet.add(drone4_1); //во множестве не учитываются повторяющиеся элементы 
        System.out.println("Количество элементов во множестве: " + droneSet.size()); //запрос количества элементов во множестве
        System.out.println("Элементы множества:");
        for (Drone4 element : droneSet) {
            System.out.println(element.isCamera() + " " + element.getType());
        }
        
        
        droneSet.remove(drone4);//удаление первого элемента множества
        System.out.println("Элементы множества после удаления первого элемента:");
        for (Drone4 element : droneSet) {
            System.out.println(element.isCamera()+ " " + element.getType()); //вывод множества с учетом удаления первого элемента
        }
        
        System.out.println("------------------------------");

        System.out.println("Элементы ассоциативного массива:");
    
        droneMap.put(20, "простой");
        droneMap.put(95, "гоночный");
        droneMap.put(40, "профессиональный");
        
        String droneType = droneMap.get(20); //вывод элемента массива по номеру (ключу)
        System.out.println(droneType);

        droneMap.remove(40); //удаление первого элемента массива
        System.out.println(droneMap);
                             
        
   
    }
    
}
