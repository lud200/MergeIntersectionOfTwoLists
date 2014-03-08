package Merge;

import java.io.*;
import java.util.*;
public class merge {
	public static void main(String args[]){
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(5);
		l2.add(1);
		l2.add(4);
		l2.add(3);
		l2.add(9);
		l2.add(2);
		HashMap h=new HashMap();
		HashMap h1=new HashMap();
		int n=l1.size()>l2.size()?l1.size():l2.size();
		for(int i=0;i<l1.size(); i++){
			h.put(l1.get(i), true);
		}
		for(int i=0; i<n; i++){
			if(h.containsKey(l2.get(i))){
				h1.put(l2.get(i), true);
			}
		}
		System.out.println(h1.keySet());
	}
}

