package com.twoDimantionalArrays;

public class UnitMatrix {

		public static void main(String[] args) {
			int [][]a= {{10,0,0},{0,1,0},{0,0,10}};
			boolean status=true;
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					if(i!=j) {
						if(a[i][j]!=0) {
							status=false;
							break;
		
						}	
					}
					else {
						if(a[i][j]!=1) {
							status=false;
						}
					}
				}
			}
			if(status) {
				System.out.println("Unit Matrix");
			}else {
				System.out.println("Not a Unit Matrix");
			}

		}

	}



