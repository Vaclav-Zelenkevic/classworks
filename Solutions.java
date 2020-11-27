package lt.vtmc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lt.itakademija.exam.FlightManager;
import lt.itakademija.exam.Passenger;
import lt.itakademija.exam.Plane;
import lt.itakademija.exam.SeatIsOccupiedException;
import lt.itakademija.exam.test.BaseTest;

public class Solutions extends BaseTest {

	@Override
	protected FlightManager createFlightManager() {
		return new FlightManager() {

			final List<Plane> planes = new ArrayList<>();
			final List<Passenger> passengers = new ArrayList<>();

			@Override
			public void registerPassenger(Plane plane, int seatNo, Passenger passenger) throws SeatIsOccupiedException {
				if (plane.isSeatOccupied(seatNo)) {
					throw new SeatIsOccupiedException();
				} else {
					plane.registerPassenger(seatNo, passenger);
				}
			}

			@Override
			public Plane getPlaneById(String id) {
				if (id.equals(null)) { // ???
					throw new IllegalArgumentException();
				} else {
					return planes.stream().filter(e -> e.getId().equals(id)).findFirst().get();
				}
			}

			@Override
			public List<Passenger> getPassengers(String planeId) {
				for (Plane element: planes) {
					if (element.getId().equals(planeId)) {
						return element.getPassengers();
					}
				}
				return null;
			}

			@Override
			public Passenger getOldestPassenger(String planeId) {
				for (Plane element: planes) {
					if (element.getId().equals(planeId)) {
						return element.getPassengers().stream().max(Comparator.comparingInt(Passenger::getAge)).get();
					}
				}
				return null;
			}

			@Override
			public List<Plane> getCreatedPlanes() {
				return planes;
			}

			@Override
			public double getAveragePassengerAge(String planeId) {
				double ageAverage = 0.0;
				for (Plane element: planes) {
					if (element.getId().equals(planeId)) {
						ageAverage = element
								.getPassengers()
								.stream()
								.mapToInt(Passenger::getAge)
								.average()
								.getAsDouble();
					}
				}
				return ageAverage;
			}

			@Override
			public Plane createPlane(String id, int seats) {
				if (id == null) {
					throw new NullPointerException();
				} else if (seats <= 0) {
					throw new IllegalArgumentException();
				} else if (id.equals("")) {
					throw new IllegalArgumentException();
				} else {
					Plane plane = new Plane(id, seats);
					planes.add(plane);
					return plane;
				}
			}

			@Override
			public Passenger createPassenger(String name, String surname, int age) {
				if (name == null || surname == null) {
					throw new NullPointerException();
				} else if (age == 0) {
					throw new NullPointerException();
				} else if (name.equals("") || surname.equals("")) {
					throw new IllegalArgumentException();
				} else {
					Passenger passenger = new Passenger(name, surname, age);
					passengers.add(passenger);
					return passenger;
				}
			}
		};
	}

}
