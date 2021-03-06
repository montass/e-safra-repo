package services.interfaces;

import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

import domain.Bus;
import domain.Line;
import domain.Station;

@Remote
public interface StationServicesRemote {
	Bus findBusById(Integer id);

	Station findStationById(Integer id);

	Boolean createLine(Line line, Map<Integer, Station> stations);

	Line findLineById(Integer id);

	List<Station> findStationsByLineIdBis(Integer id);

	List<Line> findLinesByStation(Integer idStation);

	List<Bus> findBusesByLineId(Integer idLine);

	List<Station> findAllPreviousStationsByStationId(Line line, Station station);

}
