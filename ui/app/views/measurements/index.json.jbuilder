json.array!(@measurements) do |measurement|
  json.extract! measurement, :id, :type, :phases, :unit_multiplier, :unit_symbol
  json.url measurement_url(measurement, format: :json)
end
