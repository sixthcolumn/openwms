json.array!(@address_position_points) do |address_position_point|
  json.extract! address_position_point, :id, :address_id, :sequence, :xposition, :yposition, :zposition
  json.url address_position_point_url(address_position_point, format: :json)
end
