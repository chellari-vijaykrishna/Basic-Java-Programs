package com.vj.music.Test;

import com.vj.music.Playable;
import com.vj.music.string.Venna;
import com.vj.music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Playable pb1 = new Venna();
		pb1.play();
		Playable pb2 = new Saxophone();
		pb2.play();
	}
	
}
