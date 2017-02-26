json.array!(@nametypes) do |nametype|
  json.extract! nametype, :id, :name, :name_type_authority_id
  json.url nametype_url(nametype, format: :json)
end
