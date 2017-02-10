package org.springframework.samples.mvc.midi;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  
 * The controller class name should be unique in application.<br/>
 * So we add prefix 'Midi'
 * @author Midi_Kang
 */
@Controller
public class MidiMappingController {

	@RequestMapping(value="/midi/zoneJson", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Zone produceZoneJson() {
		return new Zone();
	}
	
	@RequestMapping(value="/midi/zoneXml", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Zone produceZoneXml() {
		return new Zone();
	}
}
