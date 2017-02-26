json.array!(@districts) do |district|
  json.extract! district, :id, :type, :name, :code, :description
  json.url district_url(district, format: :json)
end
