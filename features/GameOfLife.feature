Feature: Game of Life

	Scenario: Starting the game of life
		Given that I have launched the game of life
		When I set the dimensions to 100 by 100
		Then there should be a board of size 100 by 100
			And there are 0 cells on the board
		
	Scenario: Putting a cell on the board
		Given that I have an initialized board
		When I add a cell to the board at location 0,0
		Then there is 1 cell on the board 
		And there is a cell at location 0,0
		When I add another cell to the board at location 1,1
		Then there are 2 cells on the board
		And there is a cell at location 1,1