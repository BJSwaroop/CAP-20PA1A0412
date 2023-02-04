
import java.util.*;

class Dice{
    private int diceNumbers;
    private int numOfSix;
    private int max;
    private int min;
    public Dice(int diceNumbers,int numOfSix){
        this.diceNumbers = diceNumbers;
        this.numOfSix = numOfSix;
        this.max = this.diceNumbers*6;
        this.min = (int)(this.max/6);
    }
    public int rollDice(){
        return (int)(Math.random() * ((this.max-this.min) + 1)) + (this.min);
    }
    int getMaxDiceVal(){
        return this.max;
    }
    int getNumberOfSixes(){
        return this.numOfSix;
    }
}
class Board{
    private int max;
    Board(int max){
        this.max = max;
    }
    int getMaxBoardVal(){
        return this.max;
    }
}
class Player{
    private String name;
    private int pos;
    private boolean turn;
    Player(String n,int p){
        this.name = n;
        this.pos = p;
        this.turn = false;
    }
    void setPos(int p){
        this.pos = p;
    }
    int getPos(){
        return this.pos;
    }
    String getName(){
        return this.name;
    }
    boolean getTurn(){
        return this.turn;
    }
    void setTurn(boolean turn){
         this.turn = turn;
    }
}
class Jumpers{
    HashMap<Integer,Integer> map = new HashMap<>();
    Jumpers(){
        map.put(4, 25);
        map.put(13, 46);
        map.put(15, 69);
        map.put(74, 92);
        map.put(33, 49);
        map.put(42, 63); 
        map.put(62,81); 
        map.put(99,41); 
        map.put(76, 58); 
        map.put(66, 45); 
        map.put(89, 53); 
        map.put(54, 31);
        map.put(43,18);
    }
    HashMap<Integer,Integer> getJumps(){
        return this.map;
    }

}
class Game{
    private Board b;
    private Dice d;
    private Queue<Player> p;
    private HashMap<Integer,Integer> jumpers;
    int allWin;
    int[] count = {0};
    public Game(Queue<Player> playersQueue, HashMap<Integer, Integer> jumpers, Board board, Dice dice) {
        this.b = board;
        this.d = dice;
        this.p = playersQueue;
        this.allWin =  this.p.size();
        this.jumpers = jumpers;
    }
    public void startGame() {
        while(count[0] < 1){
            Player curr = this.p.poll();
            int rolldiceVal = this.d.rollDice();
            int currLoc = curr.getPos();
            // if(currLoc == 0 && rolldiceVal != 6)
            // TODO : you can write a function here to unlock the player until he makes a 6.
            int nextLoc = currLoc + rolldiceVal;
            if(curr.getTurn() == false){
                int nxt = getNextLoc(nextLoc,rolldiceVal,curr,currLoc,new int[]{0},this.count);
                curr.setPos(nxt);
                System.out.println(curr.getName() + " " + nxt);
            }
            this.p.add(curr);
        }
        System.out.println("Hurrayyyy The Game Is Finished!!!");
    }
    private int getNextLoc(int nextLoc, int rolldiceVal, Player curr, int currLoc,int[] numberofSixes,int[] countOfWins) {
        if(nextLoc == this.b.getMaxBoardVal()) {
            if(rolldiceVal == this.d.getMaxDiceVal()){
                return currLoc - numberofSixes[0]*this.d.getMaxDiceVal();
            }else{
                System.out.println("Player " + curr.getName() + " Won The Game with number " + (countOfWins[0] +1) + " Positon");
                curr.setTurn(true);
                countOfWins[0]++;
                return nextLoc;
            }
        }else if(nextLoc > this.b.getMaxBoardVal()){
            // System.out.println("Invalid Move!!!");
            return currLoc - numberofSixes[0]*this.d.getMaxDiceVal();
        }
        else{
            if(rolldiceVal == this.d.getMaxDiceVal()){
                numberofSixes[0]++;
                if(numberofSixes[0] != this.d.getNumberOfSixes()){
                    // System.out.println("You got another Chance Lets roll Once again.");
                    rolldiceVal = this.d.rollDice();
                    return getNextLoc(nextLoc + rolldiceVal, rolldiceVal, curr, nextLoc, numberofSixes,countOfWins);

                }
                else{
                    // System.out.println("Sorry You have enough Sixes getting back to your Previous Location.");
                    return currLoc - numberofSixes[0]*this.d.getMaxDiceVal();
                }
            }
            else if(jumpers.containsKey(nextLoc)){
                int finalPos = jumpers.get(nextLoc);
                if(finalPos > nextLoc){
                    nextLoc = finalPos; 
                    // System.out.print("Great You got a Ladder, your position is now and now rolling again : " + finalPos);
                    rolldiceVal = this.d.rollDice();
                    return getNextLoc(nextLoc + rolldiceVal, rolldiceVal, curr, nextLoc, numberofSixes,countOfWins);
                    // return nextLoc;
                }else{
                    nextLoc = finalPos; 
                    // System.out.print("Ufff You are bitten by snake, your position is: " + finalPos);
                    return nextLoc;
                }
            }
            else{
                return nextLoc;
            }
        }
    }
}
public class SnakeLadder {
    public static void main(String[] args) {
       
        System.out.println("********Welcomee to Snake And Ladders by Swaroop*******");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Board Size: ");
        int boardSize = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the number of Dices: ");
        int diceNumbers = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Number of Players: ");
        int playersTotal = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Player Names: ");
        Queue<Player> playersQueue = new LinkedList<>();
        for(int i=0;i<playersTotal;i++){
            String name = sc.nextLine();
            playersQueue.add(new Player(name, 0));
        }
        // System.out.println("If you wish to enter the Snakes and Ladders manually Press 1 else Press 2 to Start the Game.");
        // int userIn = Integer.parseInt(sc.nextLine());
        HashMap<Integer, Integer> jumpers = new HashMap<>();
        Jumpers j = new Jumpers();
        // if(userIn == 1){
        //     System.out.println("We are upgrading our code, For now lets continue with default Snakes and Ladders");
        //     // add arguments and take input for the snakes and ladders and put in the map finally print the map.
        //     j = new Jumpers();

        // }else{
        //     j = new Jumpers();
        // }
        jumpers = j.getJumps();
        System.out.print("Let's Start game -> Yes or No ");
        String userInStartGame = sc.nextLine();
        if(userInStartGame.equals("Yes")){
            Game g = new Game(playersQueue,jumpers,new Board(boardSize),new Dice(diceNumbers,3));
            g.startGame();
        }
        sc.close();
    }
}
