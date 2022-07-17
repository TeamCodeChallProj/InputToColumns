package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StreamsToColumns;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStreamsToColumns
{
	ArrayList<String> aList = new ArrayList<>(List.of(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}));
	ArrayList<ArrayList<String>> splitList = new ArrayList<>();
	{
		splitList.add(new ArrayList<>(List.of("a", "b", "c", "d", "e")));
		splitList.add(new ArrayList<>(List.of("f", "g", "h")));
	}
	
	@Test
	@DisplayName("Verify readStream is working.")
	void testReadStream() {
		assertEquals(StreamsToColumns.readStream(aList.stream(), 2), splitList);
	}
}
