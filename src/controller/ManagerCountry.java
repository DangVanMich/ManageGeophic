/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EastAsiaCountries;
import model.ListCountry;
import view.Menu;

/**
 *
 * @author admin
 */
public class ManagerCountry extends Menu<String>{

    private ListCountry list= new ListCountry();
    private ArrayList<EastAsiaCountries> list_eas;
    
    static String[] mc ={"Input the information of 11 countries in East Asia", "Display the information of country you've just input",
                                    "Search the information of country by user-entered name",
                                     "Display the information of countries sorted name in ascending order", "Exit"};
    
    public ManagerCountry(){
        super("---------------MENU----------------", mc);
    }
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list_eas= list.addCountry();
                break;
            case 2:
                list.displayList(list_eas);
                break;
            case 3:
                list.searchCountry();
                break;
            case 4:
                list.sortNameCountry();
                break;
            case 5:
                System.exit(0);           
        }
    }
    
    
}