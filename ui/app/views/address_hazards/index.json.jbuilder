json.array!(@address_hazards) do |address_hazard|
  json.extract! address_hazard, :id, :address_id, :hazard_id
  json.url address_hazard_url(address_hazard, format: :json)
end
