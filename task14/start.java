package Итог;

import java.util.ArrayList;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        ListAnimals list = new ListAnimals();
        list.creationList();
        ArrayList<String> listCommands = new ArrayList<>(); 
        boolean booleanMenu = true;
        while(booleanMenu){
            int numberMenu = menu();
            switch (numberMenu) {
                case 1:
                    list.addList(inputAnimal());
                    System.out.println();
                    break;
                case 2:
                    boolean isEmpty = listCommands.isEmpty();
                    if (isEmpty)
                    System.out.println("/nКоманд нет");
                    else{
                        System.out.println("Список команд: ");
                        for (String command : listCommands) {
                            System.out.println(command);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("\nВведите новую команду для животного: ");
                    Scanner scanner = new Scanner(System.in);
                    String commands = scanner.nextLine();
                    listCommands.add(commands);
                    
                    break;
                case 4:
                    booleanMenu = false;
                    break;
            }
            
        }
    }

    public static int menu(){
        System.out.println(
            "\n1. Завести новое животное\n" + 
            "2. Список команд животных\n" + 
            "3. Обучение новым командам\n" + 
            "4. Выход\n");
        while(true){
            try{
                System.out.print("Введите номер из меню: ");
                Scanner scanner = new Scanner(System.in);
                int numberMenu = scanner.nextInt();
                if(numberMenu > 0 && numberMenu < 5)
                    return numberMenu;
                else
                    System.out.println("Введите номер из меню");
            
            } catch (Exception e){
                System.out.println("Введите номер из меню");
            }
        }
    }

    public static animals inputAnimal(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите кличку: ");
        String name = scanner.nextLine();
        System.out.print("\nВведите дату рождения животного: ");
        String dataOfBrith = scanner.nextLine();
        System.out.print("\nВведите класс животного: ");
        String species = scanner.nextLine();
        return new animals(name, dataOfBrith, species);

    }
}
