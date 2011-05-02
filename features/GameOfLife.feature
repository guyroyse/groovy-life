Feature: Game of Life

	Scenario: Cuke 4 Duke runs
		When I add 2 plus 2
		Then I get 4
		
	Scenario: Starting game of life
		Given that I have launched the game of life
		When I set the dimensions to 100 by 100
		Then there should be a board of size 100 by 100