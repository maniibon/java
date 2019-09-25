package Homework.Homework3;

public class Triangle {

    //always intialize variables first -- what makes the object what is (i.e. if your creating a "Dog" class, you would need
    //eyes, ears, tail, fur color, etc.

  int sideA;
  int sideB;
  int sideC;

  //this is a constructor. you use the variables you have established in the class to tell the computer how to construct this
    //object. you dont have to use them all, and you dont have to use any at all. you can have mutilple different kinds of
    //constructors, even empty ones.

    public Triangle(){

        //this is an empty constructor

    }
    public Triangle(int sideA){
        this.sideA = sideA;
    }

  public Triangle(int sideA, int sideB, int sideC ){
      this.sideA= sideA;
      this.sideB= sideB;
      this.sideC= sideC;

      //this is an overloaded constructor-- uses all variables available in the class

    }

    //this is a method -- what things you can do to THIS TYPE OF OBJECT
    public int getPerimeter(/*this is where your variables go that you need to complete the task*/){
      return sideA+sideB+sideC;
    //this is what you want the method to do. use the return statement to return things -- (obviously lol)
    //if you dont want to return anything, you can use "void"
    }

    public static void main(String[] args) {

        //this is how you run methods. they must always be inside the psvm if you want to print something to the terminal or
        //complete a task
        Triangle triangle=new Triangle(2,4,8);
        System.out.println(triangle.getPerimeter());
    }


}


