class ApplicationController < ActionController::Base

require "addressable/uri"

  # Prevent CSRF attacks by raising an exception.
  # For APIs, you may want to use :null_session instead.
  protect_from_forgery with: :exception

  helper_method :google_maps_url

  #GOOGLEMAPS_URL = ::Addressable::Template.new("http://maps.googlecom/maps{?q*}")
  GOOGLEMAPS_URL = ::Addressable::URI.parse("http://maps.google.com/maps/")


# google maps
  def google_maps_url(lat,lon, zoom)
    parameters = {}
    parameters["q"] = "#{lat},#{lon}"
    parameters["z"] = zoom
    GOOGLEMAPS_URL.query_values = parameters
    GOOGLEMAPS_URL.to_s

  end



end
