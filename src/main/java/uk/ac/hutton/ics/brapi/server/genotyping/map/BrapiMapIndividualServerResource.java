package uk.ac.hutton.ics.brapi.server.genotyping.map;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.map.Map;

public interface BrapiMapIndividualServerResource
{
	BaseResult<Map> getMapById();
}
