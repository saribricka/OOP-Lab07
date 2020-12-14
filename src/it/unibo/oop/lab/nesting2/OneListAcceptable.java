package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T>{

	private final List<T> list;
	
	public OneListAcceptable(List<T> acceptedList) {
		this.list = acceptedList;
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			
			Iterator<T> iterator = OneListAcceptable.this.list.iterator();	//cause without iterator was saying "cannot converto from List<T> to Iterator<T>"

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(!iterator.next().equals(newElement) || !iterator.hasNext()) {
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(iterator.hasNext()) {
					throw new EndNotAcceptedException();
				}
				
			}
		};
	}

}

