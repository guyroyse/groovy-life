Feature: Game of Life

	Scenario: Cuke 4 Duke runs
		When I add 2 plus 2
		Then I get 4
	Scenario: Starting game of life
		Given that I want to play the game of life
		When I start playing
		Then there should be a board of size 100 by 100