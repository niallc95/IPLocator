package IPLocate


class GeoipController {


	def index() {
		
	    String geoip = request.remoteAddr

		def location = geoIpService.getLocation(geoip)
			render location.countryName      
	}
}


