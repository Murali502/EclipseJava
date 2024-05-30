package pattern;

public class You {
	
	public static HairCut_Criteria suggestAShop(String criteria) {

		if(criteria.equals("man")) {
			return new ForMale();
		}else {
			return new ForFemale();
		}
	}

}
