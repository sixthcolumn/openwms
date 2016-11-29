require "addressable/template"

module ExternalUrlBuilder


# google maps
  GOOGLEMAPS_URL = ::Addressable::Template.new("http://maps.googlecom/maps{?q*}")

  # ...

  def google_maps_url(latlon, zoom)
    GOOGLEMAPS_URL.expand(q: latlon, z: zoom).to_s
  end

end

