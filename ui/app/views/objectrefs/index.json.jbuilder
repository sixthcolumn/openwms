json.array!(@objectrefs) do |objectref|
  json.extract! objectref, :id, :primary_name, :secondary_name, :noun, :object_guid, :utility, :registered_name, :system_name
  json.url objectref_url(objectref, format: :json)
end
