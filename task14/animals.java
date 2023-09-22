package Итог;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class animals {
    protected String name;
    protected String dataOfBrith;
    protected String breed; // домашие или вьючные 
    protected String species; // собака, верблюд или что-то такое 
    
    protected String getName(){
        return this.name;
    }

    protected String getDataOfBrith(){
        return this.dataOfBrith;
    } 

    protected String getSpecies(){
        return this.species;
    }

    protected animals(String name, String dataOfBrith, String species){
        this.name = name;
        this.dataOfBrith = dataOfBrith;
        this.species = species;
        if (species.toLowerCase() == "лошадь" || 
                species.toLowerCase() == "верблюд" ||
                species.toLowerCase() == "осел")
            this.breed = "вьючное животное";
        else if (species.toLowerCase() == "собака" || 
                    species.toLowerCase() == "кошка" ||
                    species.toLowerCase() == "хомяк")
            this.breed = "домашнее животное";
        
    }

}

class ListAnimals<T extends animals>{
    List<T> la;
    public T item;
    public int count = 0;
    
    public void addList(T item){
        la.add(item);
        this.count++;
    }

    public void creationList(){
        this.la = new ArrayList<>();
    }

    public void getListAnimals(){
        for (T item: la){
            System.out.println(item);
        }
    }


}



