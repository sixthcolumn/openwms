json.array!(@crew_names) do |crew_name|
  json.extract! crew_name, :id, :crew_id, :name, :name_type_id
  json.url crew_name_url(crew_name, format: :json)
end
