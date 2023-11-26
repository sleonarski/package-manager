package com.orion.packagemanager.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalController {

    private final List<Animal> aList;

    public AnimalController() {
        Animal animal1 = new Animal("Laki", "Dog", 4);
        Animal animal2 = new Animal("Kotlet", "Cat", 4);
        Animal animal3 = new Animal("Hector", "Parrot", 2);
        Animal animal4 = new Animal("Ultra", "Dog", 3);
        Animal animal5 = new Animal("Bowen", "Donkey", 4);
        Animal animal6 = new Animal("Goldfish", "Nathaniel", 0);
        aList = new ArrayList<>();
        aList.add(animal1);
        aList.add(animal2);
        aList.add(animal3);
        aList.add(animal4);
        aList.add(animal5);
        aList.add(animal6);
    }

    @GetMapping("/animals")
    String showGreetings(Model model) {
//        model.addAttribute("name", "Orion");
        model.addAttribute("animalsList", aList);
        model.addAttribute("newAnimal", new Animal());
        return "animal";
    }

    @PostMapping("/add-animal")
    String addAnimal(@ModelAttribute Animal animal) {
        aList.add(animal);
        System.out.println(animal);
        return "redirect:animals";
    }
}
