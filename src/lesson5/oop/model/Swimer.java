package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;



	
	public class Swimer extends Human implements AbstractAction{
		
		@Override
		public void Swiming() { 
			System.out.println( this.getName() + " is Swiming");
		}
		
		
	}}
