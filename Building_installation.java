package isp;

public class Building_installation {


	private int no_of_lifts;

	private int no_of_stairwells;

	private int smoke_proof_tower;

	private int no_of_entries;

	
	public Building_installation(int no_of_lifts, int no_of_stairwells, int smoke_proof_tower, int no_of_entries) {
		this.no_of_lifts = no_of_lifts;
		this.no_of_stairwells = no_of_stairwells;
		this.smoke_proof_tower = smoke_proof_tower;
		this.no_of_entries = no_of_entries;
	}
	
	
	public int getNo_of_lifts() {
		return no_of_lifts;
	}

	public int getNo_of_stairwells() {
		return no_of_stairwells;
	}

	public int getSmoke_proof_tower() {
		return smoke_proof_tower;
	}

	public int getNo_of_entries() {
		return no_of_entries;
	}
	
}