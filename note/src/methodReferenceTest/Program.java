package methodReferenceTest;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity entity = new Entity();
		entity.name = "돼지갈비";
		entityNaming(entity);
		System.out.println(entity.name);
		
	}
	
	static void entityNaming(Entity entity) {
		
		entity.name = "고갈비";
		
	}
	
	static Entity entityReturn(Entity entity) {
		entity.name = "소갈비";
		return entity;
	}

}
