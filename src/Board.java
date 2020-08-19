import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Board {
    private Block [][] grid;
    private int size;

    // size is given to increase size of grid
    public Board(int size){
         grid=new Block[size][size];
         this.size=size;

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                grid[i][j]=new Block();
            }
        }
        randomize();
    }
    // this method randomise the grid to be
    private  void randomize(){
        Random random=new Random();
        int r=random.nextInt(size);
        int c=random.nextInt(size);

        grid[r][c].val=2;

        r=random.nextInt(size);
        c=random.nextInt(size);

        grid[r][c].val=2;



    }

    public void  push_up(){


        for (int i = 0; i <size ; i++) {
            Stack<Integer> stack=new Stack<>();
            for (int j = size-1; j >-1 ; j--) {
                if(grid[j][i].val!=0){
                    stack.push(grid[i][j].val);
                }



            }
            ArrayList<Integer> result=calculateBlocks(stack);
        }


    }

    public void  push_left(){


    }
    public void  push_down(){


    }
    public void  push_right(){


    }

    public ArrayList<Integer> calculateBlocks(Stack<Integer> stack ){

        int current=stack.pop();

        while(!stack.empty()){
            stack.pop();
        }

    }

    @Override
    public String toString() {
        String gridS="";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                gridS+=grid[i][j]+" ";
            }
            gridS+="\n";
        }
        return gridS;
    }
}
