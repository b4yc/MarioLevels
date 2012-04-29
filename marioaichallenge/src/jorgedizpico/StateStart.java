package jorgedizpico;

public class StateStart implements LakituState {

	public StateStart() {
		super();
		// nothing needed here
	}

	@Override
	public LakituState transition() {
		// TODO Auto-generated method stub
		return new StateFlat();
	}

	@Override
	public int genesis(LakituBuilder lkb, int x) {
		// start state creates nothing
		return lkb.createStartPlug();
	}

}
