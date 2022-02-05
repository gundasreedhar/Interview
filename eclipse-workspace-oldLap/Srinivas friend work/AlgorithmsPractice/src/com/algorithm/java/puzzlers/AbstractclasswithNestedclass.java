package com.algorithm.java.puzzlers;

public class AbstractclasswithNestedclass {

	abstract class DDD {
		abstract void m();
	}

	protected class ABC {
		protected int i = 0;

	}

	private class MMM {

		void tg() {

		}

	}

	public AbstractclasswithNestedclass() {
		ABC abc = new ABC();
		abc.i = 1;
	}

}

class Sub extends AbstractclasswithNestedclass {

	public Sub() {
		ABC abc = new ABC();
		abc.i = 5;

		DDD dd = new DDD() {

			@Override
			void m() {

				System.out.println("Reference of DDD created !! ");
			}
		};

		// Not possible due to private declaration of MMM
		// MMM mmm = new MMM();
	}

}
