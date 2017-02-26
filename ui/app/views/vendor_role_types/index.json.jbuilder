json.array!(@vendor_role_types) do |vendor_role_type|
  json.extract! vendor_role_type, :id, :name, :active_flag
  json.url vendor_role_type_url(vendor_role_type, format: :json)
end
