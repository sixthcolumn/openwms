json.array!(@proxy_interfaces) do |proxy_interface|
  json.extract! proxy_interface, :id, :interface_id, :proxy_url
  json.url proxy_interface_url(proxy_interface, format: :json)
end
