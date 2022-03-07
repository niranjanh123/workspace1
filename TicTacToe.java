package apas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	private static List<Integer> playerPosition  = new ArrayList<>();
	private static List<Integer> CPUPosition  = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] printBoard = {{' ','|',' ' ,'|',' '},
								{'-','+','-' ,'+','-'},
								{' ','|',' ' ,'|',' '},
								{'-','+','-' ,'+','-'},
								{' ','|',' ' ,'|',' '}};
		
		printBoard(printBoard);
		boolean flag= true;
		while(flag) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the valid position(1-9):");
			int playerPos = s.nextInt();
			while(playerPosition.contains(playerPos)||CPUPosition.contains(playerPos)) {
				System.out.println("Enter a valid position");
				playerPos = s.nextInt();
			}
			positionPiece(printBoard,playerPos,"Player");
			Random r = new Random();
			int cpuPos = r.nextInt(9)+1;
			while(CPUPosition.contains(cpuPos)||playerPosition.contains(cpuPos)) {
				 cpuPos = r.nextInt(9)+1;
			}
			positionPiece(printBoard,cpuPos,"CPU");
			String winner = Winner();
			if(winner.isEmpty())
				printBoard(printBoard);
			else
			{
				printBoard(printBoard);
				System.out.println(winner);
				flag=false;
			}
		}				
	}
	
	public static String Winner()
	{
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List lastRow = Arrays.asList(7,8,9);
		List topcol = Arrays.asList(1,4,7);
		List midcol = Arrays.asList(2,5,8);
		List lastcol = Arrays.asList(3,6,9);
		List diag1= Arrays.asList(1,5,9);
		List diag2 = Arrays.asList(3,5,7);
		
		List<List> winningPos = new ArrayList<List>();
		winningPos.add(topRow);
		winningPos.add(midRow);
		winningPos.add(lastRow);
		winningPos.add(topcol);
		winningPos.add(midcol);
		winningPos.add(lastcol);
		winningPos.add(diag1);
		winningPos.add(diag2);
		
		String res="";
		for(List l:winningPos)
		{
			
			if(playerPosition.containsAll(l))
				 res =  "Congratulation you have won the game!! :-)";
			else if(CPUPosition.containsAll(l))
				res =  "CPU has won the game!!Better luck next time :-(";
			else if(playerPosition.size()+ CPUPosition.size()==9)
				res =  "Its a tie!!";
		}
		return res;
		
		
	}
	public static void positionPiece(char[][] gameBoard,int pos,String player)
	{
		char symbol = ' ';
		if(player.equals("Player")) {
				symbol='X';
				playerPosition.add(pos);
			}
		else if(player.equals("CPU")){
				symbol='O';
				CPUPosition.add(pos);
		}
		switch(pos)
		{
			case 1: gameBoard[0][0]=symbol;
			break;
			case 2: gameBoard[0][2]=symbol;
			break;
			case 3: gameBoard[0][4]=symbol;
			break;
			case 4: gameBoard[2][0]=symbol;
			break;
			case 5: gameBoard[2][2]=symbol;
			break;
			case 6: gameBoard[2][4]=symbol;
			break;
			case 7: gameBoard[4][0]=symbol;
			break;
			case 8: gameBoard[4][2]=symbol;
			break;
			case 9: gameBoard[4][4]=symbol;
			break;
			default:
				break;
		}
	}
	public static void printBoard(char[][] printBoard)
	{
		for(char [] row:printBoard)
		{
			for(char e:row)
			{
				System.out.print(e);
			}
			System.out.println();
		}
	}

}
