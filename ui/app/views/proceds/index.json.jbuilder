json.array!(@proceds) do |proced|
  json.extract! proced, :id, :instruction, :kind, :sequence
  json.url proced_url(proced, format: :json)
end
