this.metaClass.mixin(cuke4duke.GroovyDsl)

When(~/^I add (\d+) plus (\d+)$/) { int num1, int num2 ->
  sum = num1 + num2
}

Then(~/^I get (\d+)$/) { int arg1 ->
  assert arg1 == sum
}

Given(~/^that I want to play the game of life$/) {
}

When(~/^I start playing$/) {
}

Then(~/^there should be a board of size (\d+) by (\d+)$/) { int height, int width ->
}