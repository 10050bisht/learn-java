
public class Anagram {

	public static void main(String[] args) {

				String str="tesm";
				String str1="esta";
				
				
				int counter=0;
				
				int counter1=0;
				if(str.length()==str1.length())
				{
					char ch[]=str.toCharArray();
					char ch1[]=str1.toCharArray();
					for(int i=0;i<str.length();i++)
					{
						for (int j=0;j<str1.length();j++)
						{
							if (ch[i]==ch1[j])
							{
								System.out.println(counter);
								counter++;
								counter1=counter-1;
								
							}
						
						}
						if(counter==counter1)
						{
							break;
						}
						
						
					}	
					
					if(counter==str1.length()){
						System.out.println("anagram");
					}
					else{
						System.out.println(" not anagram");
					}
				}
					//System.out.println(counter);
			}
}

