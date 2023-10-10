package leetcodeProblames.stack_and_queues;

public class DynamicStack extends CustomStack {

	public DynamicStack() {
		super();
	}

	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int value) throws Exception {
		if (super.isFull()) {
			int[] temp = new int[this.data.length * 2];
			for (int i = 0; i < this.data.length; i++) {
				temp[i] = this.data[i];
			}
			data = temp;
		}

		return super.push(value);
	}
}
