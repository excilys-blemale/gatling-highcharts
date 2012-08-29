/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.component

import com.excilys.ebi.gatling.highcharts.template.RequestDetailsIndicatorTemplate

object RequestDetailsIndicatorComponent {

	def apply(global: Boolean) = {
		val template = new RequestDetailsIndicatorTemplate(global)

		new HighchartsComponent(template)
	}
}