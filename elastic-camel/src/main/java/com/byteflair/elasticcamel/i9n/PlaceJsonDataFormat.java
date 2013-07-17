package com.byteflair.elasticcamel.i9n;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.spi.DataFormat;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.byteflair.elasticcamel.model.Place;

public class PlaceJsonDataFormat implements DataFormat {

	@Autowired
	private ObjectMapper om;
	
	@Override
	public void marshal(Exchange exchange, Object graph, OutputStream stream) throws Exception {
		Place place = (Place)graph;
		
		StringBuilder buffer = new StringBuilder();
		
		Map<String, Object> convertedPlace = PlaceJsonDataFormat.convert(place);
		
		buffer.append("{\"index\":{\"_type\": \"place\", \"_id\":").append(convertedPlace.get("id")).append("}}\n");
		
		buffer.append(om.writer().writeValueAsString(convertedPlace)).append("\n");
		
		stream.write(buffer.toString().getBytes());
	}

	@Override
	public Object unmarshal(Exchange exchange, InputStream stream) throws Exception {
		return null;
	}
	
	public static Map<String, Object> convert(Place place) {
		Map<String, Object> convertedPlace = new HashMap<String, Object>();
		
		convertedPlace.put("id", place.getId());
		convertedPlace.put("name", place.getName());
		convertedPlace.put("type", place.getType());
		
		if (place.getLng() != null && place.getLat() != null) {
			convertedPlace.put("location", new double[] { place.getLng().doubleValue(), place.getLat().doubleValue() });
		} else {
			convertedPlace.put("location", new double[] {0.0, 0.0});
		}
		
		return convertedPlace;
	}
}