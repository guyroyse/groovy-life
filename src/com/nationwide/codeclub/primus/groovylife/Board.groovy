package com.nationwide.codeclub.primus.groovylife

class Board {
	
	private def height, width
	private def count = 0
	
	def init(height, width) {
		this.height = height
		this.width = width
		
	}
	
	def addCell(x, y) {
		count++
	}
	
	def getHeight() {
		return height; 
	}
	
	def getWidth() {
		return width;
	}
	
	def getCount(){
		return count	
	}
	
	def getCell(x, y){
		return true;
		
	}

}
