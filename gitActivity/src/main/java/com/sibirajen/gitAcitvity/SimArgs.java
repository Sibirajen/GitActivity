package com.sibirajen.gitAcitvity;

import java.io.IOException;
import java.net.URISyntaxException;

public class SimArgs {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		String[][] usernames = {
				{"Sibirajen"}
		};
		
		for(String[] username: usernames) {
			GitHubActivity.main(username);
		}
	}
}
