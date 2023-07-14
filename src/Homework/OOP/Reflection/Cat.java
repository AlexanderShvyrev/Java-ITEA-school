package Homework.OOP.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Cat {
    public static void main(String[] args) {
        Animal animal = new Animal("mammal", "Sharik");
        Field[] fields = Animal.class.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);

            try {
                if( field.getName().equals("type")){
                    field.set(animal, "not a mammal");
                }else if(field.getName().equals("name")){
                    field.set(animal, "Bobik");
                }else if(field.getName().equals("AGE")){
                    Field mod = Field.class.getDeclaredField("modifiers");
                    mod.setAccessible(true);
                    mod.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                    field.set(null, 5);
                }
            }catch(IllegalAccessException | NoSuchFieldException e){
                e.printStackTrace();
            }
        }
        System.out.println("New animal: ");
        System.out.println("Type: " + animal.getType());
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + Animal.getAge());
    }
}
