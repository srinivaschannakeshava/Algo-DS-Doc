package com.srini.learning.algods.sap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KittensAccomodation2 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int bookingCount = s.nextInt();
			int noOfBeds = s.nextInt();
			List<BookingRecords> recordList = new ArrayList<>();
			for (int i = 0; i < bookingCount; i++) {
				recordList.add(new BookingRecords(s.nextInt(), s.nextInt()));
			}
			calculateMaxAccomodable(recordList, noOfBeds);
		}
	}

	public static void calculateMaxAccomodable(List<BookingRecords> bookings, int noOfBeds) {

		// sort based on hrs of stay
//		Instant start = Instant.now();
		Collections.sort(bookings, (BookingRecords o1, BookingRecords o2) -> {
			return o1.entryTime - o2.entryTime;
		});
		ArrayList<ArrayList<BookingRecords>> nonClashBookingList = createBucketsOfnonClashTime(bookings);
		Collections.sort(nonClashBookingList, (ArrayList a1, ArrayList a2) -> a2.size() - a1.size());
		Integer maxAcc = 0;
		for (List<?> a : nonClashBookingList.subList(0, noOfBeds)) {
			maxAcc = maxAcc + a.size();
		}

//		Integer maxAcc = nonClashBookingList.subList(0, noOfBeds).stream().map(buc -> buc.size()).reduce(0,
//				Integer::sum);
//		Instant finish = Instant.now();
//		long timeElapsed = Duration.between(start, finish).toMillis(); // in millis
//		System.out.println("==>" + timeElapsed);
		System.out.println(maxAcc);

	}

	private static ArrayList<ArrayList<BookingRecords>> createBucketsOfnonClashTime(List<BookingRecords> recordList) {

		boolean firstRun = true;
		ArrayList<ArrayList<BookingRecords>> bucketList = new ArrayList<>();

		for (BookingRecords br : recordList) {
			if (firstRun) {
				ArrayList<BookingRecords> bucket = new ArrayList<>();
				bucket.add(br);
				bucketList.add(bucket);
				firstRun = false;
			} else {
				boolean isAddedflag = false;
				for (List<BookingRecords> brList : bucketList) {
					BookingRecords brlastRec = brList.get(brList.size() - 1);
					if (brlastRec.exitTime > br.entryTime)
						continue;
					else {
						brList.add(br);
						isAddedflag = true;
					}
				}
				if (!isAddedflag) {
					ArrayList<BookingRecords> bucket = new ArrayList<>();
					bucket.add(br);
					bucketList.add(bucket);
				}
			}

		}
		return bucketList;
	}

}

class BookingRecords {
	int entryTime;
	int exitTime;

	public BookingRecords(int entryTime, int exitTime) {
		this.entryTime = entryTime;
		this.exitTime = exitTime;

	}

}
