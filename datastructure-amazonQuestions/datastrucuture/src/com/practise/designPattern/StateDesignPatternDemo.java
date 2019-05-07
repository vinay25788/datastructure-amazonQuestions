package com.practise.designPattern;

interface state
{
	public void doAction();
}

 class TvStartState implements state
{

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println(" tv started ");
	}
	
}
 
 
 class TvStopState implements state
 {
	 public void doAction()
	 {
		 System.out.println(" tv stoped ");
	 }
 }
 
 class TvContext implements state
 {

	 state st;
	 
	 public TvContext(state st) {
		 this.st =st;
	 }
	 
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		st.doAction();
	}
	 
 }
public class StateDesignPatternDemo {
	
	public static void main(String[] args) {
		TvStartState tstart = new TvStartState();
		TvStopState tstop = new TvStopState();
		TvContext cont = new TvContext(tstart);
		cont.doAction();
		cont = new TvContext(tstop);
		cont.doAction();
	}

}

