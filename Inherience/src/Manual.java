
class Manual {


	public Manual(int x) {
	}

	public class ManualTesting {
		String process="QA";
		String model="Waterfall Model";
		
		
		ManualTesting(int x){
			
			System.out.println("ManualTesting- const");
		}
		
		void ManualTesting(){
			System.out.println("Method");
		}
		
		public void smokeTesting() {
			System.out.println("smokeTesting-"+process+"---"+model);
		}
		public void reTesting() {
			System.out.println("reTesting");
		}
		public void RegressionTesting() {
			System.out.println("RegressionTesting");
		}

	}

}
