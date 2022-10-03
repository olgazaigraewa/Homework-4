public class Main {
       public static void main(String[] args) {
           // Домашнее задание 1
        //Задание 1
        System.out.println("Задание 1");
        int age = 19;
        if (age  >= 18) {
            System.out.println(" Поздравляем с совершеннолетием!");
        }
        if (age  < 18) {
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать ");
        }
        //Задание 2
        System.out.println("Задание 2");
        if (age >= 7  && age < 18 )  {
            System.out.println(" Ребенок ходит в школу ");
        }
        if (age >= 18 && age < 24)  {
            System.out.println(" Человек ходит в университет ");
        }
        if (age >= 24) {
            System.out.println(" Человек ходит на работу ");
        }

        //Задание 3
        System.out.println("Задание 3");
           int capasity = 102;
           int seating = 60;
           int standing = capasity - seating;  //стоячие места

           int seatsUsed = 30;
           int otherUsed = 20;
           if (seatsUsed < seating)  {
               System.out.println(" Есть ещё " +  (seating  - seatsUsed) + " сидячих мест ");
           }
           if (otherUsed < standing)  {
               System.out.println(" Есть ещё " +  (standing - otherUsed) + " стоячих мест ");
           }


            //Домашнее задание 2

           //Задание 1
           System.out.println("Задание 1");
           if (age  >= 18) {
               System.out.println(" Поздравляем с совершеннолетием!");
           } else {
               System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать ");
           }
           //Задание 2
           System.out.println("Задание 2");
           if (age >= 7  && age < 18 )  {
               System.out.println(" Ребенок ходит в школу ");
           }
           else if (age >= 18 && age < 24)  {
               System.out.println(" Человек ходит в университет ");
           }
            else if (age >= 24) {
               System.out.println(" Человек ходит на работу ");
           }

           //Задание 3
           System.out.println("Задание 3");
            if (seatsUsed < seating)  {
               System.out.println(" Есть ещё " +  (seating  - seatsUsed) + " сидячих мест ");
           }else {
               System.out.println(" Сидячих мест нет ");
           }
               if (otherUsed < standing) {
                   System.out.println(" Есть ещё " + (standing - otherUsed) + " стоячих мест ");
               } else {
                   System.out.println(" Стоячих мест нет ");
               }

               //Домашнее задание 3
           //Задание 1
           System.out.println("Задание 1");
           if (age >= 2   && age <= 6)  {
               System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в детский сад ");
           }
           else if (age >6 && age <= 18)  {
               System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в школу ");
           }
           else if  (age >18 && age <= 24)  {
               System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в университет ");
           }
           else if  (age > 24) {
               System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить на работу ");
           }

           //Задание 2
           System.out.println("Задание 2");
           if (age < 5) {
               System.out.println(" Ребёнок не может кататься на аттракционе ");
           } else if (age < 14)  {
               System.out.println(" Ребёнок может кататься на аттракционе только в сопровождении взрослого ");
           } else {
               System.out.println(" Ребёнок может кататься на аттракционе ");
           }

           //Задание 3
           System.out.println("Задание 3");
           int one = 10;
           int two = 100;
           int three =200;
           if (one > two) {
               if (one >= three) {
                   System.out.println(" Mаксимальное число - " + one);
               } else {
                   System.out.println(" Mаксимальное число - " + three);
               }
           }else if (two > one) {
               if (two >= three) {
                   System.out.println(" Mаксимальное число - " + two);
               } else {
                   System.out.println(" Mаксимальное число - " + three);
               }
           } else {
               if (one > three) {
                   System.out.println(" Mаксимальное число - " + one);
               } else if (three > one) {
                   System.out.println(" Mаксимальное число - " + three);
               } else {
                   System.out.println(" Все три числа равны ");
               }



           }




       }
}











