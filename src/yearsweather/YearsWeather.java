/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearsweather;

import java.util.Random;

/**
 *
 * @author Vladimir
 */
public class YearsWeather {
    static enum Month{
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int min = -30, max = 35, dayInMonth = 0;
        int[][] yearsWeather = new int[12][];
        //Проходим в цикле по месяцам года
        for (int i = 0; i < 12; i++) {
            //Задаем диапазоны по температуре и длину месяцев в днях
            switch (i) {
                 case 0: min= -30; max = -5; dayInMonth = 31; break;
                 case 1: min= -25; max =  5; dayInMonth = 31; break;
                 case 2: min= -25; max = 15; dayInMonth = 31; break;
                 case 3: min=  -5; max = 20; dayInMonth = 31; break;
                 case 4: min=  5;  max = 25; dayInMonth = 31; break;
                 case 5: min=  10; max = 35; dayInMonth = 31; break;
                 case 6: min=  10; max = 30; dayInMonth = 31; break;
                 case 7: min=  0;  max = 20; dayInMonth = 31; break;
                 case 8: min= -5;  max = 15; dayInMonth = 31; break;
                 case 9: min= -10; max = 10; dayInMonth = 31; break;
                 case 10: min= -20; max = 5; dayInMonth = 31; break;
                 case 11: min= -30; max = 0; dayInMonth = 31; break;
            }
            // Создаем внутренний массив длиной равной количеству дней в месяце
             yearsWeather[i]  = new int[dayInMonth];
            // Инициируем дни месяца температурой в заданном диапазоне
            for (int j = 0; j < dayInMonth; j++) {
                yearsWeather[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        
        // Выводим в консоль полученный зубчатый массив с погодой по дням.
        System.out.print("                                                    ");
        System.out.println("Погода по дням за год");
        System.out.println();
        System.out.print("          ");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d",i+1);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < yearsWeather.length; i++){
            System.out.printf("%8s: ",Month.values()[i]);
            for (int j = 0; j < yearsWeather[i].length; j++) {
                System.out.printf("%4d",yearsWeather[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
    
}
                 
                 

            
                
           