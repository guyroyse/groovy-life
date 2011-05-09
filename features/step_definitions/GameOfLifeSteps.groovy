import com.nationwide.codeclub.primus.groovylife.Board

this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~/^that I have launched the game of life$/) {
	board = new Board()
}

When(~/^I set the dimensions to (\d+) by (\d+)$/) { int height, int width ->
	board.init height, width
}

Then(~/^there should be a board of size (\d+) by (\d+)$/) { int height, int width ->
	assert height == board.height
	assert width == board.width
}

Given(~/^that I have an initialized board$/) {
	board = new Board()
	board.init 3,3
}	

When(~/^I add a(?:|nother) cell(?:|s) to the board at location (\d+),(\d+)$/) { int x, int y ->
	board.addCell(x, y)
}

Then(~/^there (?:|is|are) (\d+) cell(?:|s) on the board$/) { int count ->
	assert board.count == count
}

Then(~/^there is a cell at location (\d+),(\d+)$/) { int x, int y ->
	assert board.getCell(x,y) == true
}
