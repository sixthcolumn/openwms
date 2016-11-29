json.array!(@name_type_authorities) do |name_type_authority|
  json.extract! name_type_authority, :id, :name, :description
  json.url name_type_authority_url(name_type_authority, format: :json)
end
