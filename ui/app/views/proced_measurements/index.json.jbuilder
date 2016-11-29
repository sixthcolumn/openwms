json.array!(@proced_measurements) do |proced_measurement|
  json.extract! proced_measurement, :id, :proced_id, :measurement_id
  json.url proced_measurement_url(proced_measurement, format: :json)
end
