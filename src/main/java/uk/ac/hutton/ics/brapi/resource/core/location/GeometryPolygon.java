package uk.ac.hutton.ics.brapi.resource.core.location;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class GeometryPolygon
{
	private String       type;
	private Double[][][] coordinates;
}
