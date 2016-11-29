json.array!(@packages_vendor_role_types) do |packages_vendor_role_type|
  json.extract! packages_vendor_role_type, :id, :package_id, :vendor_role_type_id
  json.url packages_vendor_role_type_url(packages_vendor_role_type, format: :json)
end
