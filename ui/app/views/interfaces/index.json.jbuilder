json.array!(@interfaces) do |interface|
  json.extract! interface, :id, :name, :package_id, :proxy_flag, :required_flag, :vendor_role_type_id
  json.url interface_url(interface, format: :json)
end
