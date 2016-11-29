json.array!(@material_item_names) do |material_item_name|
  json.extract! material_item_name, :id, :material_item_id, :name, :name_type_id
  json.url material_item_name_url(material_item_name, format: :json)
end
