
package simplilearn.animals;
public class Dog {
	private int weight;
	
	public void setWeight(int parameterWeight) {
		
		if (parameterWeight >0)
			weight = parameterWeight;
		else
			System.out.println("-ve hence weight is 0");
	
	
	
	}
	
	public int getWeight() {
		
	return weight;	
	}

}
