json.array!(@address_districts) do |address_district|
  json.extract! address_district, :id, :address_id, :district_id
  json.url address_district_url(address_district, format: :json)
end
