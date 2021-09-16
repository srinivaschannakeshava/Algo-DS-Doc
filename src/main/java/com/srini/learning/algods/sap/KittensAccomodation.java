package com.srini.learning.algods.sap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KittensAccomodation {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int bookingCount = s.nextInt();
			int noOfBeds = s.nextInt();
			List<BookingEntryExitRecord> recordList = new ArrayList<>();
			for (int i = 0; i < bookingCount; i++) {
				int entryTime = s.nextInt();
				int exitTime = s.nextInt();
				recordList.add(new BookingEntryExitRecord(entryTime, true, exitTime - entryTime));
				recordList.add(new BookingEntryExitRecord(entryTime, false, exitTime - entryTime));
			}
			calculateMaxAccomodable(recordList, noOfBeds);

		}
	}

	public static void calculateMaxAccomodable(List<BookingEntryExitRecord> recordEntryExitList, int noOfBeds) {

		int maxCount = 0, count = 0;
		// sort based on hrs of stay
		Collections.sort(recordEntryExitList, (BookingEntryExitRecord o1, BookingEntryExitRecord o2) -> {
			return o1.time - o2.time;
		});

		int maxCountInOut = getMaxCountOnInOut(noOfBeds, recordEntryExitList, maxCount, count);
		int maxCountLeastStay;

		System.out.println(maxCountInOut);
	}

	private static int getMaxCountOnInOut(int noOfBeds, List<BookingEntryExitRecord> recordEntryExitList, int maxCount,
			int count) {
		for (BookingEntryExitRecord br : recordEntryExitList) {
			if (br.isEntry) {
				count++;// accomodate the bed
				if (count <= noOfBeds)
					maxCount++;
				else
					count--;
			} else {
				count--;
			}

		}
		return maxCount;
	}

	private static int getMaxCountOnLeastStayTime(int noOfBeds, List<BookingRecord> recordList, int maxCount,
			int count) {
		BookingRecord currBooking = null;
		for (BookingRecord br : recordList) {
			if (currBooking == null) {
				currBooking = br;
				count++;
				maxCount++;

			} else {
				if (currBooking.exitTime > br.entryTime) {
					continue;
				} else if (count <= noOfBeds) {
					count++;
					maxCount++;

				}
			}

		}
		return maxCount;
	}

}

class BookingRecord {
	int entryTime;
	int exitTime;
	int timeOfStay;

	public BookingRecord() {
	}

	public BookingRecord(int entryTime, int exitTime) {
		this.entryTime = entryTime;
		this.timeOfStay = exitTime - entryTime;
		this.exitTime = exitTime;

	}

}

class BookingEntryExitRecord {
	int time;
	boolean isEntry;
	int timeOfStay;

	public BookingEntryExitRecord() {
	}

	public BookingEntryExitRecord(int time, boolean isEntry, int timeOfStay) {
		this.isEntry = isEntry;
		this.time = time;
		this.timeOfStay = timeOfStay;

	}

}
