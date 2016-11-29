json.array!(@organization_names) do |organization_name|
  json.extract! organization_name, :id, :organization_id, :name, :name_type_id
  json.url organization_name_url(organization_name, format: :json)
end
