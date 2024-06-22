import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Math;

class Main {
    //This method clears the screen for better user experience 
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    } 
    
    //This method is used for exercise 14
    public static double conversionFunc(double tempC){
        tempC = tempC*9/5+32;
        return tempC;
    }

    //This method is used for exercise 15
    public static void histogram(List<Integer> numList){
        //runs for the same as the length of the ArrayList
        for (int i = 0; i < numList.size(); i++){
            //runs for the same as the value within numlist, going up by one each time
            for (int j = 0; j < numList.get(i); j++){
                System.out.print("*");
            }
            //skips line
            System.out.println("");
        }
    }
    
    public static void exercise1(){
        clearScreen();
        System.out.println("This method divides 2 integers into full numbers. \n");
        //used for input
        Scanner input = new Scanner(System.in);
        int userNum01 = 0;
        int userNum02 = 0;
        //bulletproofed first input
        do{
            System.out.print("Enter your first integer: ");
            try{
                userNum01 = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Not an integer");
                continue;
            }
        } while (userNum01 == 0);
        //bulletproofed second input
        do{
            System.out.println("\nEnter your second integer: ");
            try{
                userNum02 = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Not an integer");
                continue;
            }
        } while (userNum02 == 0);
        //Prints out the final answer and does the math at the same time
        System.out.println("\nThe quotient of " + userNum01 + " and " + userNum02 + " is " + (int)Math.floor(userNum01/userNum02) + " with a remainder of " + userNum01%userNum02);
        
        System.out.println("\nThank you for trying exercise #1. ");
        
    }
    
    public static void exercise2(){
        clearScreen();
        System.out.println("This method takes 4 integers and displays the largest one. \n"); 
        //Initializes the 4 variables in the same line
        int w, x, y, z;
        //Assigns the value 0 to all the variables above
        w=x=y=z=0;
        Scanner input = new Scanner(System.in);
        //bulletproofed inputs:
        do{
            System.out.println("Enter the first int: ");
            try{
                w = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Input. ");
            }
        } while (w==0);
        do{
            System.out.println("Enter the second int: ");
            try{
                x = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Input. ");
            }
        } while (x==0);
        do{
            System.out.println("Enter the third int: ");
            try{
                y = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Input. ");
            }
        } while (y==0);
        do{
            System.out.println("Enter the fourth int: ");
            try{
                z = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Input. ");
            }
        } while (z==0);
        //Series of if statements that check for the biggest int
        if (w>x && w>y && w>z){
            System.out.println("The First interger ("+w+") is the largest value! ");
        }else if (x>w && x>y && x>z){
            System.out.println("The Second integer ("+x+") is the largest value! ");
        } else if (y>w && y>x && y>z){
            System.out.println("The Third integer ("+y+") is the largest value! ");
        } else if (z>w && z>x && z>y){
            System.out.println("The Fourth interger ("+z+") is the largest value! ");
        } else {
            System.out.println("Unexpected Error");
        }
        System.out.println("\nThank you for trying exercise 2.  \n");
    }
    
    public static void exercise3(){
        clearScreen();
        System.out.println("This method asks for the cost and provides an according discount. \n");
        
        Scanner input = new Scanner(System.in);
        //new double "cost" has a value of 0.0
        double cost = 0.0;
        //bulletproofed input
        do{
            System.out.println("What was the total amount of your purchase? ");
            try{
                cost = input.nextDouble();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        }while(cost==0.0);
        //Checks in which price range the purchase was, gives a discount accordingly 
        if (cost<0){
            System.out.println("Returns don't qualify. ");
        } else if (cost<25){
            System.out.println("Your cost is " + cost + ", your purchase does not qualify for a discount.");
        } else if (25<cost && cost<50){
            System.out.print("Your cost is $"+(double) Math.round((cost*0.9) * 100) / 100+" after a discount of 10%\n");
        } else if (50<cost && cost<75){
            System.out.print("Your cost is $"+(double) Math.round((cost*0.8) * 100) / 100+" after a discount of 20%\n");
        } else if (75<cost && cost<100){
            System.out.print("Your cost is $"+(double) Math.round((cost*0.7) * 100) / 100+" after a discount of 30%\n");
        } else if (cost>100){
            System.out.print("Your cost is $"+(double) Math.round((cost*0.6) * 100) / 100+" after a discount of 40%\n");
        } else {
            System.out.println("Invalid Price.");
        }
        
        System.out.println("\nThank you for trying exercise #3. ");
    }
    
    public static void exercise4(){
        clearScreen();
        System.out.println("This method asks for a percentage and provides an according letter grade. \n");
        
        Scanner input = new Scanner(System.in);
        int mark = 0;
        //bulletproofed user input
        do{
            System.out.println("What was your quiz mark? (0-10): ");
            try{
                mark = input.nextInt();
                break;
            }catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Inavlid Response. ");
            }
        }while(mark==0);
        //switch statement outputting different message based on user input
        switch (mark){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("LEVEL R: You have not met the expectation, see your teacher for a chance to try again. ");
                break;
            case 5:
                System.out.println("LEVEL 1: You passed, however you need to improve your knowledge. See your teacher for more details. ");
                break;
            case 6:
                System.out.println("LEVEL 2: You passed, your grade is satisfactory");
                break;
            case 7:
                System.out.println("LEVEL 3: You have achieved the expectation, good!");
                break;
            case 8: case 9: case 10:
                System.out.println("LEVEL 4: You have surpassed the expectation, congratulations!");
                break;
            //in case of bugs
            default:
                System.out.println("Unexpected Response. ");
        }
        
        System.out.println("Thank you for trying exercise #4. ");
    }
    
    public static void exercise5(){
        clearScreen();
        System.out.println("This method prints out specific integers using 4 different loops.\n");
        
        //The first loop (a)
        for (int i = 2; i<21; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        //The second loop (b)
        int i = 1;
        do{
            i++;
            System.out.print(i + " ");
        }while(i<20);
        System.out.println("");
        //The third loop (c)
        int count = 1;
        while (count<=20){
            System.out.print(count + " ");
            count++;
        }
        System.out.println("");
        //the fourth loop (d)
        int e = 20;
        do{
            System.out.print(e + " ");
            e--;
        }while(e>0);
        
        System.out.println("\n\nThank you for trying exercise 5. \n");
    }
    
    public static void exercise6(){
        clearScreen();
        System.out.println("This method counts the numbers of inputted words. ");
        //prints necessary information to user 
        System.out.println("Write \'quit\' or \'exit\' to stop counting. ");
        Scanner input = new Scanner(System.in);
        int i = 0;
        //'outer:' used to break out of do while instead of the switch
        outer: do {
            i++;
            boolean notAWord = false;
            System.out.println("Enter a word: ");
            String word = input.nextLine();
            //checks if word contains numbers from 0 to 9
            for (int a = 0; a < 10;  a++){
                if (word.contains(String.valueOf(a))){
                    notAWord = true;
                }
            }
            if (notAWord == true){
                System.out.println("Not a Word. ");
                i--;
            }
            switch (word){
                case "quit": case "exit":
                    i--;
                    break outer;
            }
        } while (i>=0);
        //prints number of words 
        System.out.println("\nYou wrote " + i + " words.");
        
        System.out.println("\nThank you for trying excercise #6.");
    }
    
    public static void exercise7(){
        clearScreen();
        System.out.println("This excercise prints the numbers from 1 to 7, restarting after every new number.");
        //outer for loop runs from 1 to seven, skips line after each iteration
        for (int i = 1; i < 8; i++){
            System.out.println("");
            //inner for loop runs for the value of the outer one, prints 'j'
            for (int j = 1; j < i+1; j++){
                System.out.print(j + " ");
            }
        }
        System.out.println("\n\nThank you for trying excercise #7.");
    }
    
    public static void exercise8(){
        clearScreen();
        System.out.println("This method prints the average of the numbers inputted by the user. ");
        
        Scanner input = new Scanner(System.in);
        List<Integer> userList = new ArrayList<>();
        boolean contLoop = true;
        int botNum = 0;
        int num = 0;
        do {
            System.out.println("Enter an integer (1111 to quit): ");
            //bulletproofing 
            try{
                num = input.nextInt();
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
                continue;
            }
            //case for breaking out of the do...while
            if (num != 1111){
                userList.add(num);}
            else{
                //adds user input up
                for (int i = 0; i < userList.size(); i++){
                    botNum += userList.get(i);
                }
                //finds average
                double value = (double)botNum/userList.size();
                //prints rounded average
                System.out.printf("Your average is: %.1f",value);
                contLoop=false;
            }
        } while (contLoop==true);
        
        System.out.println("\n\nThank you for trying excercise #8.");
    }
    
    public static void exercise9(){
        clearScreen();
        System.out.println("This excercise prints a value and its square in between the values chosen by the user. ");
        
        Scanner input = new Scanner(System.in);
        int startVal = 0;
        int endVal = 0;
        int incr = 0;
        //bulletproofed inputs for start, end values and increment
        do {
            System.out.println("Starting Value: ");
            try{
                startVal = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (startVal == 0);
        do {
            System.out.println("End Value: ");
            try{
                endVal = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (endVal == 0);
        do {
            System.out.println("Increment: ");
            try{
                incr = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (incr == 0);
        System.out.printf("\t%s\t%s\n", "Value", "Square");
        for (int i = startVal; i < endVal+1; i+=incr){
            //prints formatted values
            System.out.printf("\t%5d\t %5d\n", i, i*i);
        }
        
        System.out.println("\n\nThank you for trying excercise #9.");
    }
    
    public static void exercise10(){
        clearScreen();
        System.out.println("This excercise prints a random number between 2 numbers inputted the user.  ");
        
        Scanner input = new Scanner(System.in);
        //creates an object used to generate random values
        Random rand = new Random();
        //minimum and maximum value variables 
        int min = 0;
        int max = 0;
        //min and max variables given values (bulletproofed)
        do {
            System.out.println("Enter minimum value: ");
            try{
                min = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
            
        } while (min==0);
        do {
            System.out.println("Enter maximum value: ");
            try{
                max = input.nextInt();
                break;
            } catch (InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (max==0);
        System.out.println("Here are the random numbers: ");
        //loop runs 10 times
        for (int i=0; i<10; i++){
            //prints random integers between max and min seperated by comma
            System.out.print(""+(rand.nextInt(max+1-min) + min)+", ");
        }
        System.out.println("\nThank you for trying excercise #10.");
    }
    
    public static void exercise11(){
        clearScreen();
        System.out.println("This excercise prints out wether an input is an integer.  ");
        boolean contLoop = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Write 1111 to quit. ");
        //checks if value is an integer and if so, if it is 1111
        do {
            System.out.println("Enter an integer: ");
            try{
                int num = input.nextInt();
                if (num == 1111){
                    contLoop=false;
                }
            }
            catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Not an integer. ");
                continue;
            }
            System.out.println("It is an integer. ");
        }while(contLoop==true);
        
        System.out.println("\nThank you for trying excercise #11.");
    }
    
    public static void exercise12(){
        clearScreen();
        System.out.println("This excercise is for simulating a dice roll. \n");
        Scanner input = new Scanner(System.in);
        int runs = 0;
        int totalCount = 0;
        //creates an object used to generate random values
        Random rand = new Random();
        String contChoice = "a";
        do {
            int randNum = 0;
            //creates a random number between 1-6
            int point = rand.nextInt(6)+1;
            int count = 0;
            System.out.println("Your first roll and point value is: "+point);
            while (randNum!=point){
                count++;
                randNum = rand.nextInt(6)+1;
                System.out.println("Next roll is: "+randNum);
            }
            System.out.println("\nIt took "+count+" times to get your point again.\n\nDo you want to play again? (Y/N)");
            contChoice = input.nextLine();
            totalCount += count;
            runs++;
        } while (contChoice.toLowerCase().equals("y"));
        System.out.println("You played "+runs+" games with an average of: " + (double)totalCount/runs + " guesses.");
        
        System.out.println("\n\nThank you for trying excercise #12.");
    }
    
    public static void exercise13(){
        clearScreen();
        System.out.println("This excercise orders numbers given by the user and their sum.\n");
        Scanner input = new Scanner(System.in);
        //creates new ArrayList
        List<Integer> userList = new ArrayList<>();
        int sum = 0;
        int listLen = 0;
        boolean contLoop = true;
        //asks how many numbers you want in the list, bulletproofed 
        do {
            System.out.println("How many numbers do you want in the list? ");
            try{
                listLen = input.nextInt();
                break;
            }catch(InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        }while (listLen==0);
        //loops for the same amount as needed by the user
        for (int i = 0; i < listLen; i++){
            do {
                System.out.println("Enter an integer: ");
                try{
                    userList.add(input.nextInt());
                }catch(InputMismatchException e){
                    if (input.next().isEmpty()){
                        break;
                    }
                    i--;
                    System.out.println("Invalid Response. ");
                }
            contLoop = false;
            }while (contLoop==true);
        }
        //sorts the list
        Collections.sort(userList);
        //prints sorted list
        System.out.print("Here is your list of numbers sorted in ascending order: " + userList);
        //calculated sum of numbers in list
        for (int i: userList){
            sum += i;
        }
        System.out.println("\nAnd here is the sum of the inetegers in your list: " + sum);
        
        System.out.println("Thank you for trying excercise #13 ");
    }
    
    public static void exercise14(){
        clearScreen();
        System.out.println("This excercise converts a temperature from Celcius to Fahrenheit \n");
        Scanner input = new Scanner(System.in);
        boolean contLoop = true;
        double tempInC = 0.0;
        //bulletproofed input for the temperature in celcius
        do {
            System.out.println("Enter the temperature in celcius: ");
            try{
                tempInC = input.nextDouble();
                contLoop=false;
            }catch(InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (contLoop==true);
        //prints value in fahrenheit based on what is returned by the conversionFunc method
        System.out.printf("The temperature in Fahrenheit is: %5.1f",conversionFunc(tempInC));
        
        System.out.println("\nThank you for trying excercise #14 \n");
    }
    
    public static void exercise15(){
        clearScreen();
        System.out.println("This excercise prints a histogram based on user input. \n");
        boolean contLoop = true;
        Scanner input = new Scanner(System.in);
        //creates new ArrayList object 
        List<Integer> userList = new ArrayList<>();
        int numOfNums = 0;
        //bulletproofed, gets user input and stores it in numOfNums
        do {
            System.out.println("How many numbers do you want to enter?: ");
            try{
                numOfNums = input.nextInt();
                break;
            }catch(InputMismatchException e){
                if (input.next().isEmpty()){
                    break;
                }
                System.out.println("Invalid Response. ");
            }
        } while (numOfNums==0);
        //for loop runs for as many times as wanted by the user
        for (int i = 0; i < numOfNums; i++){
            //gets input and adds it to userList, bulletproofed
            do {
                System.out.println("Enter an integer: ");
                try{
                    userList.add(input.nextInt());
                    i--;
                }catch(InputMismatchException e){
                    if (input.next().isEmpty()){
                        break;
                    }
                    i-=2;
                    System.out.println("Invalid Response. ");
                }
                contLoop=false;
            } while (contLoop==true);
            i++;
        }
        //Skips line
        System.out.println("");
        //calls upon histogram method
        histogram(userList);
        
        System.out.println("\nThank you for trying excercise #15 \n");
    }
    

  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  boolean playAgain = true;
	  System.out.println("Welcome to the Java Test Questions. Answer the following question with 16 to close");
	  int userChoice = 0;
	  //outer to break out of do...while loop
	  outer: do{
	    System.out.println("\nWhat exercise do you want to run? (1-15) ");
	    //bulletproofed user input
	    try{
	        userChoice = input.nextInt();
	    } catch (InputMismatchException e){
	        if (input.next().isEmpty()){
                break;
            }
            System.out.println("Invalid Response. ");
            continue;
	    }
	    //switch statement to choose which exercise to run
	    switch (userChoice){
	       case 1: 
	            exercise1();
	            break;
	       case 2:
	           exercise2();
	           break;
	       case 3: 
	           exercise3();
	           break;
	       case 4:
	           exercise4();
	           break;
	       case 5:
	           exercise5();
	           break;
	       case 6:
	           exercise6();
	           break;
	       case 7:
	           exercise7();
	           break;
	       case 8:
	           exercise8();
	           break;
	       case 9:
	           exercise9();
	           break;
	       case 10:
	           exercise10();
	           break;
	       case 11:
	           exercise11();
	           break;
	       case 12:
	           exercise12();
	           break;
	       case 13:
	           exercise13();
	           break;
	       case 14:
	           exercise14();
	           break;
	       case 15:
	           exercise15();
	           break;
	       case 16:
	           //case for wanting to exit
	           System.out.println("Thank you for trying everything out! Have a great day.");
	           break outer;
	       default:
	           System.out.println("Invalid Response. ");
	           continue;
	    }
	  }while(true);
  }
}