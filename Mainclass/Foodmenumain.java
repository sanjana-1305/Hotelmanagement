package Mainclass;
import Parentclass.Foodmenu;
import Subclass.*;

import java.util.Scanner;

import Billing.Bill.Bill;
import Billing.Bill.Food;


public class Foodmenumain {
    public static void main(String[] args) {

        System.out.println("Welcome to ABC Restaurent");
        System.out.println("ABC Family Welcomes You");



        System.out.println("Grab the food You want!!");
        System.out.println("Choose 1 to see options in Dosa");
        System.out.println("Choose 2 to see options in Idli");
        System.out.println("Choose 3 to see options in Chinese");
        System.out.println("Choose 4 to see options in Meals");
        System.out.println("Choose 5 to see options in Roti");
        System.out.println("Choose 6 to see options in Curry");
        System.out.println("Choose 7 to see options in Riceitems");
        System.out.println("Choose 8 to see options in Deserts and Icecreams");


       
        System.out.println("Please enter your choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();


       
        
        
        
        
        
        
        
        

        

        
        
        
        
        

        
        

        
        switch(choice){
            case 1:
            System.out.println("Here are your Dosa options");
            System.out.println("Please enter your choice for dosa");
            Scanner s=new Scanner(System.in);
            int ch=s.nextInt();
           
            switch(ch){
            
            case 1:
            Foodmenu f=new Subclass.Dosas.Gheepudidosa();
            f.foodname("Gheepudidosa");
            f.cost(60);
            f.category("Dosa");
            break;
            case 2:
        Foodmenu f1=new Subclass.Dosas.Masaladosa();
        f1.foodname("Masaladosa");
            f1.cost(70);
            f1.category("Dosa");
            break;
            case 3:
        Foodmenu f2=new Subclass.Dosas.Oniondosa();
        f2.foodname("Oniondosa");
            f2.cost(40);
            f2.category("Dosa");
            break;
            case 4:
        Foodmenu f3=new Subclass.Dosas.Paperdosa();
        f3.foodname("Paperdosa");
            f3.cost(80);
            f3.category("Dosa");
            break;
            case 5:
        Foodmenu f4=new Subclass.Dosas.Pesarattu();
        f4.foodname("Pesarattu");
            f4.cost(50);
            f4.category("Dosa");
            break;
            case 6:
        Foodmenu f5=new Subclass.Dosas.Setdosa();
            f5.foodname("SetDosa");
            f5.cost(50);
            f5.category("Dosa");
            break;
            default:System.out.println("Please enter valid option");
            
            break;

            

            
        

            


            

           
        }
            


            break;
        
            
            case 2:
            System.out.println("Here are your Idli options");
            System.out.println("Please enter your choice for Idli");
            Scanner s1=new Scanner(System.in);
            int ch1=s1.nextInt();
         
            switch(ch1){
           case 1:
            Foodmenu f6=new Subclass.Idli.Buttonidli();
            f6.foodname("GheepudiIdli");
            f6.cost(50);
            f6.category("Idli");
            break;
            case 2:
        Foodmenu f7=new Subclass.Idli.Gheepudidli();
        f7.foodname("NormalIdli");
            f7.cost(20);
            f7.category("Idli");
            break;
            case 3:
        Foodmenu f8=new Subclass.Idli.Normalidli();
        f8.foodname("Tatteidli");
            f8.cost(30);
            f8.category("Idli");
            break;
            case 4:
        Foodmenu f9=new Subclass.Idli.Tatteidli();
              f9.foodname("Buttonidli");
            f9.cost(40);
            f9.category("Idli");
           break;
           default:System.out.println("Please enter valid choice");
           break;
            }
            

            
           

            
            
           
           
            break;


            case 3:
               System.out.println("Here are your Rice items options");
            System.out.println("Please enter your choice for Rice items");
            Scanner s2=new Scanner(System.in);
            int ch2=s2.nextInt();
           
            switch(ch2){
                case 1:
            Foodmenu f10=new Subclass.Riceitems.Pulao();
            f10.foodname("Pulao");
            f10.cost(30);
            f10.category("Riceitems");
            break;
            case 2:
        Foodmenu f11=new Subclass.Riceitems.Pongal();
        f11.foodname("Pongal");
            f11.cost(40);
            f11.category("Riceitems");
            break;
            case 3:
        Foodmenu f12=new Subclass.Riceitems.Gheerice();
           f12.foodname("Gheerice");
            f12.cost(70);
            f12.category("Riceitems");
            break;
            case 4:
        Foodmenu f13=new Subclass.Riceitems.Bisibelebath();
        f13.foodname("Bisibelebath");
            f13.cost(50);
            f13.category("Riceitems");
            break;
            case 5:
        Foodmenu f14=new Subclass.Riceitems.Friedrice();
            f14.foodname("Friedrice");
            f14.cost(60);
            f14.category("Riceitems");
          break;
          default:System.out.println("Please enter valid choice");
          break;
            }
            
            

            
            

            
            

            
          

            

            break;

            case 4:
                System.out.println("Here are your Chinese options");
            System.out.println("Please enter your choice for Chinese");
            Scanner s3=new Scanner(System.in);
            int ch3=s3.nextInt();
    
            switch(ch3){
                case 1:
            Foodmenu f15=new Subclass.Chinese.Babycornmanchuri();
            f15.foodname("Babycornmanchuri");
            f15.cost(30);
            f15.category("Chinese");
            break;
            case 2:
        Foodmenu f16=new Subclass.Chinese.Gobimanchuri();
        f16.foodname("Gobimanchuri");
            f16.cost(60);
            f16.category("Chinese");
           break;
           case 3:
        Foodmenu f17=new Subclass.Chinese.Schzwannoodles();
        f17.foodname("Schezwannoodles");
            f17.cost(80);
            f17.category("Chinese");
            break;
            case 4:
        Foodmenu f18=new Subclass.Chinese.Vegnoodles();

            f18.foodname("Noodles");
            f18.cost(50);
            f18.category("Chinese");
             break;
             default:System.out.println("Please enter valid choice");
             break;
            }

            


            
          


            

            break;


            case 5:
              System.out.println("Here are your Meals options");
            System.out.println("Please enter your choice for Meals");
            Scanner s4=new Scanner(System.in);
            int ch4=s4.nextInt();
           
            switch(ch4){
                case 1:
            Foodmenu f19=new Subclass.Meals.NorthIndian();
            f19.foodname("NorthIndian");
            f19.cost(150);
            f19.category("Meals");
            break;
            case 2:
        Foodmenu f20=new Subclass.Meals.SouthIndian();
            f20.foodname("SouthIndian");
            f20.cost(200);
            f20.category("Meals");
          break;
            }
            

            

            break;

            case 6:
                    System.out.println("Here are your Kulcha options");
            System.out.println("Please enter your choice for Kulcha");
            Scanner s5=new Scanner(System.in);
            int ch5=s5.nextInt();
           
            switch(ch5){
                case 1:
            Foodmenu f21=new Subclass.Roti.Butterkulcha();
            f21.foodname("Butterkulcha");
            f21.cost(20);
            f21.category("Roti");
            break;
            case 2:
        Foodmenu f22=new Subclass.Roti.Butternaan();
        f22.foodname("Butternaan");
            f22.cost(20);
            f22.category("Roti");
            break;
            case 3:
        Foodmenu f23=new Subclass.Roti.Roti();
            f23.foodname("Roti");
            f23.cost(20);
            f23.category("Roti");
              break;
              default:System.out.println("Please enter valid choice");
              break;
            }
           

            

            break;

            case 7:
            System.out.println("Here are your Gravy options");
            System.out.println("Please enter your choice for Gravy");
            Scanner s6=new Scanner(System.in);
            int ch6=s6.nextInt();
           
            switch(ch6){
                case 1:
            Foodmenu f24=new Subclass.Curry.Chanamasala();
            f24.foodname("Channamasala");
            f24.cost(200);
            f24.category("Curry");
            break;
            case 2:
        Foodmenu f25=new Subclass.Curry.Cornpalak();
        f25.foodname("Corn Palak");
            f25.cost(330);
            f25.category("Curry");
            break;
            case 3:
        Foodmenu f26=new Subclass.Curry.Palakpaneer();
        f26.foodname("Palak Paneer");
            f26.cost(350);
            f26.category("Curry");
           break;
           case 4:
        Foodmenu f27=new Subclass.Curry.Paneerbuttermasala();
             f27.foodname("Pannerbutter masala");
            f27.cost(300);
            f27.category("Curry");
            break;
            default:System.out.println("Please enter valid choice");
            break;
            }

            

            

            


            
            

            break;

            case 8:
            System.out.println("Here are your Desserts and juices options");
            System.out.println("Please enter your choice for Desserts and Juices");
            Scanner s7=new Scanner(System.in);
            int ch7=s7.nextInt();
      
            switch(ch7){
                case 1:
            Foodmenu f28=new Subclass.DessertsandJuices.Icecreams();
            f28.foodname("Desserts-jamun,Burfi,Rasmalai,Carrothalwa Icecreams-Mango,vannila,choclate,Pineapple");
            f28.cost(100);
            f28.category("Desserts and Icecreams");
            break;
            case 2:
        Foodmenu f29=new Subclass.DessertsandJuices.Juices();
              f29.foodname("Juices-Mango,orange,lichi,pineapple,grape,watermelon Milkshake-Vanilla,Orio,Chockalate,Straberry");
            f29.cost(200);
            f29.category("Juices and Milkshake");
                 break;
                 default:System.out.println("Please enter valid choice");
                 break;
            }
              
              

           


            



            
        
            

            break;




















            default:
            System.out.println("Please enter valid one");


        }
        
       
      System.out.println("**BILLING**");
       
       System.out.println("Enter the quantity");
       Scanner scc=new Scanner(System.in);
       int quan=scc.nextInt();
       
       System.out.println("Enter the Cost");
       int cost=scc.nextInt();
  
        int total=quan*cost;
        System.out.println("The total cost is" +total);
        
        

        System.out.println("Thank u visit again!!!");

        
        

        }
    }


