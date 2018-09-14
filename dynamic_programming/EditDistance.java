
public class EditDistance {

	public static void main(String[] args) {

		String s1 = "abcdef";
		String s2 = "azced";
		
		char string1[] = s1.toCharArray();
		char string2[] = s2.toCharArray();
		int distance = stringDistance(string1,string2);
		System.out.println("The edit distance between the two string is:  "+ distance);

	}
	static int stringDistance(char s1[], char s2[]){
		
		int table[][] = new int[s1.length+1][s2.length+1];
		table[0][0] = 0;
		for(int i=1;i<table[0].length;i++){
			table[0][i] = i;
		}
		for(int j=1;j<table.length;j++){
			table[j][0] = j;
		}
		for(int i=1;i<table.length;i++){
			for(int j=1;j<table[0].length;j++){
				//choose minimum
				int minCost = Integer.MAX_VALUE;
				if(table[i-1][j-1]<minCost) minCost = table[i-1][j-1];
				if(table[i-1][j]<minCost) minCost = table[i-1][j];
				if(table[i][j-1]<minCost) minCost = table[i][j-1];
				
				//check if letter is same
				if(s1[i-1]==s2[j-1]){
					table[i][j] = minCost;
				}else{
					table[i][j] = minCost+1;
				}
			}
		}
		
		
		return table[s1.length][s2.length];
	}

}
