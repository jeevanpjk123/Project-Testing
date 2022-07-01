import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws InputMismatchException {
System.out.println("Please Enter a number between 1 and 9 to make a decision or 10 to Quit\n");
System.out.println("For regular and irregular shapes choose between 1 and 6 as shown below");
System.out.println("1 = Equilateral Triangle");
System.out.println("2 = Square");
System.out.println("3 = Pentagon");
System.out.println("4 = Hexagon\n");
System.out.println("5 = Rectangle");
System.out.println("6 = Circle\n");
System.out.println("For Solid shapes choose between 7 and 9 as shown below");
System.out.println("7 = Cube");
System.out.println("8 = Cylinder");
System.out.println("9 = Sphere\n");
System.out.println("Select 10 to Quit\n");
Scanner scan = new Scanner(System.in); // looks for and takes user input
loop: while (true) {// loop positioned here will allow flexibility of user decisions
int decision = scan.nextInt(); // user input will be in the form of integers
switch (decision) {// selection-based user input
case 1:
// Decision 1 Equilateral Triangle
System.out.println("You selected Equilateral Triangle"); // confirm user choice
System.out.println("Enter your number to represent the 3 sides in cm"); // Prompt user for input
double triSide = scan.nextDouble(); // get user input
double triPerm = triSide * 3; // input Times 3 will get the perimeter
//Below I am utilizing Herons Formula to obtain my Area
double triCalc = 1.0 / 2.0 * triPerm;
double triArea = Math.sqrt(triCalc * (triCalc - triSide) * (triCalc - triSide) * (triCalc - triSide));



//print out Perimeter and Area
System.out.println("Your perimeter is: " + triPerm + " cm \n your Area is: " + triArea + " Square centimeter");



break;
case 2:
// Decision 2 Square
System.out.println("You selected Square");
System.out.println("Enter your number to represent 1 side in cm");
double squareSide = scan.nextDouble();



double squarePerm = squareSide * 4; // get perimeter answer
double squareArea = squareSide * 2; // get Area answer



System.out.println(
"Your perimeter is: " + squarePerm + " cm \n your Area is: " + squareArea + " Square centimeter");



break;
case 3:
// Decision 3 Pentagon
System.out.println("You selected Pentagon");
System.out.println("Enter your number to represent the 5 sides in cm"); // prompt user for input
int penSide = scan.nextInt();



double penArea;
penArea = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(penSide, 2); // get Area answer



double penPerm = 5 * penSide; // get perimeter answer



System.out.println("Your perimeter is: " + penPerm + " cm \n your Area is: " + penArea + " Square centimeter");



break;
case 4:
// Decision 4 Hexagon
System.out.println("You selected Hexagon");
System.out.println("Enter your number to represent the 6 sides in cm");
double hexSide = scan.nextDouble();



double hexArea;
hexArea = (1.0 / 3.0) * Math.sqrt(6 * (5 + 2 * Math.sqrt(6))) * Math.pow(hexSide, 2); // get Area answer



double hexPerm = 6 * hexSide; // get perimeter answer



System.out.println("Your perimeter is: " + hexPerm + " cm \n your Area is: " + hexArea + " Square centimeter");



break;
case 5:
// Decision 5 Rectangle
System.out.println("You selected Rectangle");
System.out.println("Enter your First side Length number in cm"); // prompt user for 1st side length
double recSide1 = scan.nextDouble();
double recPerm1 = recSide1 * 2; // get the first 2 side numbers



System.out.println("Enter your Second side Length number in cm"); // prompt user for 2nd side length
double recSide2 = scan.nextDouble();
double recPerm2 = recSide2 * 2; // get the second 2 side numbers



double recArea = recSide1 * recSide2; // get Area answer
double recPermAnswer = recPerm1 + recPerm2; // get Perimeter answer



System.out.println(
"Your perimeter is: " + recPermAnswer + " cm \nyour Area is: " + recArea + "cm squared");



break;
case 6:
// Decision 6 Circle
System.out.println("You selected Circle");
System.out.println("Enter the radius for your circle in cm");
double radius = scan.nextDouble(); // prompt user for input



//calculation of circumference/perimeter below and get the answer
double circPerm = radius * Math.PI; // Part 1
double circumference = circPerm * 2; // part 2 and get answer



double circleArea = Math.PI * (radius * radius); // get Area of the circle



System.out.println("Your perimeter (circumference in this case) is: " + circumference
+ " cm \n your Area is: " + circleArea+ " Square centimeter");



break;
case 7:
// Decision 7 Cube
System.out.println("You selected Cube");
System.out.println("Enter your number to represent 1 side/edge of your Cube in cm");
double cubeSide = scan.nextDouble(); // prompt user for input



double cubeVol = cubeSide * cubeSide * cubeSide; // Get volume answer
int cubeSurf = (int) (6 * (cubeSide * cubeSide)); // Get Surface Area answer



//Print out Volume and Surface Area
System.out.println("Your Volume is: " + cubeVol + " cubic centimeter \n your Surface Area is: " + cubeSurf+" Square centimeter");



break;
case 8:
// Decision 8 Cylinder
System.out.println("You selected Cylinder");
System.out.println("Enter your Cylinder Radius in cm");
double cylinR = scan.nextDouble(); // User inputs Cylinder Radius



System.out.println("Now Enter your Cylinder Height in cm");
double cylinH = scan.nextDouble(); // User inputs Cylinder Height



double cylinVol = Math.PI * (cylinR * cylinR) * cylinH; // Get Volume



double cylinA = 2 * Math.PI * (cylinR * cylinR); // Part 1 of Cylinder Area calculation
double cylinB = 2 * Math.PI * cylinR * cylinH; // Part 2 of Cylinder Area calculation
double cylinSurf = cylinA + cylinB; // add both parts together to get Area answer



System.out.println("Your Volume is: " + cylinVol + " cubic centimeter \n your Surface Area is: " + cylinSurf+" Square centimeter");
break;
case 9:
// Decision 9 Sphere
System.out.println("You selected Sphere");
System.out.println("Enter your Radius in cm");
int sphereR = scan.nextInt();



double sphereVol = (4.0 / 3.0) * Math.PI * (sphereR * sphereR * sphereR); // get volume



double sphereSurf = 4 * Math.PI * (sphereR * sphereR); // get Area



System.out.println("your volume is: " + sphereVol + " cubic centimeter \n your Surface Area is: " + sphereSurf+" Square centimeter");



break;
case 10:
// Quit
System.out.println("You decided to Quit");
//Exit program
System.exit(0);



break loop;
default:
// Wrong decision
System.out.println("Select a number between 1 and 9 to make a decision or 10 to Quit");
}
}
}
}