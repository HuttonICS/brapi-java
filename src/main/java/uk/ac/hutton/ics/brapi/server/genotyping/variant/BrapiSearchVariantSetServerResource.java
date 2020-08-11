package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.variant.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchVariantSetServerResource extends IBaseServerResource<ArrayResult<VariantSet>>
{
	@Post
	BaseResult<ArrayResult<VariantSet>> postJson(VariantSetSearch search);
}
