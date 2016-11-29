json.array!(@hazards) do |hazard|
  json.extract! hazard, :id, :hazard_name
  json.url hazard_url(hazard, format: :json)
end
