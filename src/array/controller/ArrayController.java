package array.controller;

import array.model.Array;

public class ArrayController
{

	private int ranNum;
	private String letter;
	private int[][] ranNums;
	private String[][] letters;
	private Array[][] weepAngel;
	private Array weepSize;

	public void start()
	{
		changeLetters();
		changeNumbers();
		changeAngelSize();
	}

	public ArrayController()
	{
		letter = "abcdefghijklmno";
		ranNum = 0;
		letters = new String[4][4];
		ranNums = new int[5][3];
		weepAngel = new Array[6][4];
		weepSize = new Array();
		fillTheNumArray();
		fillTheLetterArray();
		fillTheAngelSizeArray();
		
	}


	private void fillTheNumArray()
	{
		ranNums[0][0] = 0;
		ranNums[0][1] = 0;
		ranNums[0][2] = 0;
		ranNums[1][0] = 0;
		ranNums[1][1] = 0;
		ranNums[1][2] = 0;
		ranNums[2][0] = 0;
		ranNums[2][1] = 0;
		ranNums[2][2] = 0;
		ranNums[3][0] = 0;
		ranNums[3][1] = 0;
		ranNums[3][2] = 0;
		ranNums[4][0] = 0;
		ranNums[4][1] = 0;
		ranNums[4][2] = 0;
	}
	
	private void fillTheLetterArray()
	{
		for (int cord1 = 0; cord1 < letters.length; cord1++)
		{
			for (int cord2 = 0; cord2 < letters[0].length; cord2++)
			{
				letters[cord1][cord2] = "";
			}	
		}
	}
	private void changeLetters()
	{
		int num1 = 0;
		int num2 = 0;

		for (int cord1 = 0; cord1 < letters.length; cord1++)
		{
			for (int cord2 = 0; cord2 < letters[0].length; cord2++)
			{
				letters[cord1][cord2] = letter.substring(num1, num2);
				num1++;
				num2++;

			}

		}

	}

	private void changeNumbers()
	{
		int random = (int) (Math.random() * 100 + 1);
		ranNums[0][0] = random;
		ranNums[0][1] = random;
		ranNums[0][2] = random;
		ranNums[1][0] = random;
		ranNums[1][1] = random;
		ranNums[1][2] = random;
		ranNums[2][0] = random;
		ranNums[2][1] = random;
		ranNums[2][2] = random;
		ranNums[3][0] = random;
		ranNums[3][1] = random;
		ranNums[3][2] = random;
		ranNums[4][0] = random;
		ranNums[4][1] = random;
		ranNums[4][2] = random;
	}
	private void fillTheAngelSizeArray()
	{
		for (int cord1 = 0; cord1 < weepAngel.length; cord1++)
		{
			for (int cord2 = 0; cord2 < weepAngel[0].length; cord2++)
			{
				weepAngel[cord1][cord2] = weepSize;
			}

		}	
	}

	private void changeAngelSize()
	{
		for (int cord1 = 0; cord1 < weepAngel.length; cord1++)
		{
			for (int cord2 = 0; cord2 < weepAngel[0].length; cord2++)
			{
				weepAngel[cord1][cord2] = weepSize;
			}

		}
	}

	public int getRanNum()
	{
		return ranNum;
	}

	public String getLetter()
	{
		return letter;
	}

	public int[][] getRanNums()
	{
		return ranNums;
	}

	public String[][] getLetters()
	{
		return letters;
	}

	public void setRanNum(int ranNum)
	{
		this.ranNum = ranNum;
	}

	public void setLetter(String letter)
	{
		this.letter = letter;
	}

	public void setRanNums(int[][] ranNums)
	{
		this.ranNums = ranNums;
	}

	public void setLetters(String[][] letters)
	{
		this.letters = letters;
	}

}
