json.array!(@vendor_roles) do |vendor_role|
  json.extract! vendor_role, :id, :name, :vendor_role_type_id
  json.url vendor_role_url(vendor_role, format: :json)
end
